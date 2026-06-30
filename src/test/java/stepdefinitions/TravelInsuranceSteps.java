package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TravelInsurancePage;
import utilities.BaseClass;

public class TravelInsuranceSteps extends BaseClass {

    HomePage homePage;
    TravelInsurancePage travelPage;

    @Given("User launches PolicyBazaar website")
    public void launchSite() {

        setup();

        homePage = new HomePage(driver);
        travelPage = new TravelInsurancePage(driver);
    }

    @When("User selects Travel Insurance")
    public void selectTravelInsurance() {

        System.out.println("Already on Travel Insurance Page");
    }


    @When("User selects European country {string}")
    public void selectCountry(String country) throws InterruptedException {

        Thread.sleep(3000);

        travelPage.selectCountry();
    }

    @When("User selects travel dates")
    public void selectTravelDates() {

        travelPage.selectDates();
    }

    @When("User selects 2 travellers aged 22 and 21")
    public void selectTravellers() {

        travelPage.selectTravellers();
        travelPage.selectAges();
    }

    @When("User enters dummy details")
    public void enterDummyDetails() {

        travelPage.enterPhoneNumber("9876543210");
        travelPage.clickViewPlans();
    }

    @Then("Display lowest 3 insurance providers and premium amount")
    public void displayLowestPlans() {

        travelPage.printLowestPlans();

        tearDown();
    }
}