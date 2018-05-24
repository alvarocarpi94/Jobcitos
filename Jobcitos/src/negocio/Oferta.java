package negocio;

import integracion.DAOOferta;
import integracion.ImplDAOOferta;

public class Oferta {
	
	private DAOOferta dao;
	private TransferOferta transOfer;
	
	public Oferta(TransferOferta to) {
		this.dao = ImplDAOOferta.getInstanceOfImplDAOOferta();
		this.transOfer = to;
	}
	
	public TransferOferta obtenerTransferDeOferta() {
		return this.transOfer;
	}
	
	public void registrar() {
		this.dao.insertarOferta(this.transOfer);
	}
	
	public void eliminar() {
		this.dao.eliminarOferta(this.transOfer.getId());
	}
	
	public void modificar(TransferOferta to){
		String idAntiguo;
		
		idAntiguo = this.transOfer.getId();
		this.transOfer = to;
		this.dao.modificarOferta(idAntiguo, this.transOfer);
		
	}
	
	public void contratarTrabajador(String trabajador) {
		if(this.transOfer.getCandidatos().contains(trabajador)) {
			
			if(!this.transOfer.getTrabajadorContratado().isEmpty())
				this.transOfer.getCandidatos().add(this.transOfer.getTrabajadorContratado());
			
			this.transOfer.getCandidatos().remove(trabajador);
			this.transOfer.setTrabajadorContratado(trabajador);
			
			this.dao.modificarOferta(this.transOfer.getId(), this.transOfer);
		}
			
	}
	
	public void agregarCandidato(String candidato) {
		this.transOfer.getCandidatos().add(candidato);
		this.dao.modificarOferta(this.transOfer.getId(), this.transOfer);
	}
	
	public void eliminarCandidato(String candidato) {
		this.transOfer.getCandidatos().remove(candidato);
		this.dao.modificarOferta(this.transOfer.getId(), this.transOfer);
	}

	public void pagarAlTrabajador() {
		if(this.seHaAcordadoPrecio())
			this.transOfer.setPagado(true);
		
		this.dao.modificarOferta(this.transOfer.getId(), this.transOfer);
	}
	
	private boolean seHaAcordadoPrecio(){
		return this.transOfer.getPrecioAcordado()>0;
	}
	
}
