package basededatos;

import java.io.IOException;

import excepciones.InconsistenciaDeDatos;
import oferta.TransferOferta;

public interface DAOOferta {
	
	public void cargarOfertas() throws IOException;
	public void guardarOfertas() throws IOException;
	public void insertarOferta(TransferOferta to) throws InconsistenciaDeDatos;
	public void eliminarOferta(TransferOferta to) throws InconsistenciaDeDatos;
	public void reemplazarOferta(String id, TransferOferta to) throws InconsistenciaDeDatos;
	public TransferOferta obtenerOferta(String id) throws InconsistenciaDeDatos;

}
