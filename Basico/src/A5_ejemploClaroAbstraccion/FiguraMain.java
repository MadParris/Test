package A5_ejemploClaroAbstraccion;

public class FiguraMain {

	public static void main(String[] args) {
		
		//Figura fig = new Figura();      Retorna Error -> NO SE PUEDE INSTANCIAR DE UNA 
		//Cuadrado cuad = new Cuadrado(); CLASE ASBTRACTA!!(No se puede crear OBJETOS de esta CLASE)
	
		Circulo cir = new Circulo();
		CuadradoRectangular rect = new CuadradoRectangular(5, 4);
		Circulo cirConParam = new Circulo(0, 0, 5); // Como los dos primeros PARAMETROS no sirven para nada. Seria cambiar ese 
												    // CONSTRUCTOR(de la CLASE Circulo) sin esos PARAMETROS 
		
		cir.calcularArea();
		rect.calcularArea();
		cirConParam.calcularArea();
	}
}
 	