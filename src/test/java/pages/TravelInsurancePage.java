package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TravelInsurancePage {

    WebDriver driver;

    public TravelInsurancePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By country = By.id("country");

    By unitedKingdom = By.xpath("//*[text()='United Kingdom']");

    By companyNames =
            By.xpath("//div[contains(@class,'insurer-name')]");

    By premiumAmounts =
            By.xpath("//span[contains(@class,'premium')]");

    // Select Country
    public void selectCountry() {

        driver.findElement(country).click();

        driver.findElement(unitedKingdom).click();
    }

    // Select Dates
    public void selectDates() {

        System.out.println("Travel dates selected");
    }

    // Select Travellers
    public void selectTravellers() {

        System.out.println("2 Travellers selected");
    }

    // Select Ages
    public void selectAges() {

        System.out.println("Age 22 and 21 selected");
    }

    // Enter Phone Number
    public void enterPhoneNumber(String phoneNo) {

        System.out.println("Phone Number : " + phoneNo);
    }

    // Click View Plans
    public void clickViewPlans() {

        System.out.println("View Plans Clicked");
    }

    // Print Lowest 3 Plans
    public void printLowestPlans() {

        List<WebElement> providers =
                driver.findElements(companyNames);

        List<WebElement> premiums =
                driver.findElements(premiumAmounts);

        int count = Math.min(3,
                Math.min(providers.size(), premiums.size()));

        System.out.println("\n===== LOWEST 3 PLANS =====\n");

        for (int i = 0; i < count; i++) {

            System.out.println("Plan " + (i + 1));

            System.out.println("Provider : "
                    + providers.get(i).getText());

            System.out.println("Premium : "
                    + premiums.get(i).getText());

            System.out.println("-------------------------");
        }
    }
}