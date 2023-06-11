package user_story_3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddressPage {

    public AddressPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //myAccount
    @FindBy(xpath = "//span[text()='Sign Out']")
    public WebElement myAccount;

    //Addresses Button
    @FindBy(xpath = "//a[text()='shipping and billing addresses']")
    public WebElement addressesButton;


    //Scroll
    @FindBy(xpath ="//a[text()='Wishlist']" )
    public WebElement scroll;


    //Billing Address Button
    @FindBy(xpath = "//a[text()='Edit Your Billing Address']")
    public WebElement billingAddress;


    // First Name
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    // Last Name
    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastName;


    // Country/Region
    @FindBy(id = "select2-billing_country-container")
    public WebElement country;

    // Street Address
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddress;

    // Town/City
    @FindBy(id = "billing_city")
    public WebElement townCity;



    //Shipping Postcode
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement shippingPostcode;

    //Phone Number
    @FindBy(id="billing_phone")
    public WebElement phone;

    //email address
    @FindBy(id="billing_email")
    public WebElement email;

    //Save address button
    @FindBy(xpath ="//*[@name='save_address']")
    public WebElement saveAddress;
    //Saved address
    @FindBy(xpath = "//*[@id='main']/div/div/div/div/div/div/div/p")
    public WebElement   savedAddress;





}


