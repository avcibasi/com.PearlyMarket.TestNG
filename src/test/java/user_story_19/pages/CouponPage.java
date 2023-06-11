package user_story_19.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CouponPage {

        public CouponPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
        public WebElement storeManager;
        @FindBy(xpath = "//h2[@class='page-title']")
        public WebElement storeManagerTitle;
        @FindBy(xpath = "//a[@class='wcfm_menu_item ']//span[@class='wcfmfa fa-gift']")
        public WebElement couponButton;
        @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
        public WebElement addNewButton;
        @FindBy(id = "title")
        public WebElement couponCode;
        @FindBy(id = "description")
        public WebElement description;
        @FindBy(id = "coupon_amount")
        public WebElement amount;
        @FindBy(id = "expiry_date")
        public WebElement expiryDate;
        @FindBy(id = "minimum_amount")
        public WebElement minSpend;
        @FindBy(id = "maximum_amount")
        public WebElement maxSpend;
        @FindBy(id = "product_categories")
        public WebElement productCategories;
        @FindBy(id = "wcfm_coupon_manager_submit_button")
        public WebElement submitButton;
    }

