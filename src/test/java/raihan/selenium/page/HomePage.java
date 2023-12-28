package raihan.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCartBadge = By.className("shopping_cart_badge");
    By removeButtonLocator = By.id("remove-sauce-labs-backpack");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    // Method to click the Add to Cart button
    public void clickAddToCart() {
        WebElement addToCartBtnElement = driver.findElement(addToCartButton);
        assertTrue(addToCartBtnElement.isDisplayed(), "Add to Cart button is not displayed");
        addToCartBtnElement.click();
    }

    public String getShoppingCartBadgeValue() {
        WebElement badgeElement = driver.findElement(shoppingCartBadge);
        return badgeElement.getText(); // This will return the text inside the <span> element, e.g., "1"
    }

    public int getNumberOfItemsInCart() {
        List<WebElement> badgeElements = driver.findElements(shoppingCartBadge);
        if (badgeElements.isEmpty()) {
            return 0; // If the badge is not present, assume the cart is empty.
        } else {
            String badgeText = badgeElements.get(0).getText();
            return Integer.parseInt(badgeText); // Convert the badge text to an integer.
        }
    }

    // Method to click the Remove button
    public void clickRemoveButton() {
        WebElement removeButton = driver.findElement(removeButtonLocator);
        if(removeButton.isDisplayed() && removeButton.isEnabled()) {
            removeButton.click();
        } else {
            throw new IllegalStateException("Remove button is not clickable");
        }
    }
}
