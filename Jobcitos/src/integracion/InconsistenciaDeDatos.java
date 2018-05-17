package excepciones;

public class InconsistenciaDeDatos extends Exception{

	private static final long serialVersionUID = 1L;
	
	public InconsistenciaDeDatos(String mensaje){
		super(mensaje);
	}

}
