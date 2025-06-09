package A7_ejemploCollections;

public class Perro {

	String raza;
	String nombre;
	int edad;
	
	public Perro() {
	}

	public Perro(String raza, String nombre, int edad) {
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
