package com.university.diploma.service.impl;

import com.university.diploma.model.UserSettings;
import com.university.diploma.repository.UserSettingsRepository;
import com.university.diploma.service.UserSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 3/1/16.
 */
@Service
public class UserSettingsServiceImpl implements UserSettingsService{

    @Autowired
    private UserSettingsRepository userSettingsRepository;

    @Override
    public UserSettings getUserSettings(Integer id) {
        return userSettingsRepository.findOne(id);
    }

    @Override
    public UserSettings setUserSettings(UserSettings userSettings) {
       return userSettingsRepository.save(userSettings);
    }

}
