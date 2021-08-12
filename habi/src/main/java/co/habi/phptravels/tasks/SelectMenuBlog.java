package co.habi.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import static co.habi.phptravels.userinterface.PrincipalPage.BUTTON_BLOG;
import static co.habi.phptravels.utils.GenericTime.WaitUntil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static net.serenitybdd.screenplay.actions.Click.on;

public class SelectMenuBlog implements Task {
	
	public static SelectMenuBlog selectMenuBlog() {
		return Tasks.instrumented( SelectMenuBlog.class );
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(WaitUntil(BUTTON_BLOG), on(BUTTON_BLOG) );
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch ( Exception e ) {
			e.printStackTrace();
		}		
	}

}
