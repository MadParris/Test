package A5_ejemploClaroAbstraccion;

public class Circulo extends Figura{ // No se pone 'abstract' ya que al heredar su METODO ya se sabe que viene de una CLASE ABSTRACTA.
									 // Y si no se coloca el METODO ABSTRACTO, retornara un error porque si o si me exige colocar el METODO,
									 // a menos que le coloque 'public abstract class', pero para este caso no

	private double radio;

	public Circulo() {
	}

	public Circulo(double x, double y, double radio) { //'double x, double y' son de la CLASE ABSTRACTA, no sirven para nada en este caso
													   // Se pueden eliminar
		this.radio = radio;	
	}

	//INVOCAR METODO de la CLASE PADRE
	@Override // Para MODIFICAR el METODO ABSTRACTO de la CLASE PADRE usar '@Override'(Sobreescritura)
	public void calcularArea() { //Ahora se usa este METODO como lo requiera el Circulo, por eso no lleva el 'abstract'
		double area = Math.PI * (radio*radio);
		System.out.println("Area del Circulo: "+ area);
		
	}
}
