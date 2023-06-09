package us_06_shopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import us_06_shopping.utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBar;
    @FindBy(xpath = "//button[@aria-label='Search Button']")
    public WebElement searchButton;
    @FindBy(xpath = "//a[@class='cart-toggle']")
    public WebElement cartButton;
    @FindBy(xpath = "//a[.='View cart']")
    public WebElement viewCartButton;

}
