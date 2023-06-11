package us_16_adding_simple_product.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {

    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Store Manager")
    public WebElement storeManagerLink;
    @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']")
    public WebElement productsLink;
    @FindBy(partialLinkText = "Add New")
    public WebElement addProductLink;
}
