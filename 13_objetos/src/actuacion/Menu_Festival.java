package actuacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Festival {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		final int CREAR = 1;
		final int LISTAR = 2;
		final int ACTUALIZAR = 3;
		final int BORRAR = 4;
		final int SALIR = 0;
		int opcion;
		Festival navidad = new Festival();
		navidad.setNombre("Navifest");
		File f = new File("D:/Josu/Programación/actuacionesf.txt");
		ArrayList<Actuacion> listaActuaciones = new ArrayList();
		try {
			Scanner fich = new Scanner(f);
			String [] partesActuacion;
			String linea = scan.nextLine();
			partesActuacion = linea.split(":");
			Actuacion a = new Actuacion();
			a.setNombreGrupo(partesActuacion[0]);
			a.setDuracion(Integer.parseInt(partesActuacion[1]));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		do {
			System.out.println("---MENU---");
			System.out.println("1-Crear");
			System.out.println("2-Listar");
			System.out.println("3-Actualizar");
			System.out.println("4-Borrar");
			
			opcion = Integer.parseInt(scan.nextLine());
			
		} while (opcion != SALIR);
		
		switch (opcion) {
		case CREAR:
			System.out.println("Nombre del grupo?");
			String nombreGrupo = scan.nextLine();
			System.out.println("Duracion de la actuacion?");
			int duracion = scan.nextInt();
			
			Actuacion a = new Actuacion();
			a.setNombreGrupo(nombreGrupo);
			a.setDuracion(duracion);
			navidad.addActuacion(a);
			break;
			
		case LISTAR:
			navidad.mostrasInfo();
			break;
		
		case ACTUALIZAR:
			break;
			
		case BORRAR:
			
			break;
			
		case SALIR:
			break;
				
		default:
			System.out.println("Opcion mal");
			break;
		}
	}

}
