package actuacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	private String nombre;
	private String patrocinador;
	ArrayList<Actuacion> actuaciones;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	public void addActuacion(Actuacion a) {
		this.actuaciones.add(a);
	}
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.actuaciones.add(a);
	}
	public void eliminarActuacion(String grupo){
		System.out.println("Que quieres eliminar?");
		Iterator<Actuacion> i = actuaciones.iterator();
		while(i.hasNext()){
			Actuacion a = i.next(); 
			if(a.getNombreGrupo().equals(grupo)){
				i.remove();
				System.out.println(grupo + " ha sido eliminado");
			}
		}
	}

		
		
	public void cambiarDuracionActuacion(String nombre_grupo, int duracion){
		ArrayList<Actuacion> actuaciones = this.getActuaciones();
		for(int i=0; i < this.actuaciones.size(); i++){
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombre_grupo)){
				//Actuacion a = new Actuacion(nombre_grupo, duracion);
				Actuacion a = this.actuaciones.get(i);
				a.setDuracion(duracion);
				this.actuaciones.set(i, a);
			}
		}
	}
		
	private int getDuracion(){
		int duracionTotal = 0;
		Iterator<Actuacion> i = this.actuaciones.iterator();
		
		while(i.hasNext()){
			duracionTotal = duracionTotal + i.next().getDuracion();
		}
		return duracionTotal;
	}
	
	public void mostrasInfo(){
		System.out.println(getNombre());
		System.out.println("Patrocinado por " + getPatrocinador());
		System.out.println("---------------");
		
		Iterator<Actuacion> i = this.actuaciones.iterator();
		
		while(i.hasNext()){
			String infoActuacion = i.next().getInfo();
			System.out.println(infoActuacion);
		}
		
	}
}
