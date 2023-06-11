package user_story_8.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyCheckoutPage {

    public PearlyCheckoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "billing_first_name")
    public WebElement customerName;

    @FindBy(id = "billing_last_name")
    public WebElement customerLastName;

    @FindBy(id = "billing_company")
    public WebElement companyName;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement countryRegion;

    @FindBy(id="billing_address_1")
    public WebElement streetAddress1;
    @FindBy(id="billing_address_2")
    public WebElement streetAddress2;

    @FindBy(id="billing_postcode")
    public WebElement zipCode;

    @FindBy(id="billing_city")
    public WebElement townCity;
    @FindBy(id="select2-billing_state-container")
    public WebElement province;

    @FindBy(id="billing_phone")
    public WebElement phone;

    @FindBy(id="billing_email")
    public WebElement emailAddress;

    @FindBy(id="order_comments")
    public WebElement additionalInfo;

    @FindBy(id="payment_method_bacs")
    public WebElement checkboxForWireTransferEft;

    @FindBy(id="payment_method_cod")
    public WebElement checkboxForPayAtTheDoor;

    @FindBy(id = "place_order")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//p[text()='Thank you. Your order has been received.']")
    public WebElement textAfterClickPlaceOrderButton;

    @FindBy(xpath = "//h2[text()='Order details']")
    public WebElement orderDetailsText;

    @FindBy(xpath = "//h3[text()='Billing details']")
    public WebElement billingDetailsText;

        
        
        
        
        
        
        
        
}