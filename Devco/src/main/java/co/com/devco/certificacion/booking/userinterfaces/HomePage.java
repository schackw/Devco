package co.com.devco.certificacion.booking.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BOTTOM_HAZTE_UNA_CUENTA = Target.the("MAPPING the bottom hazte una cuenta of booking home page")
            .located(By.xpath("//*[contains(text(),'Hazte una cuenta')]"));

    public static final Target BOTTOM_SEARCH = Target.the("MAPPING the bottom Buscar of booking home page")
            .located(By.xpath("//*[@class='sb-searchbox__button ']"));

    public static final Target X_OPTION = Target.the("MAPPING the X option to clear a place in the filter")
            .located(By.xpath("//*[@class='bk-icon -streamline-close sb-destination__clear-icon']"));
    ////*[@class='bk-icon -streamline-close sb-destination__clear-icon']

    public static final Target BOTTOM_LOGIN_AND_CREATE_ACCOUNT_TEXT= Target.the("MAPPING the text of the bottom login / create account").located(
            By.xpath("//span[@class='e57ffa4eb5']")
    );

    public static final Target OPTION_O_LIST_FIELD_PLACE_STAY= Target.the("MAPPING the first option list of the fiel place to stay").located(
            By.xpath("//li[@data-i='0']")
    );
    public static final Target LABEL_PLACE_STAY= Target.the("MAPPING the label palce to stay").located(
            By.id("ss")
    );

    public static final Target CHECK_IN_OUT_OPTIONS = Target.the("Mapping the checking out options")
            .located(By.xpath("//div[@class='xp__dates xp__group']") );
//xp__dates xp__group
public static final Target SLC_TIPO= Target.the("mapping the option tipo")
        .locatedBy("//td[@data-date='{0}']");
//td[@data-date='{0}']
}
