package integracion;

import java.io.IOException;
import java.util.List;

import negocio.TransferOferta;

public interface DAOOferta {
	
	public void cargar() throws IOException;
	public void guardar() throws IOException;
	public void insertarOferta(TransferOferta to);
	public void eliminarOferta(String idTransfOf);
	public void modificarOferta(String idTransOf, TransferOferta reemplazo);
	public TransferOferta obtenerOferta(String idTransOf);
	public List<TransferOferta> buscarOfertas(String textoBusqueda);

}
