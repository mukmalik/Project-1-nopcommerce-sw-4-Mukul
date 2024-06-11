package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility
{
    By verifyNokiaLumia = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyPrice = By.xpath("//span[contains(text(),' $349.00 ')]");
    By changeQuantity2 = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyProductAdded = By.xpath("//p[@class='content']");
    By closeAlert = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");

    public String getVerifyNokiaLumia() {
        return getTextFromElement(verifyNokiaLumia);
    }

    public String getVerifyPrice() {
        return getTextFromElement(verifyPrice);
    }

    public void sendChangeQuantity2() {
        sendTextToElement(changeQuantity2, Keys.BACK_SPACE + "2");
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public String getVerifyProductAdded() {
        return getTextFromElement(verifyProductAdded);
    }

    public void clickCloseAlert() {
        clickOnElement(closeAlert);
    }

    public void clickShoppingCart() {
        clickOnElement(shoppingCart);
    }
}
