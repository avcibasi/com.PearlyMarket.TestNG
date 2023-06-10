package user_story_20.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='w-icon-cart']")
    public WebElement cartOption;
    @FindBy(xpath = "//h4[@class='cart-title']")
    public WebElement shoppingCartTitle;
    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkoutButton;
    @FindBy(id = "order_review_heading")
    public WebElement yourOrderTitle;
    @FindBy(id = "billing_first_name")
    public WebElement firstName;
    @FindBy(id = "billing_last_name")
    public WebElement lastName;
    @FindBy(id = "billing_company")
    public WebElement companyName;
    @FindBy(id = "billing_address_1")
    public WebElement streetAddress;
    @FindBy(id = "billing_address_2")
    public WebElement homeNumber;
    @FindBy(id = "billing_city")
    public WebElement townCity;
    @FindBy(id = "billing_postcode")
    public WebElement postcodeZip;
    @FindBy(id = "billing_phone")
    public WebElement phone;
    @FindBy(id = "billing_email")
    public WebElement emailAddress;
    @FindBy(name = "payment_method")
    public WebElement paymentMethod;
    @FindBy(id = "place_order")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//tr[@class='order-total']")
    public WebElement totalAmount;
    @FindBy(name = "woocommerce_checkout_place_order")
    public WebElement placeOrder;
    @FindBy(xpath = "//i[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement thankYou;
    @FindBy(xpath = "//div[@class='woocommerce-form-coupon-toggle']")
    public WebElement haveACouponText;
    @FindBy(xpath = "//div[@class='woocommerce-form-coupon-toggle']//a[@class='showcoupon']")
    public WebElement haveACouponOption;
    @FindBy(name = "coupon_code")
    public WebElement couponCodeSearchBox;

    @FindBy(name = "apply_coupon")
    public WebElement applyCouponButton;
}