package user_story_2.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationFail {

    public static void main(String[] args) throws InterruptedException {


        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();

        // Maximize test window
        driver.manage().window().maximize();

        // Navigate to the desired URL
        driver.get("https://pearlymarket.com/");

        // Click "Register" button
        WebElement signInButton = driver.findElement(By.linkText("Register"));
        signInButton.click();

        // Use WebDriverWait to wait for the username field to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("reg_username")));


        // Enter the username
        WebElement regUser = driver.findElement(By.id("reg_username"));
        regUser.click();
        regUser.sendKeys("enes4");

        Thread.sleep(1000);

        // Click the email field and enter email
        WebElement regEmail = driver.findElement(By.id("reg_email"));
        regEmail.click();
        regEmail.sendKeys("loren.anselmo@fullangle.org");

        Thread.sleep(1000);

        // Click password field and enter password
        WebElement regPwd = driver.findElement(By.id("reg_password"));
        regPwd.click();
        regPwd.sendKeys("!PG&7KHmQp$-^kq");

        // Agree to the privacy policy
        WebElement privBox = driver.findElement(By.id("register-policy"));
        privBox.click();

        // Find and click the Sign Up button using XPath
        WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
        signUpButton.click();

        // Wait until you see "An account is already registered with your email address."
        WebDriverWait waitAlrd = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitAlrd.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("signup")), "An account is already registered with your email address. "));

        // Display a pop-up alert using JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String alertMessage = "An account is already registered with your email address.";
        js.executeScript("alert('" + alertMessage + "');");

        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
