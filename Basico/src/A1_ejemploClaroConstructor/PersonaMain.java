package A1_ejemploClaroConstructor;

public class PersonaMain {

	public static void main(String[] args) {
		
		//Crear OTRO OBJETO mediante el CONSTRUCTOR VACIO:
		Persona PerDos = new Persona();
		System.out.println(PerDos.nombre);    //Retorna NULL, porque el PARAMETRO 'nombre' no 
											  //esta en este CONSTRUCTOR de la CLASE
		
		//Crear OBJETO mediante el CONSTRUCTOR con el Parametro(nombre):
		Persona PerUno = new Persona("Juan"); //Como el CONSTRUCTOR le pase un solo parametro, este OBJETO solo recibe un PARAMETRO											  
		System.out.println(PerUno.nombre); //Retorna el Juan
		
		//Crear OTRO OBJETO mediante el CONSTRUCTOR Parametro(edad):
		Persona PerTres = new Persona(34);
		System.out.println(PerTres.edad);    //Retorna 34
		
		
	}
}
