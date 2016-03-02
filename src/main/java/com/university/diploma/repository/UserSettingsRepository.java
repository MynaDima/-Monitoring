package com.university.diploma.repository;

import com.university.diploma.model.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dima on 3/1/16.
 */
@Repository
@Transactional
public interface UserSettingsRepository extends JpaRepository<UserSettings, Integer> {

}
