package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class SignupPage {
    private static final String ACCOUNT_TYPE_SELECT_ID = "account_type";
    private final WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean accountTypeIsSelected(String accountType) {
        WebElement webElement = driver.findElement(By.id(SignupPage.ACCOUNT_TYPE_SELECT_ID));
        Select accountTypeSelect = new Select(webElement);
        WebElement selectedOption = accountTypeSelect.getFirstSelectedOption();

        return selectedOption.getText().equals(accountType);
    };
    public void closePage() {
        driver.quit();
    }
}
