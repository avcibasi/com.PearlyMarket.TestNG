package user_story_20.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {
    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[@id='menu-item-1079']//a[@href='https://pearlymarket.com/my-account-2/']")
    public WebElement myAccountButton;
    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountTitle;
    @FindBy(xpath = "//p[@class='text-uppercase text-center mb-0']")
    public WebElement ordersOption;
    @FindBy(xpath = "//h4[@class='icon-box-title text-normal']")
    public WebElement ordersTitle;
    @FindBy(xpath = "//a[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view']")
    public WebElement viewButton;
    @FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
    public WebElement orderDetailsTitle;
}