package us_06_shopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import us_06_shopping.utilities.Driver;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//tbody")
    public WebElement cartProductTable;
    @FindBy(xpath = "(//button[@title='Plus'])[1]")
    public WebElement product1QuantityIncreaseButton;
    @FindBy(xpath = "(//button[@title='Minus'])[1]")
    public WebElement product1QuantityDecreaseButton;
    @FindBy(xpath = "//button[@name='update_cart']")
    public WebElement updateCartButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement cartUpdatedMessage;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckOutButton;

}
