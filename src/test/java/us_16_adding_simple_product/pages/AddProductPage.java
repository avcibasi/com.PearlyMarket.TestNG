package us_16_adding_simple_product.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddProductPage {

    public AddProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "product_type")
    public WebElement productTypeDropdown;
    @FindBy(xpath = "//option[.='Simple Product']")
    public WebElement simpleProductOption;
    @FindBy(id = "is_virtual")
    public WebElement virtualCheckbox;
    @FindBy(id = "is_downloadable")
    public WebElement downloadableCheckbox;
    @FindBy(id = "pro_title")
    public WebElement productTitleInput;
    @FindBy(id = "regular_price")
    public WebElement priceInput;
    @FindBy(id = "sale_price")
    public WebElement salePriceInput;
    @FindBy(xpath = "//input[@value='228']")
    public WebElement homeGardenCheckbox;
    @FindBy(xpath = "//input[@value='595']")
    public WebElement homeAccessoriesCheckbox;
    @FindBy(xpath = "//input[@value='508']")
    public WebElement homeLifeCheckbox;
    @FindBy(id = "featured_img_display")
    public WebElement featuredImageInput;
    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement galleryImageInput;
    @FindBy(xpath = "//button[.='Select']")
    public WebElement imageSubmitButton;
    @FindBy(xpath = "(//button[.='Add to Gallery'])[2]")
    public WebElement imageGallerySubmitButton;
    @FindBy(xpath = "//div[@class='thumbnail']")
    public WebElement image;
    @FindBy(xpath = "(//img[@draggable='false'])[5]")
    public WebElement image2;
    @FindBy(xpath = "//button[.='Media Library']")
    public WebElement mediaLibraryButton;
    @FindBy(name = "submit-data")
    public WebElement submitButton;
    @FindBy(xpath = "//span[.='Published']")
    public WebElement publishedMessage;
    @FindBy(xpath = "//td")
    public WebElement listOfAddedProducts;



}
