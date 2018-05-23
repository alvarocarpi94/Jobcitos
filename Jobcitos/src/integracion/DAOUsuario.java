package integracion;

import negocio.TransferUsuario;

public interface DAOUsuario {
	
	public TransferUsuario buscarUsuario(TransferUsuario tUsuario);
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario);
	public void modificarUsuario(TransferUsuario tUsuario, boolean actualizar);


}
