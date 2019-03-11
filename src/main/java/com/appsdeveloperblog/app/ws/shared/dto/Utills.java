package com.appsdeveloperblog.app.ws.shared.dto;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utills {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String genereateUserId(int len){
        return genereateRandomString(len);
    }

    public String genereateRandomString(int len){
        StringBuilder returnValue = new StringBuilder(len);

        for (int i = 0; i < len; i++){
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(returnValue);
    }
}
