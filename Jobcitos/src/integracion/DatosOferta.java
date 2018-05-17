package integracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

import excepciones.InconsistenciaDeDatos;
import negocio.TransferOferta;

public class DatosOferta implements DAOOferta{
	
	private File ficheroOfertas;
	private HashMap<String, TransferOferta> mapaOfertas;
	
	public DatosOferta(File f) {
		this.ficheroOfertas = f;
		this.mapaOfertas = new HashMap<String, TransferOferta>();
	}
	
	public void cargarOfertas() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(this.ficheroOfertas)));
		
	}

	public void guardarOfertas() throws IOException {
		PrintWriter pw = new PrintWriter(new FileOutputStream(this.ficheroOfertas));
		
	}
	
	public void insertarOferta(TransferOferta to) throws InconsistenciaDeDatos{
		if(this.mapaOfertas.get(to.getId()) != null)
			throw new InconsistenciaDeDatos("No se ha podido insertar la oferta. Ya existe una con la misma identificacion (mismo nombre y mismo ofertante)");
		
		this.mapaOfertas.put(to.getId(), to);
	}
	
	public void eliminarOferta(TransferOferta to) throws InconsistenciaDeDatos{
		if(this.mapaOfertas.remove(to) == null)
			throw new InconsistenciaDeDatos("No se ha podido eliminar la oferta (oferta inexistente)");
	}
	
	public void reemplazarOferta(String id, TransferOferta to) throws InconsistenciaDeDatos{
		if(!this.mapaOfertas.containsValue(id))
			throw new InconsistenciaDeDatos("No se ha podido reemplazar la oferta (oferta anterior no existente)");
		
		this.mapaOfertas.put(to.getId(), to);
			
	}
	
	public TransferOferta obtenerOferta(String id) throws InconsistenciaDeDatos{
		TransferOferta to;
		
		to = this.mapaOfertas.get(id);
		
		if(to == null)
			throw new InconsistenciaDeDatos("No se ha podido obtener la oferta deseada (oferta no existente)");
		
		return to;
	}
	
	private TransferOferta cargarOferta(String textoTransferOferta) throws InconsistenciaDeDatos{
		return null;
	}
	
	private void guardarOferta(TransferOferta to){
		
	}
	
}
