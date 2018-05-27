package negocio;

//
import integracion.DAOOferta;
import integracion.ImpDAOOferta;
import java.util.List;

public class Oferta {
	
	private DAOOferta dao;
	private TransferOferta transOfer;
	
	public Oferta(String id, String nombreO, String desc, String lugar, String of,
                                String trab, List<String> cand, double precio, boolean pagado) {
		this.dao = ImpDAOOferta.getInstanceOfImplDAOOferta();
		this.transOfer = new TransferOferta(id, nombreO, desc, lugar, of, trab, cand, precio, pagado);
	}
	
	public TransferOferta obtenerTransferDeOferta() {
		return this.transOfer;
	}
	
	public void registrar() {
            TransferOferta ofAux = this.dao.obtenerOferta(this.transOfer.getId());
            if(ofAux != null){
            	this.dao.guardarOferta(this.transOfer);
            }
	}
	
	public void eliminar() {
		this.dao.modificarOferta(this.transOfer, false);
	}
	
	public void modificar(TransferOferta to){
		this.dao.modificarOferta(this.transOfer, true);
	}
	
	public void contratarTrabajador(String trabajador) {
		if(this.transOfer.getCandidatos().contains(trabajador)) {
			
			if(!this.transOfer.getTrabajadorContratado().isEmpty())
				this.transOfer.getCandidatos().add(this.transOfer.getTrabajadorContratado());
			
			this.transOfer.getCandidatos().remove(trabajador);
			this.transOfer.setTrabajadorContratado(trabajador);
			
			this.dao.modificarOferta(this.transOfer, true);
		}
			
	}
	
	public void agregarCandidato(String candidato) {
		this.transOfer.getCandidatos().add(candidato);
		this.dao.modificarOferta(this.transOfer, true);
	}
	
	public void eliminarCandidato(String candidato) {
		this.transOfer.getCandidatos().remove(candidato);
		this.dao.modificarOferta(this.transOfer, true);
	}

	public void eliminarTrabajador(){
		this.transOfer.setTrabajadorContratado(null);
		this.dao.modificarOferta(this.transOfer, true);
	}
	
	public void pagarAlTrabajador() {
		if(this.seHaAcordadoPrecio())
			this.transOfer.setPagado(true);
		this.dao.modificarOferta(this.transOfer, true);
	}
	
	private boolean seHaAcordadoPrecio(){
		return this.transOfer.getPrecioAcordado()>0;
	}
	
	public void valorarOfertante(TransferUsuario tUser, int valoracion){
		tUser.setMediaOfertante(valoracion);
	}
	
	public void valorarTrabajador(TransferUsuario tUser, int valoracion){
		tUser.setMediaTrabajador(valoracion);
	}
}
