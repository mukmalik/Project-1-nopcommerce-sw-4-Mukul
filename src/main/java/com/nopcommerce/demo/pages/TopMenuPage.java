package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility

{
    By computersTab = By.linkText("Computers");
    By verifyComputerTab = By.linkText("Computers");
    By electronicsTab = By.linkText("Electronics");
    By verifyElectronicsTab = By.linkText("Electronics");
    By apparelTab = By.linkText("Apparel");
    By verifyApparelTab = By.linkText("Apparel");
    By digitalDownloadsTab = By.linkText("Digital downloads");
    By verifyDigitalDownloadsTab = By.linkText("Digital downloads");
    By booksTab = By.linkText("Books");
    By verifyBooksTab = By.linkText("Books");
    By jewelryTab = By.linkText("Jewelry");
    By verifyJewelryTab = By.linkText("Jewelry");
    By giftCardTab = By.linkText("Gift Cards");
    By verifyGiftCardTab = By.linkText("Gift Cards");

    public void clickOnComputerTab() {
        clickOnElement(computersTab);
    }

    public String getVerifyComputerTab() {
        return getTextFromElement(verifyComputerTab);
    }

    public void clickOnElectronicsTab() {
        clickOnElement(electronicsTab);
    }

    public String getVerifyElectronicsTab() {
        return getTextFromElement(verifyElectronicsTab);
    }

    public void clickOnApparelTab() {
        clickOnElement(apparelTab);
    }

    public String getVerifyApparelTab() {
        return getTextFromElement(verifyApparelTab);
    }

    public void clickOnDigitalDownloadsTab() {
        clickOnElement(digitalDownloadsTab);
    }

    public String getVerifyDigitalDownloadsTab() {
        return getTextFromElement(verifyDigitalDownloadsTab);
    }

    public void clickOnBooksTab() {
        clickOnElement(booksTab);
    }

    public String getVerifyBooksTab() {
        return getTextFromElement(verifyBooksTab);
    }

    public void clickOnJewelryTab() {
        clickOnElement(jewelryTab);
    }

    public String getVerifyJewelryTab() {
        return getTextFromElement(verifyJewelryTab);
    }

    public void clickOnGiftCardTab() {
        clickOnElement(giftCardTab);
    }

    public String getVerifyGiftCardTab() {
        return getTextFromElement(verifyGiftCardTab);
    }


}
