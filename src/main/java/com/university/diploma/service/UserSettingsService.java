package com.university.diploma.service;

import com.university.diploma.model.UserSettings;

/**
 * Created by dima on 3/1/16.
 */
public interface UserSettingsService {

    UserSettings getUserSettings(Integer id);

    UserSettings setUserSettings(UserSettings userSettings);

}
