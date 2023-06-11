package user_story_14.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccount14 {

    public static WebElement productsLink;
    public static WebElement addProductLink;

    public MyAccount14(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//*[@name='username'])[1]")
    public WebElement userName;
    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement password;
    @FindBy(xpath = "//*[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManagerButton;
    



 
        //Store Manager element
        @FindBy(xpath = "//a[text()='Store Manager']")
        public WebElement storeManager;


        //Products element
        @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[1]")
        public WebElement products;

        @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
        public WebElement products2;


        //Orders
        @FindBy(xpath = "//a[text()='Orders']")
        public WebElement orders;

        //Browse Products
        @FindBy(xpath = "//a[text()='Browse products']")
        public WebElement browseProducts;


        //Place Order
        @FindBy(xpath = "//button[text()='Place order']")
        public WebElement placeOrder;

        
        @FindBy(xpath = "//span[text()='Add New']")
        public WebElement addNewProducts;

        //myAccount1
        @FindBy(xpath = "(//*[text()='My Account'])[2]")
        public WebElement myAccount1;

    }
