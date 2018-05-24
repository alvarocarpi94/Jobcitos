package integracion;

import java.util.ArrayList;

import negocio.TransferUsuario;

public interface DAOUsuario {
	
	public ArrayList<TransferUsuario> buscarUsuarios(String nombre, String apellido);
	public TransferUsuario buscarUsuario(String id);
	public TransferUsuario guardarUsuario(TransferUsuario tUser);
	public void modificarUsuario(TransferUsuario tUsuario, boolean actualizar);


}
