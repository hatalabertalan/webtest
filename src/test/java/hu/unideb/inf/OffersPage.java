package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class OffersPage {
    private final WebDriver driver;

    private static final Map<String, By> offers = Map.of(
        "Lunch Discount", By.linkText("Lunch Discount"),
        "Rent Car", By.linkText("Rent Car"),
        "Cheap Flights Tickets", By.linkText("Cheap Flights Tickets"),
        "3 Nights Aegean Cruise", By.linkText("3 Nights Aegean Cruise")
    );
    public OffersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOffer(String offerName) {
        driver.findElement(offers.get(offerName)).click();
    }
    public boolean imageExists(String offerImage) {
        String imageSrc = "div.blog-card > div.card-img > img[src=\"" + offerImage + "\"]";
        return driver.findElements(By.cssSelector(imageSrc)).size() > 0;
    };
    public void closePage() {
        driver.quit();
    }
}
