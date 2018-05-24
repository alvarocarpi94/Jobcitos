package integracion;

import java.util.ArrayList;

import negocio.TransferUsuario;

public interface DAOUsuario {
	
	public ArrayList<TransferUsuario> buscarUsuarios(TransferUsuario tUsuario);
	public TransferUsuario buscarUsuario(TransferUsuario tUsuario);
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario);
	public void modificarUsuario(TransferUsuario tUsuario, boolean actualizar);


}
