package actuacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Vamos a crear una actuacion por programacion
		Actuacion a1 = new Actuacion();
		a1.setNombreGrupo("AC-DC");
		a1.setDuracion(90);

		// por inputs del teclado
		Actuacion a2 = new Actuacion();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del grupo");
		a2.setNombreGrupo(scan.nextLine());
		System.out.println("Introduce la duracion de la actuacion en minutos");
		a2.setDuracion(Integer.parseInt(scan.nextLine()));
		// crear actuacion leyendo desde el fichero
		File f = new File("D:/Josu/Programación/actuaciones.txt");
		Scanner fich;
		Actuacion a3 = new Actuacion();
		try {
			fich = new Scanner(f);
			while (fich.hasNextLine()) {
				String linea = fich.nextLine();
				String partesActuacion[] = linea.split(":");
				a3.setNombreGrupo(partesActuacion[0]);
				a3.setDuracion(Integer.parseInt(partesActuacion[1]));
			}
			System.out.println(a2.getNombreGrupo() + " Duracion: " + a2.getDuracion());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//crear un festival por programacion con 3 actuaciones
		
		Festival festival = new Festival();
		festival.setNombre("Jazzaldia");
		festival.setPatrocinador("Heineken");
		//añadir actuaciones a una lista
		/*
		 * ArrayList<Actuacion> listaActuaciones = new ArrayList();
		 * listaActuaciones.add(a1);
		listaActuaciones.add(a2);
		listaActuaciones.add(a3);
		
		festival.setActuaciones(listaActuaciones);
		 */
		
		
		Actuacion a4 = new Actuacion();
		a4.setNombreGrupo("Mikel Laboa");
		a4.setDuracion(100);
		
		festival.addActuacion(a4);
		
		festival.addActuacion("Linkin Park", 70);
		
		festival.mostrasInfo();
		
		festival.addActuacion("berri txarrak", 20);
		
		festival.mostrasInfo();
		
		festival.eliminarActuacion("Mikel Laboa");
		
		 
	}
	
	}





