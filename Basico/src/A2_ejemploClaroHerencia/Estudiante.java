package A2_ejemploClaroHerencia;

//Por medio de 'EXTENDS' hereda ATRIBUTOS, PARAMETROS, METODOS, GETTERS, SETTERS, CONSTRUCTORES, ETC de la CLASE PADRE(Persona)
public class Estudiante extends Persona{ 

	String universidad;
	int codigoUniversitario;
	float promedioNotas;

	public Estudiante() { 
		//Para usar este CONSTRUCTOR VACIO toca crear un CONSTRUCTOR VACIO obligatoriamente en la CLASE PADRE(Linea 10)
	}

	public Estudiante(double cc, String nombre, String apellido, int edad, String universidad, int codigoUniversitario, float promedioNotas) {
		super(cc, nombre, apellido, edad); //Por medio del 'super' invoco los PARAMETROS de la CLASE PADRE (Persona)
		this.universidad = universidad;
		this.codigoUniversitario = codigoUniversitario;
		this.promedioNotas = promedioNotas;
	}

	void notas() {
		System.out.println("Mi promedio es de "+promedioNotas+" en la universdidad: "+universidad+ "");
	}
}
