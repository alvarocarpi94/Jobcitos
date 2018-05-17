package util;

public class MyStringUtils {
	
	private static final String cadenaComposicion = "-";
	private static final String cadenaSeparadora = "/";
	
	public static String componerCadena(String cad1, String cad2){
		return cad1 + MyStringUtils.cadenaComposicion + cad2;
	}
	
	public static String juntarCadenasConSeparador(String cad1, String cad2){
		return cad1 + MyStringUtils.cadenaSeparadora + cad2;
	}

}
