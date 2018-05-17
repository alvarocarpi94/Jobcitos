package integracion;

import negocio.TransferUsuario;

public interface DAOUsuario {
	
	public void cargarUsuarios();
	public void guardarUsuarios();
	public void insertarUsuario(TransferUsuario tUsu);
	public void eliminarUsuario(TransferUsuario tUsu);
	public void actualizarUsuario(TransferUsuario tUsu);
	public TransferUsuario obtenerUsuario(String id);


}
