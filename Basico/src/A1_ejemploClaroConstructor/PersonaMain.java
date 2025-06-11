package A1_ejemploClaroConstructor;

public class PersonaMain {

	public static void main(String[] args) {
		
		//Crear OTRO OBJETO mediante el CONSTRUCTOR VACIO:
		Persona PerDos = new Persona();
		System.out.println(PerDos.nombre);    //Retorna NULL, porque el PARAMETRO 'nombre' no 
											  //esta en de CONSTRUCTOR de la CLASE
		
		//Crear OBJETO mediante el CONSTRUCTOR con el Parametro(nombre):
		Persona PerUno = new Persona("Sebastian"); //Como el CONSTRUCTOR le pase un solo parametro, este OBJETO solo recibe un PARAMETRO
		System.out.println(PerUno.nombre); //Retorna el Sebastian
		
		//Crear OTRO OBJETO mediante el CONSTRUCTOR Parametro(edad):
		Persona PerTres = new Persona(319);
		System.out.println(PerTres.edad);    //Retorna 31

        //Ejemplo de crear otro objeto
		Persona PerCuatro = new Persona(26);
		System.out.println(PerCuatro.edad);    //Retorna 26
	}
}
