package co.habi.phptravels.tasks;

import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_NAME;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_TR;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_AR;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_DE;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_VI;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_ES;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_RU;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_FA;
import static co.habi.phptravels.userinterface.AddCategoriesPage.INPUT_FR;
import static co.habi.phptravels.userinterface.AddCategoriesPage.BUTTON_ADD;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Click.on;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

/**
 * 
 * @author cristian.morera
 * Clase que implementa la tarea de realizar el login 
 */

public class InputFormCategorie implements Task {

	private String txtName;
	private String txtTurkish;
	private String txtArabic;
	private String txtGerman;
	private String txtVietnamese;
	private String txtSpanish;
	private String txtRussian;
	private String txtFarsi;
	private String txtFrench;

	public InputFormCategorie( String strName, String strTurkish, String strArabic, String strGerman, String strVietnamese,
			String strSpanish, String strRussian, String strFarsi, String strFrench ) {
		this.txtName 		= strName;
		this.txtTurkish 	= strTurkish;
		this.txtArabic 		= strArabic;
		this.txtGerman 		= strGerman;
		this.txtVietnamese 	= strVietnamese;
		this.txtSpanish 	= strSpanish;
		this.txtRussian 	= strRussian;
		this.txtFarsi 		= strFarsi;
		this.txtFrench 		= strFrench;
	}

	public static InputFormCategorie onThePage(String strName, String strTurkish, String strArabic, String strGerman, String strVietnamese,
			String strSpanish, String strRussian, String strFarsi, String strFrench ) {
		
		return instrumented(InputFormCategorie.class, strName, strTurkish, strArabic, strGerman, strVietnamese,
				strSpanish, strRussian, strFarsi, strFrench);
	}

	@Override
	public <T extends Actor> void performAs( T actor ) {
		actor.attemptsTo(
				theValue( txtName ).into(INPUT_NAME), 
				theValue( txtTurkish ).into(INPUT_TR),
				theValue( txtArabic ).into(INPUT_AR),
				theValue( txtGerman ).into(INPUT_DE),
				theValue( txtVietnamese ).into(INPUT_VI),
				theValue( txtSpanish ).into(INPUT_ES), 
				theValue( txtRussian ).into(INPUT_RU),
				theValue( txtFarsi ).into(INPUT_FA),
				theValue( txtFrench ).into(INPUT_FR),
				on(BUTTON_ADD) );
	}
}
