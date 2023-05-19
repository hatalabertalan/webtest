package hu.unideb.inf;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} field is filled with {string}")
    public void theFieldIsFilledWithText(String field, String text) {
        homePage.fillOutField(field, text);
    }

    @Given("the page bottom is focused")
    public void theFocusIsOnPageBottom() {
        homePage.scrollToBottom();
    }

    @When("the {string} button is clicked")
    public void theButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @When("the cookie policy is accepted")
    public void theCookiePolicyIsAccepted() {
        String cookiePolicyButton = "Got it";
        if (homePage.buttonExists(cookiePolicyButton)) {
            homePage.clickButton(cookiePolicyButton);
        }
    }

    @Then("the {string} subscription validation error is shown")
    public void theValidationErrorIsShown(String errorMessage) {
        assertEquals(errorMessage, homePage.getSubscriptionError());
    }

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }

}
