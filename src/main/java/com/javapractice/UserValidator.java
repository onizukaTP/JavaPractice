package com.javapractice;

import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{0,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]{3,}@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
    private static final String MOBILE_PATTERN = "^91 [0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
