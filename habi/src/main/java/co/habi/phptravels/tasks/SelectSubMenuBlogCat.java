package co.habi.phptravels.tasks;

import org.openqa.selenium.TimeoutException;

import static co.habi.phptravels.userinterface.PrincipalPage.BUTTON_BLOG_CAT;
import co.habi.phptravels.utils.GenericTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;

public class SelectSubMenuBlogCat implements Task {
	
	public static SelectSubMenuBlogCat selectSubMenuBlogCat() {
		return instrumented( SelectSubMenuBlogCat.class );
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo( GenericTime.WaitUntil(BUTTON_BLOG_CAT),on(BUTTON_BLOG_CAT) );
		} catch ( TimeoutException e ) {
			System.out.println( "ERROR: Tiempo de espera excedido" + e );
		} catch ( Exception e ) {
			e.printStackTrace();
		}		
	}

}
