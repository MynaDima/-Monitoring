package com.university.diploma.repository;

import com.university.diploma.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dima on 1/7/16.
 */
@Repository
@Transactional
public interface AutoRepository extends JpaRepository<Auto, Integer> {

    @Query(value = "SELECT id, address, number, lat, lng, type FROM auto " +
            "where auto.type = ?1 and lat <>'null' " ,
            nativeQuery=true)
   List<Auto> getByType(String type);
}
