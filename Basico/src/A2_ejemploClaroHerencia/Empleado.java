package A2_ejemploClaroHerencia;

//Por medio de 'EXTENDS' hereda ATRIBUTOS, PARAMETROS, METODOS, GETTERS, SETTERSz, CONSTRUCTORES, ETC	 de la CLASE PADRE(Persona)
public class Empleado extends Persona{ 

	String empresa;
	double codigoEmpleado;
	float promedioSalario;
	
	public Empleado() {
	}

	public Empleado(double cc, String nombre, String apellido, int edad, String empresa, double codigoEmpleado, float promedioSalario) {
		super(cc, nombre, apellido, edad); //Por medio del 'super' invoco los PARAMETROS de la CLASE PADRE(Persona)
		this.empresa = empresa;
		this.codigoEmpleado = codigoEmpleado;
		this.promedioSalario = promedioSalario;
	}
	
	void trabajar() {
		System.out.println("Hola me llamo "+nombre+" y estoy trabajando en: "+empresa); //'nombre' viene del PARAMETRO de la CLASE PADRE
	}
	
	
}
