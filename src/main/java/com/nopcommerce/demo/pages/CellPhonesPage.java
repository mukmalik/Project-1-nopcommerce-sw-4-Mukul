package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility
{
    By verifyCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");

    public void clickOnNokiaLumia(){
        clickOnElement(nokiaLumia);
    }

    public String getVerifyCellPhones(){
        return getTextFromElement(verifyCellPhones);
    }

    public void clickListView(){
        clickOnElement(listView);
    }
}

