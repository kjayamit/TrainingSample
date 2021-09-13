package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverInit {
    public static WebDriver driver;
    final String baseUrl = "http://spree-vapasi.herokuapp.com/";

    public void getBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebDriver getDriver(){
        return  this.driver;
    }


}
