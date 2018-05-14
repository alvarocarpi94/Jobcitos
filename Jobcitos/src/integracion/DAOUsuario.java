package integracion;

import java.util.ArrayList;

import controllers.TransferUsuario;

public class DAOUsuario {
	//
	ArrayList<TransferUsuario> listaUsuario;
	
	public DAOUsuario(){
		listaUsuario = new ArrayList<TransferUsuario>();
		TransferUsuario usu1 = new TransferUsuario();
		TransferUsuario usu2 = new TransferUsuario();
		listaUsuario.add(usu1);
		listaUsuario.add(usu2);
	}
	
	public ArrayList<TransferUsuario> getListaUsuario(){
		return listaUsuario;
	}
	
	public TransferUsuario getUsuario(int i){
		return listaUsuario.get(i);
	}
	
	public void updateUsuario(TransferUsuario usu){
		/*listaUsuario.get(usu.getid()).setNombreUsuario();
		listaUsuario.get(usu.getid()).setContraseña();*/
		
	}
	


}
