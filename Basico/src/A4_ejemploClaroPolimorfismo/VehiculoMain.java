package A4_ejemploClaroPolimorfismo;

public class VehiculoMain {

	public static void main(String[] args) {
		
		// SIN POLIMORFISMO
		// Crear OBJETOS:
		// Los OBJETOS son instanciados a traves de su CLASE respectiva
		Vehiculo ve = new Vehiculo();   //Para que este OBJETO no retorne error (porque no tiene PARAMETROS) toca crear un CONSTRUCTOR VACIO
		VehiculoFamiliar veFami = new VehiculoFamiliar(); //La CLASES HIJAS heredan un CONSTRUCTOR VACIO si la CLASE PADRE lo tiene
		VehiculoDeportivo veDepor = new VehiculoDeportivo();
		VehiculoAgricola veAgri = new VehiculoAgricola();
		
		
		ve.mostrarDatos();      //METODO de la CLASE PADRE
		//ve.velocidadVehiculoFamiliar(); // Retorna error porque este METODO no esta en ese OBJETO, instanciado por medio de la CLASE PADRE
		
		System.out.println("");
		veFami.mostrarDatos();  //METODO de la CLASE HIJA, por medio de la CLASE PADRE
		veFami.velocidad(); 	//METODO de la CLASE HIJA
		
		System.out.println("");
		veDepor.mostrarDatos(); //METODO de la CLASE HIJA, por medio de la CLASE PADRE
		veDepor.velocidad();
		
		System.out.println("");
		veAgri.mostrarDatos();  //METODO de la CLASE HIJA, por medio de la CLASE PADRE
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("CON POLIMORFISMO:");
		
		//CON POLIMORFISMO:
		// Crear OBJETOS:
		// Los OBJETOS son instanciados a traves de la CLASE PADRE.
		// Permite a un METODO ser DIFERENTE segun que CLASE lo este invocando. 
		Vehiculo veFami2 = new VehiculoFamiliar();   // El OBJETO se instancia con un CONSTRUCTOR tipo 'VehiculoFamiliar',
		Vehiculo veDepor2 = new VehiculoDeportivo(); // es decir que el Vehiculo ahora tomara la forma del 'VehiculoFamiliar' (Linea 39)
		Vehiculo veAgri2 = new VehiculoAgricola();
		
		// Retorna cada METODO diferente, segun la CLASE que lo necesite
		veFami2.mostrarDatos(); //Retorna el METODO de la CLASE HIJA pero fue instanciado por medio de la CLASE PADRE
		veFami2.velocidad();  
		veDepor2.velocidad();
		veAgri2.mostrarDatos();
		//Puede ser mas practico por medio ARRAYS
	}
}
