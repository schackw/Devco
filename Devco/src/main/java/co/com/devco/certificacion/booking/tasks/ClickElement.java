package co.com.devco.certificacion.booking.tasks;


import co.com.devco.certificacion.booking.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class ClickElement implements Task {
    Target ElementPage;

    public ClickElement(Target elementPage) {
        ElementPage = elementPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementPage)
        );
    }
    public static Performable clickear(Target ElementPage){
        return Tasks.instrumented(ClickElement.class,ElementPage);
    }


}
