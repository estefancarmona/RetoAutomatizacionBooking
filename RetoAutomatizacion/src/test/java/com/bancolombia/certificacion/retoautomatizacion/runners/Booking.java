package com.bancolombia.certificacion.retoautomatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) 
@CucumberOptions( 
	
		features = "src/test/resources/features/busqueda_hotel_booking.feature", 
		glue = "com.bancolombia.certificacion.retoautomatizacion.stepdefinitions",		
		snippets = SnippetType.CAMELCASE
		)
public class Booking {

}
