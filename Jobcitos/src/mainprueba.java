import presentacion.Controlador;
import presentacion.interfazLogin;
import negocio.SA;


public class mainprueba {

	public static void main(String[] args) {
		SA servicio = new SA();
		interfazLogin v = new interfazLogin();
		Controlador ctrl = new Controlador(v,servicio);
		 java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new interfazLogin(ctrl).setVisible(true);
	            }
	        });
	}

}
