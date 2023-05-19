package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuStepDefs extends AbstractStepDefs {

    @Then("the {string} title text is shown")
    public void theTitleTextIsShown(String titleText) {
        assertEquals(titleText, menuPage.getTitle());
    }

}
