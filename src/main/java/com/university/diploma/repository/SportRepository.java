package com.university.diploma.repository;

import com.university.diploma.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 1/7/16.
 */
@Repository
public interface SportRepository extends JpaRepository<Sport, Integer> {
}
