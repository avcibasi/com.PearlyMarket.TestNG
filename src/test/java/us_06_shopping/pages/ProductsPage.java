package us_06_shopping.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import us_06_shopping.utilities.Driver;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//ul[@data-col-list=' row cols-sm-1 cols-2']//li)[1]")
    public WebElement firstProduct;
    @FindBy(xpath = "(//ul[@data-col-list=' row cols-sm-1 cols-2']//li)[2]")
    public WebElement secondProduct;
    @FindBy(xpath = "(//ul[@data-col-list=' row cols-sm-1 cols-2']//li)[3]")
    public WebElement thirdProduct;
    @FindBy(name = "add-to-cart")
    public WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement addedToCartMessage;



}
