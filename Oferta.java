package negocio;
import java.util.ArrayList;

public class Oferta {
    private ArrayList<String> listaCandidatos;
    private String Ofertante;
    private String Trabajador;
    private String Lugar;
    private boolean pagado;

    public Oferta(String Ofertante,String lugar){
        this.listaCandidatos = new ArrayList<String>();
        this.Ofertante = Ofertante;
        this.Trabajador = null;
        this.Lugar = lugar;
        this.pagado = false;
    }

    public boolean eliminarTrabajador(){
        if(this.Trabajador != null) {
            this.Trabajador = null;
            return true;
        }else return false;
    }

    public boolean añadirTrabajador(String idTrabajador){
        if(this.Trabajador != null) return false;
        else{
        	//TransferOferta transferO = new TransferOferta(); 
        	this.Trabajador = idTrabajador;
        	//transferO.setTrabajador(this.Trabajador);
        	return true;
        }
    }

    public void ofertaPagada(){
    	//TransferOferta transferO = new TransferOferta(); 
        this.pagado = true;
      //transferO.setPagada(this.pagada);
    }

    public void añadirCandidato(String trabajador){
    	//TransferOferta transferO = new TransferOferta(); 
        this.listaCandidatos.add(trabajador);
      //transferO.setCanditato(this.listaCandidatos);
    }
}
