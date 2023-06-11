package user_story_14.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseImage14 {
    public ChooseImage14(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='menu-item-upload']")
    public WebElement uploadFilesButton;

    @FindBy(id="ysch")
    public WebElement selectFilesButton;

    @FindBy(xpath = "(//*[@type='button'])[206]")
    public WebElement selectButton;

}
