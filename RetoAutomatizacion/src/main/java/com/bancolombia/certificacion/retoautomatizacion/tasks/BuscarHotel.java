package com.bancolombia.certificacion.retoautomatizacion.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.certificacion.retoautomatizacion.interactions.DoubleClick;
import com.bancolombia.certificacion.retoautomatizacion.userinterfaces.PaginaBuscarHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarHotel implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("bogota").into(PaginaBuscarHotel.CIUDAD),
				Click.on(PaginaBuscarHotel.SELECIONAR_CIUDAD),
				Click.on(PaginaBuscarHotel.OPCION_FECHA_IDA),
				DoubleClick.on(PaginaBuscarHotel.FECHA_IDA),
				Click.on(PaginaBuscarHotel.OPCION_FECHA_LLEGADA),
				DoubleClick.on(PaginaBuscarHotel.FECHA_LLEGADA),
				Click.on(PaginaBuscarHotel.BTN_BUSCAR)
				);
				

	}
	
	
	public static BuscarHotel Booking() {
		return instrumented(BuscarHotel.class);
	}

}
