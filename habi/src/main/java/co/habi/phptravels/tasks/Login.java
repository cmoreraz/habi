package co.habi.phptravels.tasks;

import static co.habi.phptravels.userinterface.PhptravelsLoginPage.ENTER_BUTTON_LOGIN;
import static co.habi.phptravels.userinterface.PhptravelsLoginPage.INPUT_EMAIL;
import static co.habi.phptravels.userinterface.PhptravelsLoginPage.INPUT_PASSWORD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class Login implements Task {

    private String strEmail;
    private String strPassword;

    public Login( String strEmail, String strPassword ) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public static Login onThePage( String strEmail, String strPassword ) {
        return instrumented( Login.class, strEmail, strPassword );
    }

    @Override
    public <T extends Actor> void performAs( T actor ) {
        actor.attemptsTo(
        		Enter.theValue( strEmail ).into(INPUT_EMAIL ),
                Enter.theValue( strPassword ).into(INPUT_PASSWORD ),
                Click.on(ENTER_BUTTON_LOGIN)
        );
    }
}
