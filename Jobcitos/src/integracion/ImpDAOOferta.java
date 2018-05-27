package integracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import negocio.TransferOferta;
import util.MyStringUtils;

public class ImpDAOOferta implements DAOOferta{
	
	private static ImpDAOOferta instancia = null;
	private static String nombreFichero = "Ofertas.txt";
	private File ficheroOfertas;
	private Map<String, String> mapaOfertas;
	
	private ImpDAOOferta() {
		this.ficheroOfertas = new File(ImpDAOOferta.nombreFichero);
		this.mapaOfertas = new HashMap<String, String>();
	}
	
	public static ImpDAOOferta getInstanceOfImplDAOOferta() {
		if(ImpDAOOferta.instancia == null)
			ImpDAOOferta.instancia = new ImpDAOOferta();
		
		return ImpDAOOferta.instancia;
	}
	
	public void cargar() throws IOException{
		String[] datOfSep;
		String ofertaFormatoTexto;
		BufferedReader bf;
		
		if(!this.ficheroOfertas.createNewFile() && !this.ficheroFuenteVacio()) {
			bf = new BufferedReader(new InputStreamReader(new FileInputStream(this.ficheroOfertas)));
			
			while((ofertaFormatoTexto = bf.readLine()) != null){
				datOfSep = ofertaFormatoTexto.split(MyStringUtils.getCadenaSeparadora());
				this.mapaOfertas.put(MyStringUtils.crearIdCompuesto(datOfSep[3], datOfSep[0]), ofertaFormatoTexto);
			}
			
			bf.close();
		}
		
	}

	public void guardar() throws IOException {
		PrintWriter pw = new PrintWriter(new FileOutputStream(this.ficheroOfertas));
		
		for(String id : this.mapaOfertas.keySet()){
			pw.write(this.mapaOfertas.get(id) + System.lineSeparator());
		}
		
		pw.close();
	}
	
	@Override
	public void insertarOferta(TransferOferta to){
		if(this.mapaOfertas.get(to.getId()) == null)
			this.guardarOfertaEnMapa(to);
	}
	
	@Override
	public void eliminarOferta(String idTransferOferta){
		this.mapaOfertas.remove(idTransferOferta);
	}
	
	@Override
	public void modificarOferta(String idTransOf, TransferOferta reemplazo){
		this.mapaOfertas.remove(idTransOf);
		this.guardarOfertaEnMapa(reemplazo);
	}
	
	@Override
	public TransferOferta obtenerOferta(String idTransferOferta){
		if(this.mapaOfertas.containsKey(idTransferOferta))
			return this.cargarTransferOferta(this.mapaOfertas.get(idTransferOferta));
		
		return null;
	}
	
	@Override
	public List<TransferOferta> buscarOfertas(String textoBusqueda){
		TransferOferta to;
		List<TransferOferta> listaTo = new ArrayList<TransferOferta>();
		
		for(String id : this.mapaOfertas.keySet()){

			to = this.cargarTransferOferta(this.mapaOfertas.get(id));
			
			if(to.getTitulo().contains(textoBusqueda) || to.getDescripcion().contains(textoBusqueda));
				listaTo.add(to);
		}
		
		return listaTo;
	}
	
	private TransferOferta cargarTransferOferta(String textoTransferOferta){
		int numDatosSeparados=9;
		String[] DatOfSep;
		String[] elemListaCandidatos;
		List<String> listaCandidatos;
		double prAcord;
		boolean pagado;
		
		DatOfSep = textoTransferOferta.split(MyStringUtils.getCadenaSeparadora());
		
		if(DatOfSep.length != numDatosSeparados)
			return null;
		
		listaCandidatos = new ArrayList<String>();
		elemListaCandidatos = DatOfSep[5].split(MyStringUtils.getCadenaJuntarElementos());
		
		for(String s : elemListaCandidatos){
			listaCandidatos.add(s);
		}
		
		prAcord = Double.parseDouble(DatOfSep[6]);
		pagado = Boolean.parseBoolean(DatOfSep[7]);
		
		return new TransferOferta(MyStringUtils.crearIdCompuesto(DatOfSep[0], DatOfSep[3]), DatOfSep[0], DatOfSep[1], DatOfSep[2], DatOfSep[3], DatOfSep[4], listaCandidatos, prAcord, pagado);
	}
	
	private void guardarOfertaEnMapa(TransferOferta to){
		Iterator<String> it;
		String OfertaFormatoTexto="";
		
		OfertaFormatoTexto += to.getTitulo() + MyStringUtils.getCadenaSeparadora();
		OfertaFormatoTexto += to.getDescripcion() + MyStringUtils.getCadenaSeparadora();
		OfertaFormatoTexto += to.getLocalizacion() + MyStringUtils.getCadenaSeparadora();
		OfertaFormatoTexto += to.getOfertante()+ MyStringUtils.getCadenaSeparadora();
		OfertaFormatoTexto += to.getTrabajadorContratado() + MyStringUtils.getCadenaSeparadora();
		
		if(!to.getCandidatos().isEmpty()){
			it = to.getCandidatos().iterator();
			OfertaFormatoTexto += it.next();
			
			while(it.hasNext()){
				OfertaFormatoTexto += MyStringUtils.getCadenaJuntarElementos() + it.next();
			}
		}
		OfertaFormatoTexto += MyStringUtils.getCadenaSeparadora();
		
		OfertaFormatoTexto += to.getPrecioAcordado() + MyStringUtils.getCadenaSeparadora();
		OfertaFormatoTexto += to.getPagado() + MyStringUtils.getCadenaSeparadora();
		
		this.mapaOfertas.put(to.getId(), OfertaFormatoTexto);
	}
	
	private boolean ficheroFuenteVacio() throws IOException{
		boolean vacio;
		BufferedReader bf;
		
		bf = new BufferedReader(new InputStreamReader(new FileInputStream(this.ficheroOfertas)));
		
		if(bf.readLine().isEmpty() && bf.readLine() == null)
			vacio=true;
		else
			vacio=false;
		
		bf.close();
		return vacio;
		
	}
	
}
