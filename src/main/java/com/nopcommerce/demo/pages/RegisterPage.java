package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility
{
    By verifyWelcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By register = By.xpath("//button[contains(text(),'Register')]");
    By verifyRegister = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.xpath("//button[@id='register-button']");
    By verifyRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueShopping = By.xpath("//a[contains(text(),'Continue')]");

    public String getVerifyWelcomeMessage() {
        return getTextFromElement(verifyWelcomeMessage);
    }

    public void clickRegister() {
        clickOnElement(register);
    }

    public String getVerifyRegister() {
        return getTextFromElement(verifyRegister);
    }

    public void enterFirstName() {
        sendTextToElement(firstNameField, "Abc");
    }

    public void enterLastName() {
        sendTextToElement(lastNameField, "Xyz");
    }

    public void enterEmail() {
        sendTextToElement(emailField, "testn123@gmail.com");
    }

    public void enterPassword() {
        sendTextToElement(passwordField, "abc123");
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPasswordField, "abc123");
    }

    public void clickRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getVerifyRegistrationCompleted() {
        return getTextFromElement(verifyRegistrationCompleted);
    }

    public void clickContinueShopping() {
        clickOnElement(continueShopping);
    }
}

