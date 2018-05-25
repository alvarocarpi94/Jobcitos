import negocio.TransferUsuario;
import integracion.ImpDAOUsuario;


public class Main {

	public static void main(String[] args) {
		ImpDAOUsuario dao= ImpDAOUsuario.getInstanceOfImpDAOUsuario();
		Integer media[]=new Integer[2];
		media[0]=22;
		media[1]=4;
		TransferUsuario tfu = new TransferUsuario("trancalarga@gmail.com", "1234", "javi", "maricon", media, media, "");
		dao.guardarUsuario(tfu);
		

	}

}
