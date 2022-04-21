package co.com.devco.certification.booking.stepdefinitions;

import co.com.devco.certificacion.booking.questions.TheBottom;
import co.com.devco.certificacion.booking.tasks.ClickElement;
import co.com.devco.certificacion.booking.tasks.EnterValue;
import co.com.devco.certificacion.booking.tasks.SelectPlace;
import co.com.devco.certificacion.booking.userinterfaces.HomePage;
import co.com.devco.certificacion.booking.utils.Constants;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class FindaPlaceToStayStepDefinitions {


    @Managed
    private WebDriver webDriver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User page");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    @Given("I as user must be in a BOOKING Stay page")
    public void iAsUserMustBeInABOOKINGStayPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL_BOOKING));

    }

    @When("I select the botton Search with the field place empty")
    public void iSelectTheBottonSearchWithTheFieldPlaceEmpty() {
       OnStage.theActorInTheSpotlight().attemptsTo(SelectPlace.toStay());
    }



    @Then("I will see the same page")
    public void iWillSeeTheSamePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(HomePage.BOTTOM_LOGIN_AND_CREATE_ACCOUNT_TEXT).text().contains(Constants.BOTTOM_LOGIN_CREATE_ACCOUNT));
    }

    @When("I enter the value of the place to stay")
    public void iEnterTheValueOfThePlaceToStay(DataTable place) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterValue.with(place.cell(1,0),HomePage.LABEL_PLACE_STAY));
        OnStage.theActorInTheSpotlight().attemptsTo(ClickElement.clickear(HomePage.OPTION_O_LIST_FIELD_PLACE_STAY));
    }




    @Then("I can to select the bottom Search")
    public void iCanToSelectTheBottomSearch() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheBottom.isEnable(), Matchers.is(Matchers.equalTo(true))));
    }

}
