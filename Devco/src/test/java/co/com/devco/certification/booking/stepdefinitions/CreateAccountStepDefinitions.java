package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certificacion.booking.tasks.ClickElement;
import co.com.devco.certificacion.booking.tasks.EnterValue;
import co.com.devco.certificacion.booking.tasks.FillField;
import co.com.devco.certificacion.booking.tasks.FillTheFields;
import co.com.devco.certificacion.booking.userinterfaces.CreateAccountPage;
import co.com.devco.certificacion.booking.userinterfaces.HomePage;
import co.com.devco.certificacion.booking.userinterfaces.PasswordPage;
import co.com.devco.certificacion.booking.utils.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateAccountStepDefinitions {

    @Managed
    private WebDriver webDriver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User page");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    @Given("The user must be on the Booking home page.")
    public void theUserMustBeOnTheBookingHomePage() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_BOOKING));
    }

    @When("I select the bottom Hazte una cuenta")
    public void iSelectTheBottomHazteUnaCuenta() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(HomePage.BOTTOM_HAZTE_UNA_CUENTA));

    }

    @Then("I should see the Inicia sesión o crea una cuenta text")
    public void iShouldSeeTheIniciaSesiónOCreaUnaCuentaText() {
        //  OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheTittle.isVisible(), Matchers.is(Matchers.equalTo(true))));
       OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(CreateAccountPage.TITTLE_ACCOUNT).text().contains(Constants.TITTLE_ACCOUNT_TEXT));
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("The user must be on the Create account page")
    public void theUserMustBeOnTheCreateAccountPage() {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_BOOKING));
      OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(HomePage.BOTTOM_HAZTE_UNA_CUENTA));

    }

    @When("I select the bottom Continuar con e-mail")
    public void iSelectTheBottomContinuarConEMail() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(CreateAccountPage.BOTTOM_CONTINUE_WITH_EMAIL));
    }

    @Then("I will see a error message")
    public void iWillSeeAErrorMessage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(CreateAccountPage.ERROR_MESSAGE).text().contains(Constants.ERROR_MESSAGE_EMAIL));
    }

    @Given("The user must be in a password section page")
    public void theUserMustBeInAPasswordSectionPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_BOOKING));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(HomePage.BOTTOM_HAZTE_UNA_CUENTA));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(CreateAccountPage.EMAIL_FIELD));

        OnStage.theActorInTheSpotlight().attemptsTo(EnterValue.with(Constants.EMAIL_VALUE, CreateAccountPage.EMAIL_FIELD));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(CreateAccountPage.BOTTOM_CONTINUE_WITH_EMAIL));
    }


    @When("I select the bottom Create an account")
    public void iSelectTheBottomCreateAnAccount() {

        OnStage.theActorInTheSpotlight().attemptsTo(FillField.password());
    }


    @Then("I will see a error message password")
    public void iWillSeeAErrorMessagePassword() {
       OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(CreateAccountPage.ERROR_PASSWORD_MESSAGE).text().contains(Constants.ERROR_MESSAGE_PASSWORD_VALUE));
    }

    @When("the user must fill and fields")
    public void theUserMustFillAndFields(DataTable dates) {

        OnStage.theActorInTheSpotlight().attemptsTo(FillTheFields.thePassword(dates));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(CreateAccountPage.BOTTOM_CREATE_ACCOUNT));

    }

    @Then("The user must see the different error message")
    public void theUserMustSeeTheDifferentErrorMessage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(PasswordPage.ERROR_PASSWORD_MESSAGE).text().contains(Constants.ERROR_MESSAGE_PASSWORD_LENGTH));
    }


    @When("the user must fill and fields with the data")
    public void theUserMustFillAndFieldsWithTheData(DataTable dates) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillTheFields.thePassword(dates));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(CreateAccountPage.BOTTOM_CREATE_ACCOUNT));
    }

    @Then("The user must see a error message password")
    public void theUserMustSeeAErrorMessagePassword() {

        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(PasswordPage.ERROR_SECOND_PASSWORD_MESSAGE).text().contains(Constants.ERROR_MESSAGE_PASSWORD_NOT_EQUALS ));

    }
}
