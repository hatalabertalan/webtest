package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OffersStepDefs extends AbstractStepDefs {

    @When("the {string} offer is selected")
    public void theOfferIsSelected(String offerName) {
        offersPage.selectOffer(offerName);
    }

    @Then("the {string} offer image is shown")
    public void theOfferImageIsShown(String offerImage) {
        assertTrue(offersPage.imageExists(offerImage));
    }
}
