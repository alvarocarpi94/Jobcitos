package integracion;

import negocio.TransferOferta;

public interface DAOOferta {
	
	public void insertarOferta(TransferOferta to);
	public void eliminarOferta(String idTransfOf);
	public void modificarOferta(String idTransOf, TransferOferta reemplazo);
	public TransferOferta obtenerOferta(String idTransOf);

}
