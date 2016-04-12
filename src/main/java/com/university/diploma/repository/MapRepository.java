package com.university.diploma.repository;

import com.university.diploma.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dima on 2/20/16.
 */
@Repository
@Transactional
public interface MapRepository extends JpaRepository<Base,Integer> {

    @Query(value = "SELECT * from allTable  where (select  ST_Distance_Spheroid(a, b, 'SPHEROID[\"GRS 1980\",6378137,298.257222101]')\n" +
            "                               FROM(VALUES(st_point(?1,?2), st_point(cast(lat as FLOAT),cast(lng AS FLOAT))))\n" +
            "                                 AS query (a, b))<=500" ,
            nativeQuery = true)
    List<Base> getBaseCoordinates(float lat,float lng);
}
