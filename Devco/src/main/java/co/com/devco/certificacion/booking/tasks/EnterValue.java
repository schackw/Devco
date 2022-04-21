package co.com.devco.certificacion.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EnterValue implements Task {
     String value;
     Target field;

    public EnterValue(String value, Target field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(value).into(field)

        );
    }
    public static Performable with(String value, Target field){
        return Tasks.instrumented(EnterValue.class,value,field);
    }
}
