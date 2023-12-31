package us_16_adding_simple_product.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInSubmitButton;
    @FindBy(xpath = "(//a[.='My Account'])[1]")
    public WebElement myAccountLink;

}
