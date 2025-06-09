package A3_ejemploClaroEncapsulamiento;


//No se usa HERENCIA para ESTE EJEMPLO, no es necesario

public class Clase2 {

	public static void main(String[] args) {
		
		//Instanciar un OBJETO por medio de Objeto1
		Clase1 objeto1 = new Clase1();
		//objeto1.edad = 2; -> Retorna ERROR porque 'edad' es un ATRIBUTO PRIVADO (Linea 6 / Clase1) 
		
		//Por medio del Set ya se puede acceder a ese ATRIBUTO y ASIGNARLE un valor
		objeto1.setEdad(10);
		
		//Por medio del Get se puede mostrar la edad
		//System.out.println("La edad es: "+objeto1.edad); ->Retorna ERROR porquE el ATRIBUTO esta PRIVADO
		//Entonces se hace por medio de Get:
		System.out.println("La edad es: "+objeto1.getEdad());
;	}

}
