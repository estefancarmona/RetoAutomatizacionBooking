
# language: es

@tag
Característica: Realizar una busqueda de un hotel en la pagina Booking aplicandole un filtro de busqueda
  
  
  #------------------------------------------------------------------------------------
  @ConvenioQueNoExiste
  Escenario: El usuario realiza una busqueda de un hotel, aplicando un filtro
    Dado que el usuario quiere  abrir la pagina booking
    Cuando realiza la busqueda de un hotel con su filtro
    Entonces aparece los diferentes hoteles
