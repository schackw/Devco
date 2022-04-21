package co.com.devco.certification.bookingmanual.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/find_a_place_to_stay.feature",
        glue = "co.com.devco.certification.booking.stepdefinitions",
        tags = "@manual",
        snippets = CucumberOptions.SnippetType.CAMELCASE)



public class FindaPlaceToStay {
}
