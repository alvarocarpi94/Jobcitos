package integracion;

import negocio.TransferUsuario;

public interface DAOUsuario {
	
	public TransferUsuario cargarUsuario(TransferUsuario tUsuario);
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario);
	public void insertarUsuario(TransferUsuario tUsuario);
	public void eliminarUsuario(TransferUsuario tUsuario);
	public void actualizarUsuario(TransferUsuario tUsuario);
	public TransferUsuario buscarUsuario(String usuario);


}
