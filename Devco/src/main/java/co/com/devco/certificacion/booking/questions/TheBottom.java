package co.com.devco.certificacion.booking.questions;

import co.com.devco.certificacion.booking.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheBottom implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.BOTTOM_SEARCH.resolveFor(actor).isEnabled();

    }

    public static Question<Boolean> isEnable() {
        return new TheBottom();
    }
}

