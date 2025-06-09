package A5_ejemploClaroAbstraccion;

//NO SE PUEDE INSTANCIAR una CLASE ABSTRACTA!!
public abstract class Figura {  //'abtract' hace la clase ABSTRACTA

	public double x; // Posicion en X, ejemplo geometrico
	public double y; // Posicion en Y, ejemplo geometrico

	public Figura() {
	}

	public Figura(double x, double y) {    
		this.x = x;
		this.y = y;
	}
	// Las CLASES ABSTRACTAS pueden tener constructores, pero solamente para ser usados desde los CONSTRUCTORES
	// de las CLASES HIJAS.

	//METODO ABSTRACTO:
	public abstract void calcularArea(); //NO TIENE LLAVES!!(No hace nada en ESTA CLASE)
	
	//¿Porque se usa?
	//Porque no tiene sentido calcular el area en figura, si no mas bien en Circulo y Cuadrado(CLASES HIJAS) sus SUBHIJAS(CuadradoRectangular)
	//Circulo y CuadradoRectangular lo van a implementar como deseen.
	//SUS HIJAS O SUBHIJAS SI PUEDEN SER INSTANCIADAS!
	//Puede tener todos los METODOS ABSTRACTOS, desde que tenga solo un METODO ABSRACTO todo bien
}
