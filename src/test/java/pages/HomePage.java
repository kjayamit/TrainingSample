package pages;

import org.openqa.selenium.By;
import support.DriverInit;

public class HomePage {
    DriverInit driverInit = new DriverInit();

    public void enterSearchCriteriaToSearchBox(String searchKey) {
        driverInit.getDriver().findElement(By.cssSelector("#keywords")).click();
        driverInit.getDriver().findElement(By.cssSelector("#keywords")).sendKeys(searchKey);
    }
}
