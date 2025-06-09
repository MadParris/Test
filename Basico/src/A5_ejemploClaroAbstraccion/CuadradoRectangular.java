package A5_ejemploClaroAbstraccion;

//La CLASE PADRE es "Cuadrado" que a su vez se hereda de "Figura"
//Como la CLASE PADRE es ABSTRACTA entonces esta tambien esta CLASE tiene que ser ASBTRACTA
//Es ABSTRACTA por medio del METODO ABSTRACTO
public class CuadradoRectangular extends Cuadrado{ //

	public double base;
	public double altura;


	public CuadradoRectangular(double base, double altura) {
		this.base = base;
		this.altura = altura;
		
	}


	//INVOCAR METODO de la CLASE PADRE (Cuadrado, que hereda de Figura, entonces Figura seria como "CLASE ABUELA")
	@Override //Para MODIFICAR el METODO ABSTRACTO de la CLASE PADRE toca usar '@Override'(Sobreescritura)
	public void calcularArea() { //Ahora se usa este METODO como lo requiera el CuadradoRectangulo, no lleva el 'abstract'
		double area = base * altura;
		System.out.println("Area del Cudrado Rectangulo: "+ area);
	}
}

