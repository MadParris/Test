package A7_ejemploCollections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	 {
		
		//Declarar la interfaz List
		//Dentro de los '<>' se pone que se quiere colocar en el LinkedLyst
		//Para este caso un objeto tipo 'Persona'
		List<Perro> perros = new LinkedList<Perro>(); //Se inicializa la lista tipo 'LinkedList'
				
		//Por medio del METODO '.add' se agrega algo nuevo a la LISTA
		//Persona perso = new Persona(1, "Pedro", 33);
		perros.add(new Perro("Pitbull", "Pedro", 33)); //Se crea un OBJETO tipo 'Perro', se obvia la Linea 16
		perros.add(new Perro("Bulldog Frances", "Messi", 35));
		perros.add(new Perro("Cane Corso", "Zlatan", 41));
				
		//Agrgar al inicio:
		perros.add(0, new Perro("Labrador", "Corki", 33));
		
		
		//Hasta hora solo se agregaron elementos (personas) a la LISTA
		//Ahora se van a recorrer
		System.out.println("USANDO FOR EACH:");
		// Recorrer por elemento:(FOR EACH)
		for (Perro n : perros) {
			System.out.println("Prueba: "+n.getNombre());
					
		}

	}

}
