package user_story_13.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class US13 {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the Firefox driver executable
        System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        // Maximize test window
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    @Test
    public void testAddShippingAddress() throws InterruptedException {
        // Navigate to the desired URL
        driver.get("https://pearlymarket.com/");

        // Click the "Sign In" button
        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        // Use WebDriverWait to wait for the username field to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

        // Enter the username
        usernameField.sendKeys("enes5");

        // Use WebDriverWait to wait for the password field to be clickable
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));

        // Enter the password then submit to finish the task
        passwordField.sendKeys("!PG&7KHmQp$-^kq");
        passwordField.submit();

        //Wait for submit to redirect back to the main page
        WebDriverWait waitForSubmit = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForSubmit.until(ExpectedConditions.stalenessOf(passwordField));

        // Locate and click the "Sign Out" to go to the accounts page
        WebElement accountPage = driver.findElement(By.linkText("Sign Out"));
        accountPage.click();

        // Locate and click the "Addresses" to go to the addresses page
        WebElement addyPage = driver.findElement(By.linkText("Addresses"));
        addyPage.click();

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Navigate to the page to add an address
        driver.get("https://pearlymarket.com/my-account-2/edit-address/shipping/");

        //Enter the first name
        WebElement addyFirst = driver.findElement(By.id("shipping_first_name"));
        addyFirst.click();
        addyFirst.sendKeys("Atakan");

        //Enter the last name
        WebElement addyLast = driver.findElement(By.id("shipping_last_name"));
        addyLast.click();
        addyLast.sendKeys("Kutlay");

        //Select the country/region
        WebElement addyCountry = driver.findElement(By.id("select2-shipping_country-container"));
        addyCountry.click();

        WebElement countryField = driver.findElement(By.className("select2-search__field"));
        countryField.sendKeys("Turkey");
        countryField.sendKeys(Keys.ENTER);

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Enter the street address
        WebElement addyStreet = driver.findElement(By.id("shipping_address_1"));
        addyStreet.click();
        addyStreet.sendKeys("Tekand Mevkii 71");

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Select the province
        WebElement addyProv = driver.findElement(By.id("select2-shipping_state-container"));
        addyProv.click();

        //Wait for 2 seconds
        Thread.sleep(2000);

        WebElement provField = driver.findElement(By.className("select2-search__field"));
        provField.sendKeys("Uşak");
        Thread.sleep(2000);
        provField.sendKeys(Keys.ENTER);

        //Enter the postal code
        WebElement addyZIP = driver.findElement(By.id("shipping_postcode"));
        addyZIP.click();
        addyZIP.sendKeys("48118");

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Enter the city
        WebElement addyCity = driver.findElement(By.id("shipping_city"));
        addyCity.click();
        addyCity.sendKeys("Ulubey");
        addyCity.submit();

        //Wait until the URL changes to the edit-address page
        WebDriverWait waitSave = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitSave.until(ExpectedConditions.urlToBe("https://pearlymarket.com/my-account-2/edit-address/"));

        //Wait for 5 seconds
        Thread.sleep(5000);

        // Assert that the address is added successfully
        String successMessage = driver.findElement(By.className("woocommerce-message")).getText();
        Assert.assertTrue(successMessage.contains("Address changed successfully."));

    }
}