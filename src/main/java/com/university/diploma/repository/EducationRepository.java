package com.university.diploma.repository;

import com.university.diploma.model.Education;
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
public interface EducationRepository extends JpaRepository<Education, Integer> {

    @Query(value = "SELECT id, address, number, lat, lng, type FROM education " +
            "where education.type = ?1 and lat <>'null' " ,
            nativeQuery=true)
    List<Education> getByType(String type);

}
