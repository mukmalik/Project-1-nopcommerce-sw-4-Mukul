package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase
{
    DesktopPage desktopPage = new DesktopPage();
    HomePage homePage = new HomePage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()
    {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputer();
        //1.2 Click on Desktop
        homePage.clickOnDeskTop();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortByZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifyDescendingOrder();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully()
    {
        //2.1 Click on Computer Menu
        homePage.clickOnComputer();
        //2.2 Click on Desktop
        homePage.clickOnDeskTop();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortByAtoZ();
        //2.4 Click on "Add To Cart
        desktopPage.clickBuildYourOwnComputer();
        //2.5 Verify the Text "Build your own computer"
        Assert.assertEquals(buildYourOwnComputerPage.verifyHeaderMessage(), "Build your own computer");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class
        buildYourOwnComputerPage.selectRAM();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectHDD();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectOS();
        buildYourOwnComputerPage.selectSoftwareTotalCommander();
        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals(buildYourOwnComputerPage.getVerifyPrice(), "$1,475.00");
        //2.12 Click on "ADD TO CART" Button.
        buildYourOwnComputerPage.clickOnAddToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        buildYourOwnComputerPage.getVerifyConfirmationText();
        buildYourOwnComputerPage.clickCloseAlert();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        buildYourOwnComputerPage.hoverOnShoppingCart();
        //2.15 Verify the message "Shopping cart"
        buildYourOwnComputerPage.clickOnGoToCart();
        Assert.assertEquals(shoppingPage.getVerifyTextShoppingCart(), "Shopping cart");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingPage.getAddQuantity();
        shoppingPage.clickOnUpdateCart();
        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingPage.getVerifySubTotal(), "$2,950.00");
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingPage.clickOnCheckBox();
        //2.19 Click on “CHECKOUT”
        shoppingPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(shoppingPage.getWelcomeMessage(), "Welcome, Please Sign In!");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        shoppingPage.clickOnCheckOutAsGuest();
        //2.22 Fill the all mandatory field
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterCountry();
        checkoutPage.enterCity();
        checkoutPage.enterAddress1();
        checkoutPage.enterZipPostalCode();
        checkoutPage.enterPhoneNumber();
        //2.23 Click on “CONTINUE”
        checkoutPage.clickOnContinue();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.clickNextDayAir();
        //2.25 Click on “CONTINUE”
        checkoutPage.clickOnContinueAir();
        //2.26 Select Radio Button “Credit Card”
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnContinueCard();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.selectMasterCard();
        //2.28 Fill all the details
        checkoutPage.enterCardHolderName();
        checkoutPage.enterCardNumber();
        checkoutPage.enterExpiryMonth();
        checkoutPage.enterExpiryYear();
        checkoutPage.enterCardCode();
        //2.29 Click on “CONTINUE”
        checkoutPage.clickOnContinueCheckout();
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkoutPage.getVerifyCreditCardMethod(), "Credit Card");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkoutPage.getVerifyShippingMethod(), "Next Day Air");
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkoutPage.getVerifyTotal(), "$2,950.00");
        //2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirm();
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkoutPage.getVerifyThankYou(), "Thank you");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutPage.getVerifySuccessMessage(), "Your order has been successfully processed!");
        //2.37 Click on “CONTINUE”
        checkoutPage.clickOnContinueHomepage();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(homePage.getVerifyWelcomeToStore(), "Welcome to our store");
    }
}

