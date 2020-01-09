package com.bancolombia.certificacion.retoautomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaBuscarHotel {

	public static final Target CIUDAD = Target.the("ciudad").locatedBy("//input[@id='ss']");
	public static final Target SELECIONAR_CIUDAD = Target.the("ciudad").locatedBy("//li[contains(@class,'c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--city')]");
	public static final Target OPCION_FECHA_IDA = Target.the("ida").locatedBy("//div[contains(@class,'xp__dates-inner xp__dates__checkin')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]");
	public static final Target FECHA_IDA= Target.the("dia").locatedBy("//div[contains(@class,'bui-calendar__main b-a11y-calendar-contrasts')]//div[1]//table[1]//tbody[1]//tr[4]//td[3]");
	public static final Target OPCION_FECHA_LLEGADA = Target.the("fecha llegada").locatedBy("//div[contains(@class,'xp__dates-inner xp__dates__checkout')]//span[contains(@class,'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb')]");
	public static final Target FECHA_LLEGADA = Target.the("llegada").locatedBy("//body[@id='b2indexPage']/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/span[1]");
	public static final Target BTN_BUSCAR = Target.the("bnt buscar").locatedBy("//span[contains(text(),'Buscar')]");
	
	
}
