package user_story_1.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import user_story_1.pages.RegisterPage;
import utilities.*;

import java.io.IOException;

public class TC_01 {

        RegisterPage register = new RegisterPage();

        Actions actions;
        protected static ExtentReports extentReports;
        protected static ExtentHtmlReporter extentHtmlReporter;
        protected static ExtentTest extentTest;

        Faker faker = new Faker();

        @Test
        public void TC_01() throws IOException {
            Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
            assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");



            register.register.click();

            MediaUtils.takeScreenshotOfTheEntirePageAsString();
            WaitUtils.waitFor(1);

            register.username.sendKeys(faker.name().username());
            register.email.sendKeys(faker.name().firstName() + "@gmail.com");
            register.password.sendKeys(faker.name().firstName() + faker.number().randomNumber());
            MediaUtils.takeScreenshotOfTheEntirePageAsString();
            WaitUtils.waitFor(1);

            register.agreeBox.click();
            MediaUtils.takeScreenshotOfTheEntirePageAsString();
            WaitUtils.waitFor(1);

            MediaUtils.takeScreenshotOfTheEntirePageAsString();
            register.signUp.click();
            WaitUtils.waitFor(1);

            MediaUtils.takeScreenshotOfTheEntirePageAsString();
            register.myAccount.click();
            WaitUtils.waitFor(1);


            Driver.closeDriver();
        }
    }

