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
        	this.Trabajador = idTrabajador;
        	return true;
        }
    }

    public void ofertaPagada(){
        this.pagado = true;
    }

    public void añadirCandidato(String trabajador){
        this.listaCandidatos.add(trabajador);
    }
}
