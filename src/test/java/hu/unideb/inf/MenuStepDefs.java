package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuStepDefs extends AbstractStepDefs {

    @Then("the {string} menu text is shown")
    public void theMenuTextIsShown(String menuText) {
        assertEquals(menuText, menuPage.getMenuText());
    }

}
