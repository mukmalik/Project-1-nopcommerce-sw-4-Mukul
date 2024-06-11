package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility
{
    By sortByZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By verifyDescendingOrder = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By sortByAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By buildYourOwnComputer = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");

    public void clickOnSortByZtoA()
    {
        clickOnElement(sortByZtoA);
    }

    public String getVerifyDescendingOrder()
    {
        return getTextFromElement(verifyDescendingOrder);
    }

    public void verifyDescendingOrder() {
        List<WebElement> product = driver.findElements(By.className("product-title"));
        ArrayList<String> beforeFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            beforeFilterProductList.add(element.getText());
        }

        Collections.reverse(beforeFilterProductList);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        //After filter get product list
        product = driver.findElements(By.className("product-title"));
        ArrayList<String> afterFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            afterFilterProductList.add(element.getText());
        }
        Collections.reverse(afterFilterProductList);
        // Assert.assertEquals(beforeFilterProductList, afterFilterProductList);
    }

    public void clickOnSortByAtoZ() {
        clickOnElement(sortByAtoZ);
    }

    public void clickBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }
}

