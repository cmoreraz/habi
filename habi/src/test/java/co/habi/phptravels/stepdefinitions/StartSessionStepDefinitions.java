package co.habi.phptravels.stepdefinitions;

import java.util.List;

import co.habi.phptravels.models.LoginData;
import co.habi.phptravels.tasks.Login;
import co.habi.phptravels.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * 
 * @author cristian.morera
 * Se realiza inicio de sesion
 *
 */

public class StartSessionStepDefinitions {
	
	@Before
    public void setTheStage( ) {
        OnStage.setTheStage( new OnlineCast( ) );
    }

	@Given("^on the home page Phptravels$")
	public void onthehomepagePhptravels() {
		OnStage.theActorCalled( "Andres" ).wasAbleTo( OpenBrowser.thePage());
	}

	@When("^enter my credentials$")
	public void entermycredentials( List<LoginData> loginData ) {
		OnStage.theActorCalled( "Andres" ).wasAbleTo( OpenBrowser.thePage(), Login.
                onThePage( loginData.get(0).getStrEmail(), loginData.get(0).getStrPassword() ));
	}

}
