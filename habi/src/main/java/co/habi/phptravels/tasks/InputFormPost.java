package co.habi.phptravels.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.habi.phptravels.userinterface.AddPostPage.INPUT_TITLE;
import static co.habi.phptravels.userinterface.AddPostPage.INPUT_LINK;
import static co.habi.phptravels.userinterface.AddPostPage.INPUT_KEYWORDS;
import static co.habi.phptravels.userinterface.AddPostPage.INPUT_DESC;
import static co.habi.phptravels.userinterface.AddPostPage.SELECT_CAT;
import static co.habi.phptravels.userinterface.AddPostPage.SELECT_NAME_CAT;
import static co.habi.phptravels.userinterface.AddPostPage.BUTTON_SUBMIT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static net.serenitybdd.screenplay.actions.Scroll.to;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.byVisibleText;
import net.thucydides.core.annotations.Managed;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class InputFormPost implements Task {
	@Managed
	WebDriver driver;
	
	private String txtTitle;
	private String txtLink;
	private String txtCont;
	private String txtKeywords;
	private String txtDescription;
	public static int contador = 0;

	public InputFormPost(String strTitle, String strLink, String strCont, String strKeywords, String strDescription ) {
		this.txtTitle 		= strTitle;
		this.txtLink		= strLink;
		this.txtCont 		= strCont;
		this.txtKeywords 	= strKeywords;
		this.txtDescription = strDescription;
	}

	public static InputFormPost onThePage( String strTitle, String strLink, String strCont, String strKeywords, String strDescription ) {
		return instrumented(InputFormPost.class, strTitle, strLink, strCont, strKeywords, strDescription);
	}

	@Override
	public <T extends Actor> void performAs( T actor ) { 
		
		actor.attemptsTo(
				theValue( txtTitle ).into(INPUT_TITLE),
				theValue( txtLink, Keys.TAB, txtCont).into(INPUT_LINK),
				theValue( txtKeywords ).into(INPUT_KEYWORDS),
				theValue( txtDescription ).into(INPUT_DESC),				
				to(SELECT_CAT),
				byVisibleText("Categorie 3").from(SELECT_CAT),				
				on(SELECT_NAME_CAT),
				on(BUTTON_SUBMIT) );
	}
}
