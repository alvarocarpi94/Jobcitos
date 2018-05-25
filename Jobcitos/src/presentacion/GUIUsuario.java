package presentacion;

public class GUIUsuario {
	
	private Controlador ctrl;
	public GUIUsuario(Controlador ctrl){
		initGUI();
		this.ctrl = ctrl;
	}
	
	public void initGUI(){
		 java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new interfazLogin(ctrl).setVisible(true);
	            }
	        });
	}
}
