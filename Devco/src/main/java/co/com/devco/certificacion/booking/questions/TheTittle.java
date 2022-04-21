package co.com.devco.certificacion.booking.questions;

import co.com.devco.certificacion.booking.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheTittle implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CreateAccountPage.TITTLE_ACCOUNT.resolveFor(actor).containsText("Inicia sesión o crea una cuenta");

    }
    public static Question<Boolean> isVisible() {
        return new TheTittle();
    }
}
