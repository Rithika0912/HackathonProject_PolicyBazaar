package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By travelInsurance =
            By.xpath("//a[contains(@href,'travel-insurance')]");

    public void clickTravelInsurance() {

        driver.findElement(travelInsurance).click();
    }
}