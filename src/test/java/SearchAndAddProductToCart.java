import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SearchAndAddProductToCart {
    public static void main(String[] args)
    {
        System.out.println("I am a Geek");
        WebDriver webDriver;
        final String baseUrl = "http://spree-vapasi.herokuapp.com/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get(baseUrl);

        webDriver.findElement(By.cssSelector("#keywords")).click();
        webDriver.findElement(By.cssSelector("#keywords")).sendKeys("Jersey");

        webDriver.findElement(By.cssSelector("input[value='Search']")).click();

//        webDriver.close();
//        webDriver.quit();
    }
}
