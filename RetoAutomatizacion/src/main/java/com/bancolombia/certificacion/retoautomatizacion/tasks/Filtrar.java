package com.bancolombia.certificacion.retoautomatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.certificacion.retoautomatizacion.userinterfaces.PaginaHoteles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class Filtrar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PaginaHoteles.FILTRO)
				);
		
	}

	public static Filtrar Populares() {
		return instrumented(Filtrar.class);
	}
}
