package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver=driver;
    }

    By travelInsurance =
            By.xpath("//div[2]/section/div[7]");

    public void clickTravelInsurance() {

        driver.findElement(travelInsurance).click();
    }

    
}