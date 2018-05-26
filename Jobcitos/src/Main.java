import negocio.TransferUsuario;

import java.util.List;

import integracion.ImpDAOUsuario;


public class Main {

	public static void main(String[] args) {
		ImpDAOUsuario dao= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		Integer media[]=new Integer[2];
		media[0]=22;
		media[1]=4;
		TransferUsuario tfu = new TransferUsuario("trancalarga@gmail.com", "1234", "javi", "maricon", media, media, "null");
		dao.guardarUsuario(tfu);
		/*TransferUsuario tfu = null;
		tfu = dao.buscarUsuario("trancalarga@gmail.com");
		if(tfu != null){
			System.out.println("encontrado");
			System.out.println(tfu.getId() + " "+ tfu.getContrasenia() + " "+ tfu.getNombre()+ " "+ tfu.getApellido()+ " " + tfu.getMediaOfertante() + " " + tfu.getMediaTrabajador() + " "+ "nada");
		}else{
			System.out.println("fallo");
		}*/
		/*List<TransferUsuario> lista = dao.buscarUsuarios("javi", "maricon");
		for(int i = 0; i<lista.size(); i++){
			System.out.println(lista.get(i).getId() + " "+ lista.get(i).getContrasenia() + " "+ lista.get(i).getNombre()+ " "+ lista.get(i).getApellido()+ " " + lista.get(i).getMediaOfertante() + " " + lista.get(i).getMediaTrabajador() + " "+ "nada");
		}*/
		tfu.setNombre("javithe");
		dao.modificarUsuario(tfu, true);
	}

}
