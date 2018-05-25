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

import negocio.TransferUsuario;

public class ImpDAOUsuario implements DAOUsuario{
	
	private File file;
	
	public ImpDAOUsuario(File f){
		this.file = f;
	}
	
	@Override
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario) {//usuario no tiene candidatos
		try{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			String lista = recorreListaOfertas(tUsuario.getlistaOfertas());
			pw.println(tUsuario.getId() + " " + tUsuario.getContrasenia()+ " " + tUsuario.getNombre()  
			+ " " + tUsuario.getMediaOfertante() + " " + tUsuario.getMediaTrabajador()+ " " + lista +  "\n");
			pw.close();
		}catch(Exception e){}
		
		return null;
	}
	
	@Override
	public void modificarUsuario(TransferUsuario tUsuario, boolean actualizar) {
		 try {
		        File File = new File("Usuarios.txt");
		        File tempFile = new File(File.getAbsolutePath() + ".tmp");
		        BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"));
		        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		        String lista = recorreListaOfertas(tUsuario.getlistaOfertas());
		        String line = null;
		        while ((line = br.readLine()) != null) {
		            if (!line.trim().equals(tUsuario.getId())) {
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
		    } catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
	}
	@Override
	//Buscar por nombre y apellidos !!!!!!!!
	public ArrayList<TransferUsuario> buscarUsuarios(String nombre, String apellido){
		ArrayList<TransferUsuario> listaUsuarios = null;
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
			System.out.println("El archivo no existe.");
		}
		return listaUsuarios;
	}
	@Override
	//Buscar por id!!!!!
	public TransferUsuario buscarUsuario(String id){
		TransferUsuario UsuarioT = null;
		try{
			FileReader archivo = new FileReader(file);
			BufferedReader bf = new BufferedReader(archivo);
			String mail = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				mail = bfRead.split("")[0];
				if(mail.equals(id)){
					Integer[] mediaOfertante = new Integer[2];
					Integer[] mediaTrabajador = new Integer[2];
					mediaOfertante[0] = Integer.parseInt(bfRead.split(" ")[4].split("-")[0]);
					mediaOfertante[1] = Integer.parseInt(bfRead.split(" ")[4].split("-")[1]);
					mediaTrabajador[0] = Integer.parseInt(bfRead.split(" ")[5].split("-")[0]);
					mediaTrabajador[1] = Integer.parseInt(bfRead.split(" ")[5].split("-")[1]);
					UsuarioT = new TransferUsuario(bfRead.split(" ")[0], bfRead.split(" ")[1], bfRead.split(" ")[2], bfRead.split(" ")[3],
							mediaOfertante, mediaTrabajador, bfRead.split(" ")[6]);
					bf.close();
				}
			}
			bf.close();
		}catch(Exception e){
			System.out.println("El archivo no existe.");
		}
		return UsuarioT;
	}
	//Metodo privado que recorre el arraylist y lo convierte en un String
	private String recorreListaOfertas(ArrayList<String> listaOfertas){
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
	//buscar usuario por email/IdUsuario
	/*public TransferUsuario buscarUsuario(String usuario){
		try{
			TransferUsuario usuarioT = null;
			FileReader archivo = new FileReader("Usuarios.txt");
			BufferedReader bf = new BufferedReader(archivo);
			String linea = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				linea = bfRead.split(" ")[0];
				if(linea.equals(usuario)){
					usuarioT = new TransferUsuario(bfRead.split(" ")[0], bfRead.split(" ")[1], bfRead.split(" ")[2]+" "+bfRead.split(" ")[3]);
					bf.close();
					return usuarioT;
				}
			}
			bf.close();
		}catch(Exception e){
			System.out.println("El archivo no existe.");
		}
		return null;
	}*/

}

