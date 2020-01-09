package com.bancolombia.certificacion.retoautomatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.certificacion.retoautomatizacion.userinterfaces.PaginaInicio;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task	;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task {

	private final PaginaInicio homePage;	
	
	public AbrirLaPagina(PaginaInicio homePage){
		this.homePage = homePage;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.url(homePage.url())
				);
		
	}
	
	public static AbrirLaPagina en(PaginaInicio homePage) {
		
		return instrumented(AbrirLaPagina.class, homePage);
	}

}
