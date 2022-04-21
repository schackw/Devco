package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final Target TITTLE_ACCOUNT = Target.the("MAPPING the tittle create account or login session page")
            .located(By.className("page-header"));
    public static final Target BOTTOM_CONTINUE_WITH_EMAIL = Target.the("MAPPING the bottom continue with the email")
            .located(By.xpath("//*[@class='Wm0cMj3qmJ6uOrvNJ_gL vG6MwHiG5509Ezzvohc7 AAQpVL26KBUYrogb1HSX TCYNuP4sieBwLMStmx7l Eb2yn3kPWTu8vaNwgxqw YbrPaJ5QL1sl414mFY64']"));
    public static final Target ERROR_MESSAGE = Target.the(
            "Mapping the text with the error message when the field is empty").
            located(By.xpath("//*[@id='username-note']"));
    public static final Target EMAIL_FIELD = Target.the("Mapping the EMAIL field").
            located(By.xpath("//*[@id=\"username\"]"));

    public static final Target BOTTOM_CREATE_ACCOUNT = Target.the("Mapping the bottom create account").
            located(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"));

    public static final Target ERROR_PASSWORD_MESSAGE = Target.the("Mapping error message Enter a new password").
            located(By.id("new_password-note"));
    public static final Target TITTLE_PASSWORD = Target.the("MAPPING the tittle Create a password")
            .located(By.xpath("//*[@id=\"c78ed856-6ac9-4d6b-aa6c-306b4beb8035\"]"));

}
