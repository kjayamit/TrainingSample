package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import support.DriverInit;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchAndAddProductToCartTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifySearchAndClickOnProduct() {

        System.out.println("I am a Geek");
        WebDriver webDriver;
        final String baseUrl = "http://spree-vapasi.herokuapp.com/";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        webDriver = new ChromeDriver(options);

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get(baseUrl);

        webDriver.findElement(By.cssSelector("#keywords")).click();
        webDriver.findElement(By.cssSelector("#keywords")).sendKeys("Jersey");

        webDriver.findElement(By.cssSelector("input[value='Search']")).click();

        System.out.println(" Sniff + Regression" + System.getProperty("environment"));



//        driver.findElement(By.cssSelector("input[value='Search']")).click();
//
//        assertTrue(driver.findElement(By.cssSelector("span[title*='Jersey']"))
//                .isDisplayed());
//
//        List<WebElement> searchResultsElement = driver.findElements(By
//                .cssSelector("span[title*='Jersey']"));
//        List<String> searchResults = new LinkedList<>();
//
//        for (WebElement webElement : searchResultsElement) {
//            searchResults.add(webElement.getText());
//        }
//
//        String expectedJersey = "Apache Baseball Jersey";
//        assertEquals(searchResults.get(2), expectedJersey);
//
//        driver.findElement(By.cssSelector("span[title*='" + expectedJersey + "']")).click();
//
//        assertEquals(driver.findElement(By.cssSelector(".product-title")).getText(),
//                expectedJersey);
//        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
//
//        assertEquals(driver.findElement(By.cssSelector("div[data-hook='cart_container'] h1")).getText(),
//                "Shopping Cart");
//        assertEquals(driver.findElement(By.cssSelector(".cart-item-description h4")).getText(),
//                expectedJersey);
//        assertEquals(driver.findElement(By.cssSelector("#checkout-link")).getText(), "Checkout");

//        driverInit.getDriver().close();
//        driverInit.getDriver().quit();

    }
}
