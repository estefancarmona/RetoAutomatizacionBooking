package com.bancolombia.certificacion.retoautomatizacion.userinterfaces;

public enum PaginaInicio {

	BOOKING("https://www.booking.com/");

    private final String url;

   PaginaInicio(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
