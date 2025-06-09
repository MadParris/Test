package A3_ejemploClaroEncapsulamiento;

public class Clase1 {

	//Los ATRIBUTOS por lo general DEBEN ser PRIVADOS
	private int edad;
	
	//Como retorna ERROR en la Clase2, porque el ATRIBUTO es PRIVADO, 
	//se usan los METODOS ACCESORES (GET Y SET) que si son PUBLICOS
	
	//METODO SET: ASIGNAR
	public void setEdad(int edad) {  //'Set' sirve para ASIGNAR(colocar, configurar, etc) un valor del ATRIBUTO (PRIVADO).
							 		 //Es como un miniconstructor donde no retorna nada.
									 //Se coloca de PARAMETRO el ATRIBUTO que se quiere inicializar ('edad')
		this.edad = edad;      
	}
	
	//METODO GETTER: OBTENER
	public int getEdad() {  //'Get' sirve para OBTENER(traer, mostrar, etc) el valor del ATRIBUTO(PRIVADO),
							// Tiene que ir con el tipo de variable que tiene la VARIBALE privada, es decir 'int'
							// No lleva PARAMETROS
		return edad;		// Retorna el ATRIBUTO el cual queremos OBTENER(traer, mostrar, etc).
	}
}
