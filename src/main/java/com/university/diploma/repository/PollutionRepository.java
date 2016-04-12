package com.university.diploma.repository;

import com.university.diploma.model.PollutionPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 3/21/16.
 */

@Repository
public interface PollutionRepository extends JpaRepository<PollutionPlace,Integer> {

}
