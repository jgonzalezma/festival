package ciudad;
import java.util.Date;

public class Persona {
//atributos private
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String dni;
	private String poblacion;
	private Date fechaNacimiento;
	private double peso;
	private double dinero;
	private Cuenta cuenta;
	
	

	public Persona(){};
	
	public Persona(String nombre, String apellido, String poblacion){
		this.nombre = nombre;
		this.apellido = apellido;
		this.poblacion = poblacion;
	}
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Persona(String nombre, int edad ){
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona(String nombre, String apellido, int edad, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}

	public Persona(String nombre, String apellido, int edad, String telefono, String dni, String poblacion,
			Date fechaNacimiento, double peso, double dinero) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.dni = dni;
		this.poblacion = poblacion;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.dinero = dinero;
	}

	//metodos public
//	public void cumplirAnio(){
//		this.edad++;
//	}
	
	
	public int cumplirAnio(){
		this.edad++;
		return getEdad();
	}
	
	
	public void comer(double pesoComido){
		this.engordar(pesoComido);
		System.out.println("He comido");
	}
	
	
	public void gastarDinero(double cantidad){
		if(getDinero() < cantidad){
			System.out.println("No me llega");
		}else{
			setDinero(getDinero() - cantidad);
			//this.dinero = this.dinero - cantidad;
		}
	}
	

	public void correr(int minutos){
		//por cada minuto perdera 0.001 gramos
		double pesoPerdido = 0.001*minutos;
		this.peso = this.peso - pesoPerdido;
		
		System.out.println("He corrido " + minutos +
				" minutos y he perdido " + pesoPerdido+ " kg-s");
		
	}
	
	public void correr(double km){
		double pesoPerdido = 0.05*km;
		this.peso = this.peso - pesoPerdido;
		
		System.out.println("He corrido " + km +
				" km-s y he perdido " + pesoPerdido+ " kg-s");
	}
	
	/*
	 * @param peso en cuanto se va a cambiar el peso
	 */
	public void engordar(double peso){
		this.peso = this.peso + peso;
	}
	
	public void cambiarEdad(int edad){
		this.edad = edad;
	}

	//getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad < 0){
			System.out.println("Error en setEdad");
		}else{
			this.edad = edad;
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.length() != 9){
			System.out.println("Error: telefono mal");
		}else{
			this.telefono = telefono;
		}
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni.length() != 9){
			System.out.println("Error: dni mal");
		}else{
			this.dni = dni;
		}
		
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	

	public void mostrarNombreApellido(){
		System.out.println(this.getNombre() + " " + this.getApellido());
	}
	
	public String getNombreApellido(){
		return (this.getNombre() + " " + this.getApellido());
	}

	public String getStringGuardado() {
		return this.getNombre() + "," +this.getApellido() +
				"," + this.getTelefono();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//fin clase persona
