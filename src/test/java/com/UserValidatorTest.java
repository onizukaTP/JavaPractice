package com;

import com.javapractice.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Abhisheak");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenGivenSpCharsShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Abhishe@k");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailWhenValidShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("abhisheak@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("BS");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("BS12");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumberWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("A@bhisheak2");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenNotProperShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("abhisheak");
        Assert.assertFalse(result);
    }
}
