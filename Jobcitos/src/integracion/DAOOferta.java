package integracion;

import java.io.IOException;
import java.util.List;

import negocio.TransferOferta;

public interface DAOOferta {
	public TransferOferta guardarOferta(TransferOferta tOferta);
	public void modificarOferta(TransferOferta tOferta, boolean actualizar);
	public TransferOferta obtenerOferta(String idTransOf);
	public List<TransferOferta> buscarOfertas(String textoBusqueda);

}
