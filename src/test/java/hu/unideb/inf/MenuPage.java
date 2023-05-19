package hu.unideb.inf;

import org.openqa.selenium.WebDriver;

public class MenuPage {
    private final WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {return driver.getTitle();}

    public void closePage() {
        driver.quit();
    }
}
