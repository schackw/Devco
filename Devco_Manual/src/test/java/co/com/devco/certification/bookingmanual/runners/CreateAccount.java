package co.com.devco.certification.bookingmanual.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/create_account.feature",
        glue = "co.com.devco.certification.booking.stepdefinitions",
        tags = "@manual",
        snippets = CucumberOptions.SnippetType.CAMELCASE)



public class CreateAccount {
}
