package A4_ejemploClaroPolimorfismo;

public class VehiculoAgricola extends Vehiculo {

	float carga;

	public VehiculoAgricola() {
		
	}
	
	public VehiculoAgricola(String marca, float matricula, int modelo, float carga) {
		super(marca, matricula, modelo);
		this.carga = carga;
	}

	//METODO el cual va compartir todas las clases CLASES (Viene de la CLASE PADRE)
	void mostrarDatos() {
		System.out.println("Estos son los datos del Vehiculo Agricola");
	}
	
}
