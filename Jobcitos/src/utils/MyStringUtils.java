package util;

public class MyStringUtils {
	
	private static final String cadenaSeparadora = "/";
	private static final String cadenaJuntarElementos = ";";
	
	public static String ponerSeparadorEntreCadenas(String cad1, String cad2){
		return cad1 + MyStringUtils.cadenaSeparadora + cad2;
	}
	
	public static String juntarElementos(String elem1, String elem2){
		return elem1 + MyStringUtils.cadenaJuntarElementos + elem2;
	}

}
