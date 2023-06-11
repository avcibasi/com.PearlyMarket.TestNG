package user_story_10.tests;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import user_story_10.pages.HomePage10;
import user_story_10.pages.RegisterPage10;
import user_story_10.pages.VendorRegistrationPage10;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.verifyElementDisplayed;

public class TC {

        private ExtentTest ExtentReportUtils;

        @Test
        public void  passwordChartVisibilityTest() throws InterruptedException {
            Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
            assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");

            HomePage10 HomePage10  = new HomePage10 ();
            RegisterPage10 RegisterPage10= new RegisterPage10();
            VendorRegistrationPage10 vrp = new VendorRegistrationPage10();

            ExtentReportUtils.info("test starts here");

            // 1) User clicks to the Register button
            user_story_10.pages.HomePage10.register.click();
            ExtentReportUtils.pass("user is able to see register page");
            // 2) User clicks to the "Become a Vendor" button
            user_story_10.pages.RegisterPage10.becomeVendor.click();
            ExtentReportUtils.pass("user is able to see password box");
            // Verifying that User is on "Vendor Registration" url
            verifyElementDisplayed(By.xpath("//h2[text()='Vendor Registration']"));
            // 3) user clicks to the password button
            vrp.password.click();
            ExtentReportUtils.pass("user is abke to enter a password");
            // 4) user enters a valid password which contains less than six characters to see "too short" on password chart
            vrp.password.sendKeys("aBc1*");
            Thread.sleep(2000);
            vrp.password.clear();
            ExtentReportUtils.pass("user is able to see 'too short' on the password chart");
            // 5) user enters a valid password which contains more than five characters with using only lowercase letters,
            // only uppercase letters or only numbers to see "weak" on password chart
            vrp.password.sendKeys("aaaaaaaa");
            Thread.sleep(2000);
            vrp.password.clear();
            ExtentReportUtils.pass("user is able to see 'weak' on the password chart");
            // 6) user enters a valid password which contains more than five characters with using only two categories from
            // uppercase letters, lowercase letters and numbers to see "good" on password chart
            vrp.password.sendKeys("AAAAAaaa");
            Thread.sleep(2000);
            vrp.password.clear();
            ExtentReportUtils.pass("user is able to see 'good' on the password chart");
            // 7) user enters a valid password which contains more than five characters with using at least one lowercase,
            // one uppercase, one number and one special character together to see "strong" on password chart
            vrp.password.sendKeys("aBc1*.");
            Thread.sleep(2000);
            vrp.password.clear();
            Driver.closeDriver();
            ExtentReportUtils.pass("user is able to see 'strong' on the password chart");

            Driver.closeDriver();

            //!! when I use only question marks(?) or stars(*), it becomes strong after a point but when I use only periods(.) or only slashes(/),it does not become strong after any point
        }
    }

