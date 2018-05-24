package integracion;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
// import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import negocio.TransferOferta;

public class ImplDAOOferta implements DAOOferta{
	
	private static ImplDAOOferta instancia=null;
	// private String nombreFichero = "Ofertas.txt";
	// private File ficheroOfertas;
	private Map<String, String> mapaOfertas;
	
	private ImplDAOOferta() {
		// this.ficheroOfertas = new File(this.nombreFichero);
		this.mapaOfertas = new HashMap<String, String>();
	}
	
	public static ImplDAOOferta getInstanceOfImplDAOOferta() {
		if(ImplDAOOferta.instancia == null)
			return new ImplDAOOferta();
		
		return ImplDAOOferta.instancia;
	}
	
	public void cargarOfertasEnMapa() throws IOException{
		// BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(this.ficheroOfertas)));
	}

	public void guardarOfertasEnFichero() throws IOException {
		// PrintWriter pw = new PrintWriter(new FileOutputStream(this.ficheroOfertas));
		
	}
	
	public void insertarOferta(TransferOferta to){
		if(this.mapaOfertas.get(to.getId()) == null)
			this.guardarOferta(to);
	}
	
	public void eliminarOferta(String idTransferOferta){
		this.mapaOfertas.remove(idTransferOferta);
	}
	
	public void reemplazarOferta(String idTransOf, TransferOferta reemplazo){
		this.mapaOfertas.remove(idTransOf);
		this.guardarOferta(reemplazo);
	}
	
	public TransferOferta obtenerOferta(String idTransferOferta){
		if(this.mapaOfertas.containsKey(idTransferOferta)){
			return this.cargarOferta(this.mapaOfertas.get(idTransferOferta));
		}
		
		return null;
	}
	
	private TransferOferta cargarOferta(String textoTransferOferta){
		return null;
	}
	
	private void guardarOferta(TransferOferta to){
		
	}
	
}
