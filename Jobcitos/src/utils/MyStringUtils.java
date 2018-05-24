package util;

public class MyStringUtils {
	
	private static final String cadenaSeparadora = "/";
	private static final String cadenaJuntarElementos = ";";
	private static final String cadenaIdCompuesto = "-";
	
	public static String getCadenaSeparadora(){
		return MyStringUtils.cadenaSeparadora;
	}
	
	public static String getCadenaJuntarElementos(){
		return MyStringUtils.cadenaJuntarElementos;
	}
	
	public static String ponerSeparadorEntreCadenas(String cad1, String cad2){
		return cad1 + MyStringUtils.cadenaSeparadora + cad2;
	}
	
	public static String juntarElementos(String elem1, String elem2){
		return elem1 + MyStringUtils.cadenaJuntarElementos + elem2;
	}
	
	public static String crearIdCompuesto(String elem1, String elem2){
		return elem1.replaceAll("\\s+", MyStringUtils.cadenaJuntarElementos) + MyStringUtils.cadenaIdCompuesto + elem2.replaceAll("\\s+", MyStringUtils.cadenaJuntarElementos);
	}

}
