package com.bancolombia.certificacion.retoautomatizacion.stepdefinitions;


import static com.bancolombia.certificacion.retoautomatizacion.userinterfaces.PaginaInicio.BOOKING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import com.bancolombia.certificacion.retoautomatizacion.tasks.AbrirLaPagina;
import com.bancolombia.certificacion.retoautomatizacion.tasks.BuscarHotel;
import com.bancolombia.certificacion.retoautomatizacion.tasks.Filtrar;


import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BookingStepDefinition {

	@Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Estefan"); 
    }
	
	
	@Dado("^que el usuario quiere  abrir la pagina booking$")
	public void queElUsuarioQuiereAbrirLaPaginaBooking() {
		theActorInTheSpotlight().wasAbleTo(
				AbrirLaPagina.en(BOOKING)
				);
	}

	@Cuando("^realiza la busqueda de un hotel con su filtro$")
	public void realizaLaBusquedaDeUnHotelConSuFiltro() {
		theActorInTheSpotlight().attemptsTo(BuscarHotel.Booking(),
				Filtrar.Populares());
	}

	@Entonces("^aparece los diferentes hoteles$")
	public void apareceLosDiferentesHoteles() {
	  
	}

	
}
