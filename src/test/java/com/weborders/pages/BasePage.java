package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {

    protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

     @FindBy(linkText = "View all orders")
     private WebElement viewAllOrders;

    @FindBy(linkText = "View all orders")
    private WebElement viewAllProducts;

    @FindBy(linkText = "Order")
    private WebElement order;



    public BasePage(){
         //this line to bo able to use @Findby,@FindBys annotations
        PageFactory.initElements(Driver.getDriver(), this);

        //base page is like a basement for the login page,where you can have wait object and pagefactory
        //which will initialise Driver.getDriver() method.

    }

    public void clickOnViewAllOrders(){
        System.out.println("Clicking on 'View  All orders page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllOrders));
        viewAllOrders.click();
    }
    public void clickOnViewAllProducts(){
        System.out.println("Clicking on 'View  All Products page");
        wait.until(ExpectedConditions.elementToBeClickable(viewAllOrders));
        viewAllProducts.click();
    }

    public void clickOnOrders() {
        System.out.println("Clicking on 'Order");
        wait.until(ExpectedConditions.elementToBeClickable(order)).click();

    }
}
