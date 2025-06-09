package A4_ejemploClaroPolimorfismo;

// Para que haya POLIMORFISMO debe HABER HERENCIA!!

public class VehiculoDeportivo extends Vehiculo{

	int numeroPuertas;

	public VehiculoDeportivo() {
	}
	
	public VehiculoDeportivo(String marca, float matricula, int modelo, int numeroPuertas) {
		super(marca, matricula, modelo);
		this.numeroPuertas = numeroPuertas;
	}
	
	// METODO el cual va compartir todas las clases CLASES (Viene de la CLASE PADRE
	void mostrarDatos() {
		System.out.println("Estos son los datos del Vehiculo Deportivo");
	}
	
	void velocidad() {
		System.out.println("La velocidad del vehiculo es de 300 km");
	}
	
}
