package co.com.devco.certification.bookingmanual.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;


public class BookingManualStepDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario){
        this.scenario=scenario;
    }



}
