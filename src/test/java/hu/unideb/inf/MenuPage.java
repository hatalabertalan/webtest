package hu.unideb.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    private final WebDriver driver;

    @FindBy(css = "section.breadcrumb-area > section > div > h2")
    private WebElement menuText;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMenuText() {return menuText.getText();}

    public void closePage() {
        driver.quit();
    }
}
