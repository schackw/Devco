package co.com.devco.certificacion.booking.tasks;

import co.com.devco.certificacion.booking.models.Password;
import co.com.devco.certificacion.booking.userinterfaces.PasswordPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillTheFields implements Task {
    private String password;
    private String secondPassword;



    public FillTheFields(DataTable dates) {
       this.password = dates.cell(1,0);
       this.secondPassword = dates.cell(1,1);
       // this.password =dates.get(0).getPassword();
        //this.secondPassword =dates.get(0).getSecondPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(PasswordPage.PASSWORD_FIELD),
                Enter.theValue(secondPassword).into(PasswordPage.SECOND_PASSWORD_FIELD)


        );
    }
    public static FillTheFields thePassword(DataTable dates){
        return Tasks.instrumented(FillTheFields.class, dates);

    }
}
