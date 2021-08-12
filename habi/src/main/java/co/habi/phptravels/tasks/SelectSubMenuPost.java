package co.habi.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import static co.habi.phptravels.userinterface.PrincipalPage.BUTTON_POST;
import static co.habi.phptravels.utils.GenericTime.WaitUntil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

public class SelectSubMenuPost implements Task {
	
	public static SelectSubMenuPost selectSubMenuPost() {
		return instrumented( SelectSubMenuPost.class );
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(WaitUntil(BUTTON_POST), on(BUTTON_POST) );
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch ( Exception e ) {
			e.printStackTrace();
		}		
	}

}
