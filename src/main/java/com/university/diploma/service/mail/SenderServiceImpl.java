package com.university.diploma.service.mail;

import com.university.diploma.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dima on 09.04.16.
 */
@Service
public class SenderServiceImpl implements SenderService {

    private static Sender tlsSender = new Sender("dmytromyna@gmail.com", "3921555Op");

    @Override
    public void send(User user) {
        tlsSender.send("ADMEN", "ADMEN ADMEN", "admen@nc.kpi.ua", "dmytromyna@gmail.com");
    }

    @Override
    public void send(List<User> userList) {

    }
}
