package com.university.diploma.repository;

import com.university.diploma.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dima on 1/7/16.
 */
@Repository
@Transactional
public interface AutoRepository extends JpaRepository<Auto, Integer> {
}
