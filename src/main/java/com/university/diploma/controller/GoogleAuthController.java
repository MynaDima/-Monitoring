package com.university.diploma.controller;

import com.university.diploma.model.User;
import com.university.diploma.service.UserService;
import com.university.diploma.service.impl.Google2Api;
import com.university.diploma.service.mail.SenderService;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import java.util.logging.Logger;

import static org.springframework.web.context.request.RequestAttributes.SCOPE_SESSION;

/**
 * Created by dima on 07.04.16.
 */
@Controller
public class GoogleAuthController {

    private Logger logger = Logger.getLogger(String.valueOf(GoogleAuthController.class));

    @Autowired
    UserService userService;

    @Autowired
    SenderService senderService;

    private static final String NETWORK_NAME = "Google";

    private static final String PROTECTED_RESOURCE_URL = "https://www.googleapis.com/oauth2/v2/userinfo?alt=json";

    private static final String SCOPE = "https://mail.google.com/ https://www.googleapis.com/auth/userinfo.email";

    private static final Token EMPTY_TOKEN = null;

    String apiKey = "607878946722-n5t0200v51squt3gddbljieub342qo2r.apps.googleusercontent.com";
    String apiSecret = "kKltWAj-rPWOYImG2OXiPyOa";
    String callbackUrl = "http://localhost:8080/googlecallback";

    OAuthService service = new ServiceBuilder().provider(Google2Api.class)
            .apiKey(apiKey).apiSecret(apiSecret).callback(callbackUrl)
            .scope(SCOPE).build();


    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public String googleAuth(WebRequest request) {
        Token accessToken = (Token) request.getAttribute("ATTR_OAUTH_ACCESS_TOKEN", SCOPE_SESSION);
        if (accessToken == null) {
            String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
            logger.info(authorizationUrl);
            logger.info("ololo1");
            User u = new User();
            senderService.send(u);
            return "redirect:" + authorizationUrl;
        }
        return "user";
    }


    @RequestMapping(value = {"/googlecallback"}, method = RequestMethod.GET)
    public String callBack(@RequestParam("code") String oauthVerifier) {

        Verifier verifier = new Verifier(oauthVerifier);

        Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);

        OAuthRequest oauthRequest = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL);
        service.signRequest(accessToken, oauthRequest);
        Response response = oauthRequest.send();
//
//        JSONParser parser = new JSONParser();
//
//        Object obj = null;
//
//        try {
//            obj = parser.parse(response.getBody().toString());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        logger.info((response.getBody().toString()));
//        JSONObject jsonObj = (JSONObject) obj;
//        logger.info((String) jsonObj.get("id"));
//        logger.info((String) jsonObj.get("email"));
//
//        String id = (String) jsonObj.get("id");
//        String email = (String) jsonObj.get("email");

//        User user = new User();
//        user.setLogin(email);
//        user.setEmail(email);
//        user.setSocialId(id);
//
//        User u = userService.getUserBySocialId(id);
//
////        userService.addUser(user);
//
//        if(u.getSocialId().equals(id)){
////            userService.addUser(user);
////            logger.info("addUsr");
//            return "redirect:/user";
//        }else {
//            logger.info("redir");
//        }

        return "redirect:/user";
    }



}
