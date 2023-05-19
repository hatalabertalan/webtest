package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignupStepDefs extends AbstractStepDefs {

    @When("the {string} signup button is clicked")
    public void theSignupClicked(String accountType){
        homePage.clickSignupButton(accountType);
    }

    @Then("the {string} account type is selected in form")
    public void theAccountTypeIsSelected(String accountType) {
        assertTrue(signupPage.accountTypeIsSelected(accountType));
    }
}
