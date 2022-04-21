package co.com.devco.certificacion.booking.tasks;

import co.com.devco.certificacion.booking.userinterfaces.CreateAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillField implements Task {
    public FillField() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CreateAccountPage.BOTTOM_CREATE_ACCOUNT, WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds(),
                ClickElement.clickear(CreateAccountPage.BOTTOM_CREATE_ACCOUNT));


    }

    public static Performable password() {
        return Tasks.instrumented(FillField.class);
    }
}
