package com.university.diploma.repository;

import com.university.diploma.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dima on 2/20/16.
 */
@Repository
@Transactional
public interface MapRepository extends JpaRepository<Base,Integer> {

    @Query(value = "SELECT * FROM allTable" +
            " where ST_Distance_Sphere( st_point(?1,?2), st_point(cast(lat as FLOAT),cast(lng AS FLOAT))) <= '30000' " ,
            nativeQuery=true)
    List<Base> getBaseCoordinates(float lat,float lng);
}
