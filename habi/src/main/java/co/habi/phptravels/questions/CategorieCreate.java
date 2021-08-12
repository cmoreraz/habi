package co.habi.phptravels.questions;

import static co.habi.phptravels.userinterface.CategoriesPage.LABEL_CAT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.Text.of;

public class CategorieCreate implements Question<Boolean> {

	private String question;
	private boolean result = false;

	public CategorieCreate(String question) {
		this.question = question;
	}

	public static CategorieCreate toThe(String question) {
		return new CategorieCreate(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		String categorie  = of(LABEL_CAT).viewedBy(actor).asString();
		
		if ( question.equals( categorie ) ) {
			result = true;
		} 				
		return result;
	}

}
