package user_story_1.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class HomePage {


        public WebElement register;
    public WebElement searchButton;
    public WebElement searchBar;
    public WebElement cartButton;
    public WebElement viewCartButton;

    public HomePage(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath = "//span[text()='Register']")
        public WebElement Register;

        @FindBy(xpath = "//input[@id='reg_username']")
        public WebElement usernameBox;
        @FindBy(xpath = "//input[@id='reg_email']")
        public WebElement emailBox;
        @FindBy(xpath = "//input[@id='reg_password']")
        public WebElement passwordBox;
        @FindBy(xpath = "//input[@id='register-policy']")
        public WebElement confirmBox;
        @FindBy(xpath = "//button[text()='Sign Up']")
        public WebElement signUpButton;








    }

