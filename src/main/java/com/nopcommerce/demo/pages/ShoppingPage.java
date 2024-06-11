package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ShoppingPage extends Utility
{
    By verifyTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By addQuantity = By.xpath("(//input[contains(@id, 'itemquantity')])");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By verifySubTotal = By.xpath("//span[@class='product-subtotal']");
    By checkBox = By.xpath("//label[contains(text(),'I agree with the terms of service and I adhere to ')]");
    By checkOut = By.xpath("//button[@id='checkout']");
    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By verifyShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyQuantity2 = By.xpath("//span[contains(text(),'(2)')]");
    By verifyNokiaSubTotal = By.xpath("//span[@class='product-subtotal']");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkOutNokia = By.xpath("//button[@id='checkout']");
    By verifyNokiaShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsOfServiceNokia = By.xpath("//input[@id='termsofservice']");
    By checkOutNokiaShopping = By.xpath("//button[@id='checkout']");

    public String getVerifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }

    public void getAddQuantity() {
        sendTextToElement(addQuantity, Keys.BACK_SPACE + "2");
    }

    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }

    public String getVerifySubTotal() {
        return getTextFromElement(verifySubTotal);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String getWelcomeMessage() {
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    public String getVerifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }

    public String getVerifyQuantity2() {
        return getTextFromElement(verifyQuantity2);
    }

    public String getVerifyNokiaSubTotal() {
        return getTextFromElement(verifyNokiaSubTotal);
    }

    public void clickTermsOfService() {
        clickOnElement(termsOfService);
    }

    public void clickCheckOutNokia() {
        clickOnElement(checkOutNokia);
    }

    public String getVerifyNokiaShoppingCart() {
        return getTextFromElement(verifyNokiaShoppingCart);
    }

    public void clickTermsOfServiceNokia() {
        clickOnElement(termsOfServiceNokia);
    }

    public void clickCheckOutNokiaShopping() {
        clickOnElement(checkOutNokiaShopping);
    }
}

