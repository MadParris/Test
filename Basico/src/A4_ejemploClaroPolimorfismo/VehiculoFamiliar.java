package A4_ejemploClaroPolimorfismo;

//Para que haya POLIMORFISMO debe HABER HERENCIA!!

public class VehiculoFamiliar extends Vehiculo{

	float cantidadPuestos;

	
	public VehiculoFamiliar() {	
	}

	public VehiculoFamiliar(String marca, float matricula, int modelo, float cantidadPuestos) {
		super(marca, matricula, modelo);
		this.cantidadPuestos = cantidadPuestos;
	}


	// METODO el cual va compartir todas las clases CLASES (Viene de la CLASE PADRE
	void mostrarDatos() {
		System.out.println("Estos son los datos del Vehiculo Familiar");
	}
	
	void velocidad() {
		System.out.println("La velocidad del vehiculo es de 80 km");
	}
}
