package A2_ejemploClaroHerencia;

public class Persona {

	double cc;
	String nombre;
	String apellido;
	int edad;
	
	public Persona() { //CONSTRUCTOR VACIO porque CLASE HIJAS lo requieren (Estudiante-Linea 10)(Empleado-Linea 10)
	}
	
	public Persona(double cc, String nombre, String apellido, int edad) {
		this.cc = cc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	void saludar() {
		System.out.println("Hola me llamo "+nombre+" "+apellido);   //Puedo usar los parametros que desee
	}
}
