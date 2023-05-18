package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class OffersPage {
    private final WebDriver driver;

    @FindBy(css = "div.card-body > p:nth-child(2)")
    private WebElement offerText;
    private static final Map<String, By> offers = Map.of(
        "Lunch Discount", By.cssSelector(".author__title:nth-child(1)")
    );
    public OffersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectOffer(String offerName) {
        driver.findElement(offers.get(offerName)).click();
    }
    public String getOfferText() {return offerText.getText();}
    public void closePage() {
        driver.quit();
    }
}
