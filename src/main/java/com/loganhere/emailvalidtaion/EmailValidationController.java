package com.loganhere.emailvalidtaion;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailValidationController {

    private final EmailValidationService validationService;

    public EmailValidationController(EmailValidationService validationService) {
        this.validationService = validationService;
    }

    @PostMapping("/validate")
    public EmailValidationResponse validateEmail(@RequestBody EmailValidateRequest request) {
        return new EmailValidationResponse(validationService.validateEmail(request.getEmail()));
    }
}
