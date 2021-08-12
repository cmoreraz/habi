package co.habi.phptravels.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(	features	= "src/test/resources/co/habi/phptravels/features/create_post.feature",
					glue		= "co.habi.phptravels.stepdefinitions",
					snippets 	= SnippetType.CAMELCASE)
public class CreatePostRunner {}