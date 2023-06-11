package user_story_14.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyStore14 {


        @FindBy(id = "gallery_img_gimage_0_display")
        public WebElement photo;
        @FindBy(xpath = "//select[@id='product_type']")
        public WebElement productType;


        @FindBy(xpath = "//input[@id='is_virtual']")
        public WebElement virtualBox;
        @FindBy(xpath = "//input[@id='pro_title']")
        public WebElement productTitle;


    }

