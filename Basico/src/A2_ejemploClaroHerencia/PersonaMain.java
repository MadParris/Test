package A2_ejemploClaroHerencia;

public class PersonaMain extends Persona{

	//Se sugiere colocar CONSTRUCTOR de la CLASE PADRE 
	//para que no marque error(x roja) en el "Project Explorer", panel izquierdo del IDE 
	public PersonaMain(double cc, String nombre, String apellido, int edad) {
		super(cc, nombre, apellido, edad);
		
	}
	public static void main(String[] args) {
	
		Estudiante estu1 = new Estudiante(); //No se colocan PARAMETROS(si uno quiere) en este METODO, 
											 //porque tengo un CONTRCUTOR VACIO en la CLASE HIJA
		estu1.saludar(); //Retorna null en los PARAMETROS, ya que al OBJETO(Linea 14) no se los coloque
		estu1.notas();  //Retorna null en los PARAMETROS, ya que al OBJETO(Linea 14) no se los coloque

		System.out.println("");
		//Crear OBJETO al cual SI le coloco los PARAMETROS
		//Es OBLIGATORIO colocar los MISMOS PARAMETROS del CONSTRUCTOR de la CLASE HIJA(Estudiante)
		Estudiante estu2 = new Estudiante(1020785438,"Sebastian", "Romero", 29, "UMNG", 244, 45.6f);
		estu2.saludar(); //Depende de lo que haga este METODO usa los PARAMETROS requeridos. METODO DE CLASE PADRE
		estu2.notas();	//METODO DE CLASE HIJA
		
		System.out.println("");
		
		//Es OBLIGATORIO colocar los MISMOS PARAMETROS del CONSTRUCTOR de la CLASE HIJA(Empleado)
		Empleado emp1 = new Empleado(56456, "Camila", "Bbq", 23, "Amazon Colombia", 45646, 700000f);
		emp1.saludar(); //METODO DE CLASE PADRE
		emp1.trabajar(); //METODO DE CLASE HIJA
	}
}
