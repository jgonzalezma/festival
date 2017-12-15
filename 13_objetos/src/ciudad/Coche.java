package ciudad;
import java.awt.Color;

/**
 * @author IR012982EX
 *
 */
/**
 * @author IR012982EX
 *
 */
public class Coche {
//constantes precioGasoil, precioGasolina
	public static final double PRECIO_GASOLINA = 1.39;
	public static final double PRECIO_GASOIL = 1.12;
	
//atributos
	private Persona conductor;
	private String color;
	private String matricula;
	private int anioMatriculacion;
	private String marca;
	private String modelo;
	private int numPlazas;
	private int numPuertas;
	private int tamanioMaletero;
	private int caballaje;
	private double litrosCombustible;
	private boolean esGasolina; 
	private int capacidadCombustible;
	private int marcha;
	private int marchaMax;
	private int velocidad;
	private int kilometraje;
	private double consumoMedio; //por cien kilometros
	private double precioCompra;
	
	public Coche(Persona conductor, String matricula){
		this.conductor = conductor;
		this.matricula = matricula;
	}
	
	public Coche() {
		// TODO Auto-generated constructor stub
	}

	public double repostar(int euros){
		
		double repostable;
		double precioConbustible;
		
		System.out.println("Repostando........ ......... .........");
		
		if(this.isEsGasolina()){
			precioConbustible = PRECIO_GASOLINA;
			repostable = euros / PRECIO_GASOLINA;
		
		}else{
			precioConbustible = PRECIO_GASOIL;
			repostable = euros / PRECIO_GASOIL;
			
		}
		
		if(repostable + this.getLitrosCombustible() <= this.getCapacidadCombustible()){
			//repostar todo lo repostable y los cambios 0
			this.setLitrosCombustible(this.getLitrosCombustible() + repostable);
			//this.litrosCombustible = this.litrosCombustible + repostable;
			return 0;
		}else{
			double repostableNuevo = this.getCapacidadCombustible() - this.getLitrosCombustible();
			this.setLitrosCombustible(this.getCapacidadCombustible());
			
			double litrosSobrantes = repostable - repostableNuevo;
			double devolucion = litrosSobrantes * precioConbustible;
			return devolucion;
			
		}
		
		
	}

	/**
	 * @return the conductor
	 */
	public Persona getConductor() {
		return conductor;
	}

	/**
	 * @param conductor the conductor to set
	 */
	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the anioMatriculacion
	 */
	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}

	/**
	 * @param anioMatriculacion the anioMatriculacion to set
	 */
	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the numPlazas
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * @param numPlazas the numPlazas to set
	 */
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}

	/**
	 * @param numPuertas the numPuertas to set
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	/**
	 * @return the tamanioMaletero
	 */
	public int getTamanioMaletero() {
		return tamanioMaletero;
	}

	/**
	 * @param tamanioMaletero the tamanioMaletero to set
	 */
	public void setTamanioMaletero(int tamanioMaletero) {
		this.tamanioMaletero = tamanioMaletero;
	}

	/**
	 * @return the caballaje
	 */
	public int getCaballaje() {
		return caballaje;
	}

	/**
	 * @param caballaje the caballaje to set
	 */
	public void setCaballaje(int caballaje) {
		this.caballaje = caballaje;
	}

	/**
	 * @return the litrosCombustible
	 */
	public double getLitrosCombustible() {
		return litrosCombustible;
	}

	/**
	 * @param litrosCombustible the litrosCombustible to set
	 */
	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}

	/**
	 * @return the esGasolina
	 */
	public boolean isEsGasolina() {
		return esGasolina;
	}

	/**
	 * @param esGasolina the esGasolina to set
	 */
	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	/**
	 * @return the capacidadCombustible
	 */
	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	/**
	 * @param capacidadCombustible the capacidadCombustible to set
	 */
	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	/**
	 * @return the marcha
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * @param marcha the marcha to set
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	/**
	 * @return the marchaMax
	 */
	public int getMarchaMax() {
		return marchaMax;
	}

	/**
	 * @param marchaMax the marchaMax to set
	 */
	public void setMarchaMax(int marchaMax) {
		this.marchaMax = marchaMax;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the kilometraje
	 */
	public int getKilometraje() {
		return kilometraje;
	}

	/**
	 * @param kilometraje the kilometraje to set
	 */
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	/**
	 * @return the consumoMedio
	 */
	public double getConsumoMedio() {
		return consumoMedio;
	}

	/**
	 * @param consumoMedio the consumoMedio to set
	 */
	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the pRECIO_GASOLINA
	 */
	public double getPRECIO_GASOLINA() {
		return PRECIO_GASOLINA;
	}

	/**
	 * @return the pRECIO_GASOIL
	 */
	public double getPRECIO_GASOIL() {
		return PRECIO_GASOIL;
	}
	
	//funciones
	/*
	
	double repostar(int euros)
	//el litro de gasoil esta a 1,12 y la gasolina 1,39
	acelerar(int kmHora)
	cambiarMarcha(boolean mas)
	circular(int kms)
	double valorar() 
	//se valora con el kilometraje por 20000km 100 euros
	 * y anioMatriculacion  por 1 anio 500euros
	
	*/
	
	
	
	
}
