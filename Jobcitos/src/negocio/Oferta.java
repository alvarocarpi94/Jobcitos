package oferta;

import basededatos.DAOOferta;
import basededatos.ImplDAOOferta;

public class Oferta {
	
	private DAOOferta dao;
	private TransferOferta transOfer;
	
	public Oferta(TransferOferta to) {
		this.dao = ImplDAOOferta.getInstanceOfImplDAOOferta();
		this.transOfer = to;
	}
	
	public TransferOferta getTransferDeOferta() {
		return this.transOfer;
	}
	
	public void registrar() {
		this.dao.insertarOferta(this.transOfer);
	}
	
	public void eliminar() {
		this.dao.eliminarOferta(this.transOfer.getId());
	}
	
	public void modificar(TransferOferta to){
		this.dao.reemplazarOferta(this.transOfer.getId(), to);
		this.transOfer = to;
	}
	
	public void contratarTrabajador(String trabajador) {
		if(this.transOfer.getCandidatos().contains(trabajador))
			this.transOfer.setTrabajadorContratado(trabajador);
		
		this.dao.reemplazarOferta(this.transOfer.getId(), this.transOfer);
	}
	
	public void agregarCandidato(String candidato) {
		this.transOfer.getCandidatos().add(candidato);
		this.dao.reemplazarOferta(this.transOfer.getId(), this.transOfer);
	}
	
	public void eliminarCandidato(String candidato) {
		this.transOfer.getCandidatos().remove(candidato);
		this.dao.reemplazarOferta(this.transOfer.getId(), this.transOfer);
	}

	public void pagarAlTrabajador() {
		if(this.seHaAcordadoPrecio())
			this.transOfer.setPagado(true);
	}
	
	private boolean seHaAcordadoPrecio(){
		return this.transOfer.getPrecioAcordado()>0;
	}
	
}
