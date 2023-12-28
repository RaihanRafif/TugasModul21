package raihan.selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseTest {
    public static WebDriver driver;

    public void getDriver(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(options);
    }
}
