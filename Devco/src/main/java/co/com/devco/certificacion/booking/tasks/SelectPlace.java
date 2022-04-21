package co.com.devco.certificacion.booking.tasks;

import co.com.devco.certificacion.booking.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

public class SelectPlace implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (HomePage.X_OPTION.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    ClickElement.clickear(HomePage.X_OPTION)

            );
        }

        actor.attemptsTo(
                ClickElement.clickear(HomePage.BOTTOM_SEARCH)
        );
    }

    public static Performable toStay() {
        return Tasks.instrumented(SelectPlace.class);
    }
}
