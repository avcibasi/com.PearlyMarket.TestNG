package us_06_shopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h3[.='Billing details']")
    public WebElement billingDetailsText;
    @FindBy(xpath = "//h4[.='Payment Methods']")
    public WebElement paymentMethodssText;
    @FindBy(xpath = "//input[@checked='checked']")
    public WebElement wireTransferRadioButton;
    @FindBy(xpath = "//input[@value='cod']")
    public WebElement payAtTheDoorRadioButton;
    @FindBy(id = "place_order")
    public WebElement placeOrderButton;
    @FindBy(id = "billing_first_name")
    public WebElement firstNameInput;
    @FindBy(id = "billing_last_name")
    public WebElement lastNameInput;
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement countryDropdown;
    @FindBy(id = "billing_address_1")
    public WebElement adressInput;
    @FindBy(id = "billing_city")
    public WebElement cityInput;
    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement stateDropdown;
    @FindBy(id = "billing_postcode")
    public WebElement zipCodeInput;
    @FindBy(id = "billing_phone")
    public WebElement phoneInput;
    @FindBy(id = "billing_email")
    public WebElement emailInput;
}
