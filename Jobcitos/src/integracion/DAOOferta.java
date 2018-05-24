package integracion;

import negocio.TransferOferta;

public interface DAOOferta {
		
	public void insertarOferta(TransferOferta to);
	
	public void eliminarOferta(String idTransferOferta);	
	
	public void reemplazarOferta(String idTransOf, TransferOferta reemplazo);	
	
	public TransferOferta obtenerOferta(String idTransferOferta);	
	
		
}
