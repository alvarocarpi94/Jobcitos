package oferta;

import java.util.ArrayList;
import java.util.List;

public class TransferOferta {
	
	private String id;
	private String titulo;
	private String descripcion;
	private String localizacion;
	private String ofertante;
	private String trabajadorContratado;
	private List<String> candidatos;
	private double precioAcordado;
	private boolean pagado;
	
	public TransferOferta(String ident, String tit, String desc, String loc, String of, String trab, List<String> cand, double prAc, boolean p) {
		this.id = ident;
		this.titulo = tit;
		this.descripcion = desc;
		this.localizacion = loc;
		this.ofertante = of;
		this.trabajadorContratado = trab;
		this.candidatos = cand;
		this.precioAcordado = prAc;
		this.pagado = p;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getLocalizacion() {
		return this.localizacion;
	}
	
	public String getOfertante() {
		return this.ofertante;
	}
	
	public String getTrabajadorContratado() {
		return this.trabajadorContratado;
	}
	
	public List<String> getCandidatos(){
		return this.candidatos;
	}
	
	public double getPrecioAcordado(){
		return this.precioAcordado;
	}
	
	public boolean getPagado() {
		return this.pagado;
	}
	
	public void setId(String ident){
		this.id = ident;
	}
	
	public void setTitulo(String tit){
		this.titulo = tit;
	}
	
	public void setDescripcion(String desc){
		this.titulo = desc;
	}
	
	public void setLocalizacion(String loc) {
		this.localizacion = loc;
	}
	
	public void setOfertante(String ofer) {
		this.ofertante = ofer;
	}
	
	public void setTrabajadorContratado(String trab) {
		this.trabajadorContratado = trab;
	}
	
	public void setCandidatos(List<String> cand){
		this.candidatos = cand;
	}
	
	public void setPrecioAcordado(double prAc){
		this.precioAcordado = prAc;
	}
	
	
	public void setPagado(boolean p) {
		this.pagado = p;
	}
	
}
