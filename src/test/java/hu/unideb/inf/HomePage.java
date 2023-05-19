package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class HomePage {

    private static final String PAGE_URL = "https://www.phptravels.net/";

    private final WebDriver driver;

    @FindBy(css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement errorMessage;
    @FindBy(css = "div.section-tab > div > h2")
    private WebElement welcomeText;
    @FindBy(css = "div.deal-action-box > div.price-box > span.price__num")
    private WebElement priceText;
    @FindBy(css = "div.subscriberesponse")
    private WebElement subscriptionError;

    private static final Map<String, By> textFields = Map.of(
       "Subscription", By.id("exampleInputEmail1")
    );

    private static final Map<String, By> navigationButtons = Map.of(
        "Language Switch", By.id("languages"),
        "Currency Switch", By.id("currency"),
        "Hotels", By.cssSelector(".active_hotels"),
        "Flights", By.cssSelector(".active_flights"),
        "Tours", By.cssSelector(".active_tours"),
        "Transfers", By.cssSelector(".active_cars"),
        "Offers",By.cssSelector(".active_offers"),
        "Account",By.id("ACCOUNT"),
        "Got it",By.id("cookie_stop"),
        "Subscribe",By.id("email_subscribe")
    );

    private static final Map<String, By> signupButtons = Map.of(
        "Customer", By.linkText("Customer Signup"),
        "Agent", By.linkText("Agents Signup"),
        "Supplier", By.linkText("Supplier Signup")
    );

    private static final Map<String, By> languages = Map.of(
        "Turkish", By.linkText("Turkish"),
        "Russian", By.linkText("Russian"),
        "Philippine", By.linkText("Philippine"),
        "Korean" , By.linkText("Korean"),
        "English" , By.linkText("English")
    );

    private static final Map<String, By> currencies = Map.of(
        "GBP", By.linkText("GBP"),
        "SAR", By.linkText("SAR"),
        "EUR", By.linkText("EUR"),
        "PKR", By.linkText("PKR")
    );

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage() {
        driver.quit();
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }
    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }
    public boolean buttonExists(String button) {
        return driver.findElements(navigationButtons.get(button)).size() > 0;
    }
    public void clickButton(String button) {
        driver.findElement(navigationButtons.get(button)).click();
    }
    public void selectLanguage(String languageText) {
        driver.findElement(languages.get(languageText)).click();
    }
    public void selectCurrency(String currencyText) {
        driver.findElement(currencies.get(currencyText)).click();
    }
    public void clickSignupButton(String accountType) {
        driver.findElement(signupButtons.get(accountType)).click();
    }
    public String getSubscriptionError() {
        return subscriptionError.getText();
    };
    public String getWelcomeText() {return welcomeText.getText();}
    public String getPriceText() {return priceText.getText();}
}
