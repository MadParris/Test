package A4_ejemploClaroPolimorfismo;

public class Vehiculo {
	
	String marca;
	float matricula;
	int modelo;

	public Vehiculo() {
	}
	
	public Vehiculo(String marca, float matricula, int modelo) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
	}

	// METODO EL CUAL VA COMPARTIR TODAS LAS CLASES:
	void mostrarDatos() {
		System.out.println("Estos son los datos del Vehiculo");
	}

	// METODO EL CUAL VA COMPARTIR EN LA CLASE DE VEHICULO DEPORTIVO Y VEHICULO FAMILIAR
	void velocidad() {
		System.out.println("La velocidad del vehiculo es de 100 km");
	}
}
