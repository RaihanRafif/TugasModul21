package raihan.selenium.stepDef;

import io.cucumber.java.en.Then;
import raihan.selenium.BaseTest;
import raihan.selenium.page.HomePage;

public class HomepageStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}