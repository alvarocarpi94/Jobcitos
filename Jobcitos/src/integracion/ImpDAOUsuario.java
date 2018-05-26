package integracion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import negocio.TransferUsuario;

public class ImpDAOUsuario implements DAOUsuario{
	
	private File file;
	private static ImpDAOUsuario instancia = null;
	
	//constructora privada de la clase
	private ImpDAOUsuario(){
		this.file = new File("Usuarios.txt");
	}
	
	//patrón Singleton
	public static ImpDAOUsuario getInstanceOfImpDAOUsuario(){
		if(ImpDAOUsuario.instancia == null){
			ImpDAOUsuario.instancia = new ImpDAOUsuario();
		}
		return ImpDAOUsuario.instancia;
	}
	
	//guarda un usuario
	@Override
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario) {//usuario no tiene candidatos
		File file = this.file;
		try{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String lista = this.recorreListaOfertas(tUsuario.getlistaOfertas());
			String linea = new String(tUsuario.getId() + " " + tUsuario.getContrasenia()+ " " + tUsuario.getNombre() + " " + tUsuario.getApellido() + " "
									+ tUsuario.getMediaOfertante() + " " + tUsuario.getMediaTrabajador()+ " " + lista +  "\n");
			bw.write(linea);
			bw.close();
		}catch(IOException e){
			System.out.print("ESCORIA");
		}
		return tUsuario;
	}
	//cambia todos los campos del usuario menos email porque busca a traves de este campo
	@Override
	public void modificarUsuario(TransferUsuario tUsuario, boolean actualizar) {
		File File = this.file;
		try{
		    File tempFile = new File(this.file.getAbsolutePath() + ".tmp");
		    BufferedReader br = new BufferedReader(new FileReader(this.file));
		    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		    String lista = this.recorreListaOfertas(tUsuario.getlistaOfertas());
		    String line = null;
		    while ((line = br.readLine()) != null) {
		        if (!line.split(" ")[0].equals(tUsuario.getId())) {
		            pw.println(line);
		            pw.flush();
		        }else{
		      	   if(actualizar){
		      		   pw.println(tUsuario.getId() + " " + tUsuario.getContrasenia() + " " + tUsuario.getNombre() + " " + 
			          			tUsuario.getMediaOfertante() + " " + tUsuario.getMediaTrabajador() + " " + lista);
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
	
	//muestra una lista de usuarios con los mismos nombres y apellidos
	@Override
	public List<TransferUsuario> buscarUsuarios(String nombre, String apellido){
		List<TransferUsuario> listaUsuarios = null;
		try{
			FileReader archivo = new FileReader(file);
			BufferedReader bf = new BufferedReader(archivo);
			String linea = "";
			String linea2 = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				linea = bfRead.split(" ")[2];
				linea2 = bfRead.split(" ")[3];
				if(linea.equals(nombre) && linea2.equals(apellido)){
					listaUsuarios = new ArrayList<TransferUsuario>();
					Integer[] mediaOfertante = new Integer[2];
					Integer[] mediaTrabajador = new Integer[2];
					mediaOfertante[0] = Integer.parseInt(bfRead.split(" ")[4].split("-")[0]);
					mediaOfertante[1] = Integer.parseInt(bfRead.split(" ")[4].split("-")[1]);
					mediaTrabajador[0] = Integer.parseInt(bfRead.split(" ")[5].split("-")[0]);
					mediaTrabajador[1] = Integer.parseInt(bfRead.split(" ")[5].split("-")[1]);
					listaUsuarios.add(new TransferUsuario(bfRead.split(" ")[0], bfRead.split(" ")[1], bfRead.split(" ")[2], bfRead.split(" ")[3],
								mediaOfertante, mediaTrabajador, bfRead.split(" ")[6]));
					bf.close();
				}
			}
			bf.close();
		}catch(Exception e){
		}
		return listaUsuarios;
	}
	
	//muestra un usuario buscado por id
	@Override
	public TransferUsuario buscarUsuario(String id){
		TransferUsuario UsuarioT = null;
		try{
			FileReader archivo = new FileReader(file);
			BufferedReader bf = new BufferedReader(archivo);
			String mail = "";
			String bfRead;
			while(!(bfRead = bf.readLine()).equals(null)){
				mail = bfRead.split(" ")[0];
				if(mail.equals(id)){
					Integer[] mediaOfertante = new Integer[2];
					Integer[] mediaTrabajador = new Integer[2];
					mediaOfertante[0] = Integer.parseInt(bfRead.split(" ")[4].split("-")[0]);
					mediaOfertante[1] = Integer.parseInt(bfRead.split(" ")[4].split("-")[1]);
					mediaTrabajador[0] = Integer.parseInt(bfRead.split(" ")[5].split("-")[0]);
					UsuarioT = new TransferUsuario(bfRead.split(" ")[0], bfRead.split(" ")[1], bfRead.split(" ")[2], bfRead.split(" ")[3],
							mediaOfertante, mediaTrabajador, bfRead.split(" ")[6]);
					bf.close();
				}
			}
			bf.close();
		}catch(Exception e){
		}
		return UsuarioT;
	}
	
	//Metodo privado que recorre el arraylist y lo convierte en un String
	private String recorreListaOfertas(List<String> listaOfertas){
		String cadena = "";
		for(int i = 0; i< listaOfertas.size(); i++){
			if(i < listaOfertas.size() - 1){
				cadena = cadena + listaOfertas.get(i) + ";";
			}else{
				cadena = cadena + listaOfertas.get(i);
			}
		}
		return cadena;
	}

}
