import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import ciudad.Coche;
import ciudad.Persona;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//crear el array de 5 personas
		Persona[] personas = new Persona[5];
		
		//Crear escaner para leer de fichero
		File f = new File("D:/ficherosjava/personas.txt");
		Scanner scan = new Scanner(f);
		
		//rellena el array con personas
		int i = 0;
		while(scan.hasNextLine()){
			String linea = scan.nextLine();
			String[] partesPersona = linea.split(",");
			
			Persona persona = new Persona();
			persona.setNombre(partesPersona[0]);
			persona.setApellido(partesPersona[1]);
			persona.setEdad(Integer.parseInt(partesPersona[2]));
			persona.setDinero(Double.parseDouble(partesPersona[3]));

			personas[i] = persona;
			i++;
				
		}
		
		//recorrer el array de personas para sacar sus nombres y apellidos por pantalla.
		for(int j = 0; j < personas.length; j++){
			System.out.println(personas[j].getNombreApellido());
			personas[j].mostrarNombreApellido();
		}
		
		System.out.println("El primero en la lista es:");
		Persona primera = primeroEnArray(personas);
		primera.mostrarNombreApellido();
		
		
		//la media de edad de los alumnos
		
		System.out.println("La media de la edad es de " + mediaEdad(personas));
		
		
		//la suma del dinero de los alumnos
		System.out.println("La suma del dinero es de " + sumaDinero(personas));
		
		
	}
	


	private static double sumaDinero(Persona[] personas) {
		double dineroTotal = 0;
		
		for (int i = 0; i < personas.length; i++) {
			dineroTotal = dineroTotal + personas[i].getDinero();
		}
		
		return dineroTotal;
	}

	private static double mediaEdad(Persona[] personas) {
		double sumaEdad = 0;
		
		for (int i = 0; i < personas.length; i++) {
			sumaEdad = sumaEdad + personas[i].getEdad();
		}
		
		return sumaEdad/personas.length;
	}

	public static Persona primeroEnArray(Persona[] personas){
		
		Persona primera = personas[0];
		
		for (int i = 0; i < personas.length; i++) {
			if(personas[i].getApellido().compareTo(primera.getApellido()) < 0){
				primera = personas[i];
			}
		}
		
		return primera;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
