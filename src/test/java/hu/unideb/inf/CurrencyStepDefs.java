package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyStepDefs extends AbstractStepDefs {

    @Then("the {string} price is shown")
    public void thePriceIsShown(String priceText) {
        assertEquals(priceText, homePage.getPriceText());
    }

    @When("the {string} currency is selected")
    public void theCurrencyIsSelected(String currencyText) {
        homePage.selectCurrency(currencyText);
    }
}
