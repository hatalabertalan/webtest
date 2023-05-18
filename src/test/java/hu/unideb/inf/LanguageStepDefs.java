package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LanguageStepDefs extends AbstractStepDefs {

    @Then("the {string} welcome text is shown")
    public void theWelcomeTextIsShown(String welcomeText) {
        assertEquals(welcomeText, homePage.getWelcomeText());
    }

    @When("the {string} language is selected")
    public void theLanguageIsSelected(String languageText) {
        homePage.selectLanguage(languageText);
    }
}
