package user_story_8.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyHomePage {
    public PearlyHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "menu-item-12987")
    public WebElement linkWomen;
    @FindBy(id="menu-item-12993")
    public WebElement linkMen;

        
    @FindBy(linkText ="Cosmetic")
    public WebElement linkCosmetic;

    @FindBy(linkText ="Shoes")
    public WebElement linkShose;

    @FindBy(xpath = "//li[@class='product-wrap']")
    public WebElement facePeeling;

    @FindBy(xpath = "//figure[@class='product-media']")
    public WebElement adidasErkekAyakkabi;

    @FindBy(xpath = "//div[@class='yith-wcwl-wishlistexistsbrowse']")
    public WebElement wishListIconForFacepeeling;
    @FindBy(xpath = "//a[@data-title='Add to wishlist']")
    public WebElement wishListIconForShose;

    @FindBy(xpath ="//span[text()='Wishlist']")
    public WebElement wishlistIcon;

    @FindBy(xpath = "//button[text()='Quick View']")
    public WebElement quickViewButton;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='cart-name']")
    public WebElement chartIcon;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//td[text()='No products added to the wis']")
    public WebElement noProductsAddedToTheWishlistText;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement addToCartButtonOnQuickView;

    @FindBy(xpath = "//a[text()='Trending'][1]")
    public WebElement theFirstTrendingLink;

}