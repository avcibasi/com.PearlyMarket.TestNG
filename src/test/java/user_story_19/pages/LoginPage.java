package user_story_19.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

        public LoginPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//div[@class='elementor-element elementor-element-0ceec07 mr-auto mr-md-2 ml-auto ml-sm-0 elementor-widget elementor-widget-wolmart_header_site_logo']")
        public WebElement pearlyMarketText;
        @FindBy(xpath = "//a[@class='login inline-type']")
        public WebElement loginButton;
        @FindBy(id = "username")
        public WebElement username;
        @FindBy(id = "password")
        public WebElement password;
        @FindBy(name = "login")
        public WebElement singINButton;
        @FindBy(xpath = "//a[@class='login logout inline-type']")
        public WebElement signInVerification;
        @FindBy(name = "s")
        public WebElement searchBar;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement searchedItemSubmitButton;
        @FindBy(xpath = "//h1[@class='product_title entry-title']")
        public WebElement grayLeatherShoesText;
        @FindBy(name = "add-to-cart")
        public WebElement addToCartButton;
        @FindBy(xpath = "//h1[@class='product_title entry-title']")
        public WebElement mouseTitle;
        @FindBy(xpath = "//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']")
        public WebElement mouse;
    }

