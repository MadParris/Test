package A7_ejemploCollections;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        //Crear un ArrayList para crear personas adentro, objetos tipo persona
        //Primero se declara la lista: 'List <Persona> lista' y
        // la misma linea se va a inicializar la lista: '= new ArrayList<Persona>()'
        // donde es tipo 'ArrayList', dentro de los '<>' va lo que se quiere guardar
        // '()' hace referencia a que va ser una construccionde un nuevo ArrayLyst

        List <Persona> lista = new ArrayList<Persona>();

        //Agregar elemento a la lista
        //Persona perso = new Persona(1, "Sebastian", 30)
        lista.add(new Persona(1, "Sebastian", 30));  //Creo un objeto tipo persona, con los parametros correspondientes
                                                                     //me ahorro lo de la linea 18 y solo colocaria 'lista.add(perso)'

        lista.add(new Persona(1, "Camix", 24));
        lista.add(new Persona(2, "Enzo", 7));
        lista.add(new Persona(7, "Cris", 38));

        //RECORRER LA LISTA
        //Por indice
        for(int i=0; i<lista.size(); i++ ){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }

        //RECORRER POR ELEMENTO:
        //Foreach:

        for (Persona perso : lista){
            System.out.println("Prueba" + perso.getNombre());
        }
    }
}
