package integracion;
//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import negocio.TransferOferta;
import negocio.TransferUsuario;
import utils.MyStringUtils;

public class ImpDAOOferta implements DAOOferta{
	
	private File ficheroOfertas;
	private static ImpDAOOferta instancia = null;
	String ruta = "Ofertas.txt";
	//constructora privada de la clase
	private ImpDAOOferta(){
            this.ficheroOfertas = new File(ruta);
	}
	

	public static ImpDAOOferta getInstanceOfImplDAOOferta() {
		if(ImpDAOOferta.instancia == null)
			ImpDAOOferta.instancia = new ImpDAOOferta();
		
		return ImpDAOOferta.instancia;
	}
	
	

	public TransferOferta guardarOferta(TransferOferta tOferta) {//usuario no tiene candidatos
		File file = this.ficheroOfertas;
		try{
           if(!file.exists()){
        	   System.out.println("El fichero no existe");
            }
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String lista = this.recorreListaCandi(tOferta.getCandidatos());
			String linea = new String(tOferta.getId() + " " + tOferta.getTitulo() + " " + tOferta.getDescripcion()+ " " + 
     				 tOferta.getLocalizacion() + " " + tOferta.getOfertante() + " " +tOferta.getTrabajadorContratado()+" "+
    				   +tOferta.getPrecioAcordado()+" "+tOferta.getPagado()+lista+ "\n");
			bw.write(linea);
			bw.close();
		}catch(IOException e){
			System.out.print("ESCORIA");
		}
		return tOferta;
	}
	
	public void modificarOferta(TransferOferta tOferta, boolean actualizar) {
		File File = this.ficheroOfertas;
		try{
		    File tempFile = new File(this.ficheroOfertas.getAbsolutePath() + ".tmp");
		    BufferedReader br = new BufferedReader(new FileReader(this.ficheroOfertas));
		    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		    String lista = this.recorreListaCandi(tOferta.getCandidatos());
		    String line = null;
		    while ((line = br.readLine()) != null) {
		        if (!line.split(" ")[0].equals(tOferta.getId())) {
		            pw.println(line);
		            pw.flush();
		        }else{
		      	   if(actualizar){
		      		   pw.println(tOferta.getId() + " " + tOferta.getTitulo() + " " + tOferta.getDescripcion()+ " " + 
		      				 tOferta.getLocalizacion() + " " + tOferta.getOfertante() + " " +tOferta.getTrabajadorContratado()+" "+
		      				   +tOferta.getPrecioAcordado()+" "+tOferta.getPagado()+lista);
		      		   pw.flush();
		      	   }
		       }
		    }
		    pw.close();
		    br.close();
		    if (!File.delete()) {
		        System.out.println("No se puede borrar el archivo.");
		    }
		    if (!tempFile.renameTo(File)){
		        System.out.println("No se puede renombrar ela archivo.");
		    }
		}catch (FileNotFoundException ex) {
		    ex.printStackTrace();
		}catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
	
	
	@Override
	public TransferOferta obtenerOferta(String id){
		TransferOferta tOferta = null;
                File file = this.ficheroOfertas;
		try{
			FileReader archivo = new FileReader(file);
			BufferedReader bf = new BufferedReader(archivo);
			String mail = "";
			String bfRead;
			while(!(bfRead = bf.readLine()).equals(null)){
				mail = bfRead.split(" ")[0];
				if(mail.equals(id)){
					tOferta = new TransferOferta(bfRead.split(" ")[0], bfRead.split(" ")[1], bfRead.split(" ")[2], bfRead.split(" ")[3],
							bfRead.split(" ")[4],bfRead.split(" ")[5],bfRead.split(" ")[6],bfRead.split(" ")[7],bfRead.split(" ")[8]);
					//bf.close();
				}
			}
			bf.close();
		}catch(Exception e){
		}
		return tOferta;
	}
	
	private String recorreListaCandi(List<String> listaCadiatos){
		String cadena = "null";
		for(int i = 0; i< listaCadiatos.size(); i++){
			if(i < listaCadiatos.size() - 1){
				cadena = cadena + listaCadiatos.get(i) + ";";
			}else{
				cadena = cadena + listaCadiatos.get(i);
			}
		}
		return cadena;
	}

	
}
