package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordPage {
    public static final Target PASSWORD_FIELD = Target.the("MAPPING the password field")
            .located(By.xpath("//*[@id=\"new_password\"]"));
    public static final Target SECOND_PASSWORD_FIELD = Target.the("MAPPING the second password field verify")
            .located(By.xpath("//*[@id=\"confirmed_password\"]"));
    public static final Target ERROR_PASSWORD_MESSAGE = Target.the("Mapping error message Enter a new password").
            located(By.id("new_password-note"));
    public static final Target ERROR_SECOND_PASSWORD_MESSAGE = Target.the("Mapping error message Enter a Second password").
            located(By.id("confirmed_password-note"));

}
