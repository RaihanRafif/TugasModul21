package raihan.selenium.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import raihan.selenium.BaseTest;
import raihan.selenium.page.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddChartDef extends BaseTest {

    HomePage homePage;
    private int initialNumberOfItems,itemsBefore;

    @When("user click an element add to chart button")
    public void userClickAnElementAddToChartButton() {
        homePage = new HomePage(driver);
        initialNumberOfItems = homePage.getNumberOfItemsInCart(); // Store the initial number of items
        homePage.clickAddToCart();
    }

    @Then("number in cart icon increase")
    public void numberInCartIconIncrease() {
        int newNumberOfItems = homePage.getNumberOfItemsInCart(); // Get the new number of items
        assertTrue(newNumberOfItems > initialNumberOfItems, "The number in the cart did not increase.");
    }

    @When("user click an element remove button")
    public void userClickAnElementRemoveButton() {
        itemsBefore = homePage.getNumberOfItemsInCart(); // Get number of items before removing
        homePage.clickRemoveButton(); // Method to click the remove button
    }

    @Then("number in cart is decrease")
    public void numberInCartIsDecrease() {
        initialNumberOfItems = homePage.getNumberOfItemsInCart(); // Get number of items after removing
        assertTrue(initialNumberOfItems < itemsBefore, "Number in cart did not decrease after removing an item.");
    }

}
