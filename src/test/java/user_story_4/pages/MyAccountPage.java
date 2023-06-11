package user_story_4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {

    public MyAccountPage(){PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signin;

    @FindBy(linkText = "Addresses")
    public WebElement addresses;

    @FindBy(xpath ="//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[2]/div/a")
    public WebElement shipping;

    @FindBy(id= "shipping_first_name")
    public WebElement firstname;

    @FindBy(id = "shipping_last_name")
    public WebElement lastname;

    @FindBy(id = "shipping_address_1")
    public WebElement street;

    @FindBy(id ="select2-shipping_country-container")
    public WebElement country;

    @FindBy(xpath = "//input[@role=\"combobox\"]")
    public WebElement searchCountry;

    @FindBy(xpath = "//li[.=\"Turkey\"]")
    public WebElement turkey;

    @FindBy(id = "shipping_city")
    public WebElement city;

    @FindBy(id = "shipping_postcode")
    public WebElement zip;

    @FindBy(id = "select2-shipping_state-container" )
    public WebElement province;

    @FindBy(xpath = "//input[@role=\"combobox\"]")
    public WebElement searchProvince;

    @FindBy(xpath = "//li[.=\"Bursa\"]")
    public WebElement bursa;

    @FindBy(xpath = "//button[.=\"Save address\"]")
    public WebElement save;
}
