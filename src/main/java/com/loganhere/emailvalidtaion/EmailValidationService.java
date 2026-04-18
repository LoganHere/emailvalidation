package com.loganhere.emailvalidtaion;

import org.springframework.stereotype.Service;

@Service
public class EmailValidationService {

    public boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@");
    }
}
