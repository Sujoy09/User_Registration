package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhileProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Sujoy");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("Roy");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.emailId("roysujoy@gmail.com");
        Assert.assertTrue(result);
    }

    @org.junit.Test
    public void givenPhoneNumber_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.phoneNumber("91 9999999999");
        Assert.assertTrue(result);
    }

    @org.junit.Test
    public void givenPassword_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.password("Sujoy@1234");
        Assert.assertTrue(result);
    }


    @org.junit.Test
    public void givenFirstName_WhileNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.firstName("sujoy");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenLastname_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastName("roy");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenEmail_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailId("sujoy@roy@gmail.com");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenEmail_WhenNotProper_ThrowsException1() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailId("sujoy.@roy@gmail.co.in");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenPhoneNumber_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.phoneNumber("9923154919");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenPhoneNumber_WhenNotProper_ThrowsException1() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.phoneNumber("99 231919");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void givenPassword_WhenNotProper_ThrowsException1()  {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.password("sujoy@12234");
            Assert.assertFalse(result);
        } catch (UserRegistrationException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
