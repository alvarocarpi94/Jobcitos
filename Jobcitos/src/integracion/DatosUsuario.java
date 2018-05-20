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

public class DatosUsuario implements DAOUsuario{
	
	private ArrayList<TransferUsuario> listaUsuarios;

	public DatosUsuario(){
		listaUsuarios = new ArrayList<TransferUsuario>();
	}
	
	@Override
	public TransferUsuario cargarUsuario(TransferUsuario tUsuario){
		TransferUsuario usuarioBD = buscarUsuario(tUsuario.getId());
		if(usuarioBD != null){
			return usuarioBD;
		}
		return null;
	}

	@Override
	public TransferUsuario guardarUsuario(TransferUsuario tUsuario) {
		String nombreFichero = "Usuarios.txt";
		File fichero= new File(nombreFichero);
		try{
			FileWriter fw = new FileWriter(fichero);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(tUsuario.getId() + " " + tUsuario.getContrasenia()+ " " + tUsuario.getNombre()
			+ " " + tUsuario.getMediaOfertante() + " " + tUsuario.getMediaTrabajador()+ " " + tUsuario.getlistaOfertas() + " " + tUsuario.getlistaCandidatos() + "\n");
		}catch(Exception e){}
		
		return null;
	}

	@Override
	public void insertarUsuario(TransferUsuario tUsuario) {
		listaUsuarios.add(tUsuario);
		guardarUsuario(tUsuario);
	}

	@Override
	public void eliminarUsuario(TransferUsuario tUsuario) {
		listaUsuarios.remove(tUsuario);
		//eliminar en archivo
		 try {
		        File File = new File("Usuarios.txt");
		        File tempFile = new File(File.getAbsolutePath() + ".tmp");
		        BufferedReader br = new BufferedReader(new FileReader("Usuarios.txt"));
		        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		        String line = null;
		        while ((line = br.readLine()) != null) {
		            if (!line.trim().equals(tUsuario.getId())) {
		                pw.println(line);
		                pw.flush();
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
	public void actualizarUsuario(TransferUsuario tUsuario) {
		for(int i = 0; i < listaUsuarios.size(); i++){
			if(tUsuario.getId() == listaUsuarios.get(i).getId()){
				listaUsuarios.set(i, tUsuario);
			}
		}
		//escribir en archivo
	}
	//buscar usuario por nombre y apellidos
	@Override
	public TransferUsuario buscarUsuario(String usuario){
		try{
			TransferUsuario usuarioT = null;
			String nombre = usuario.split(" ")[0];
			String apellido =usuario.split(" ")[1];
			FileReader archivo = new FileReader("Usuarios.txt");
			BufferedReader bf = new BufferedReader(archivo);
			String linea = "";
			String linea2 = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null){
				linea = bfRead.split(" ")[2];
				linea2 = bfRead.split(" ")[3];
				if(linea.equals(nombre) && linea2.equals(apellido)){
					//usuarioT = new TransferUsuario(bfRead.split(" ")[0], bfRead.split(" ")[1], linea+" "+linea2);
					bf.close();
					return usuarioT;
				}
			}
			bf.close();
		}catch(Exception e){
			System.out.println("El archivo no existe.");
		}
		return null;
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
