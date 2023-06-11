package user_story_13.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class VendorAddress {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();

        // Maximize test window
        driver.manage().window().maximize();

        // Navigate to the desired URL
        driver.get("https://pearlymarket.com/");


        // Click the "Sign In" button
        WebElement signInButton = driver.findElement(By.linkText("Sign In"));
        signInButton.click();

        // Use WebDriverWait to wait for the username field to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

        // Enter the username
        usernameField.sendKeys("enes4");

        // Use WebDriverWait to wait for the password field to be clickable
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));

        // Enter the password then submit to finish the task
        passwordField.sendKeys("!PG&7KHmQp$-^kq");
        passwordField.submit();

        //Wait for submit to redirect back to main page
        WebDriverWait waitForSubmit = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.stalenessOf(passwordField));

        //Locate and click the Sign Out to go to accounts page
        WebElement accountPage = driver.findElement(By.linkText("Sign Out"));
        accountPage.click();

        //Locate and click the Addresses to go to addresses page
        WebElement addyPage = driver.findElement(By.linkText("Addresses"));
        addyPage.click();

        //Wait 2 seconds
        Thread.sleep(2000);

        //Send the vendor to the page to add address
        driver.get("https://pearlymarket.com/my-account-2/edit-address/shipping/");

        // * Enter the fields with the given data
        //Enter the name
        WebElement addyFirst = driver.findElement(By.id("shipping_first_name"));
        addyFirst.click();
        addyFirst.sendKeys("Atakan");

        //Enter the last name
        WebElement addyLast = driver.findElement(By.id("shipping_last_name"));
        addyLast.click();
        addyLast.sendKeys("Kutlay");

        //Locate the country/region and put in vendors country
        WebElement addyCountry = driver.findElement(By.id("select2-shipping_country-container"));
        addyCountry.click();

        WebElement countryField = driver.findElement(By.className("select2-search__field"));
        countryField.sendKeys("Turkey");
        countryField.sendKeys(Keys.ENTER);

        //Wait 2 seconds
        Thread.sleep(2000);

        //Locate the Street address and fill it in
        WebElement addyStreet = driver.findElement(By.id("shipping_address_1"));
        addyStreet.click();
        addyStreet.sendKeys("Tekand Mevkii 71");

        //Wait 2 seconds
        Thread.sleep(2000);

        //Locate the Province and select vendors province
        WebElement addyProv = driver.findElement(By.id("select2-shipping_state-container"));
        addyProv.click();

        //Wait 2 seconds
        Thread.sleep(2000);

        WebElement provField = driver.findElement(By.className("select2-search__field"));
        provField.sendKeys("Uşak");
        Thread.sleep(2000);
        provField.sendKeys(Keys.ENTER);

        //Locate the postcode and enter postcode
        WebElement addyZIP = driver.findElement(By.id("shipping_postcode"));
        addyZIP.click();
        addyZIP.sendKeys("48118");

        //Wait 2 seconds
        Thread.sleep(2000);

        //Locate the town/city and enter the city
        WebElement addyCity = driver.findElement(By.id("shipping_city"));
        addyCity.click();
        addyCity.sendKeys("Ulubey");
        addyCity.submit();

        WebDriverWait waitSave = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitSave.until(ExpectedConditions.urlToBe("https://pearlymarket.com/my-account-2/edit-address/"));

        Thread.sleep(5000);

        // Close the browser
        driver.quit();

    }

}
