package co.com.devco.certificacion.booking.tasks;

import co.com.devco.certificacion.booking.utils.GetDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Task {


    String date = GetDate.getDateAAAAMMDD();
    Target field;

    public SelectDate(Target field) {
        this.field = field;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickElement.clickear(field.of(date))
        );
    }
    public static Performable toTravel(Target field) {
        return Tasks.instrumented(SelectDate.class,field);
    }
}
