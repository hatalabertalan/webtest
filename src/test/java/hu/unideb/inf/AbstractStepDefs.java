package hu.unideb.inf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;
    private static final WebDriver driver;
    protected static HomePage homePage;
    protected static MenuPage menuPage;
    protected static OffersPage offersPage;

    static {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
        homePage = new HomePage(driver);
        menuPage = new MenuPage(driver);
        offersPage = new OffersPage(driver);
    }
}
