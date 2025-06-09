package A1_ejemploClaroConstructor;

public class Persona {

	String nombre;
	int edad;

	// En un solo CONSTRUCTOR pueden ir todos los atributos si se desea.
	// Para este caso 3 CONSTRUCTORES:
	// - 1 Vacio
	// - Parametro (nombre)
	// - Parametro (edad)
	// Cuando se vayan a crear los OBJETOS, pueden tomar cualquier CONSTRUCTOR

	public Persona() {}


	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(int edad) {
		this.edad = edad;
	}

}
