package co.habi.phptravels.questions;

import static co.habi.phptravels.userinterface.PostPage.LABEL_POST;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.Text.of;

public class PostCreate implements Question<Boolean> {

	private String question;
	private boolean result = false;

	public PostCreate(String question) {
		this.question = question;
	}

	public static PostCreate toThe(String question) {
		return new PostCreate(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		String post  = of(LABEL_POST).viewedBy(actor).asString();
		
		if ( question.equals( post ) ) {
			result = true;
		} 				
		return result;
	}

}
