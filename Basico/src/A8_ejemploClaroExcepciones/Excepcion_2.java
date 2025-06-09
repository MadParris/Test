package A8_ejemploClaroExcepciones;

public class Excepcion_2 {

    public static void main (String[] args){

        int edades  [] = {15, 20, 25, 30}; // En este vector existe solo hasta el 3er indice (0,1,2,3)

        try {
            System.out.println("La edad en la posicion 4 es: " + edades[4]);
        }
        catch(Exception e){
            System.out.println("Intentas mostrar una posicion que no existe");
        }
    }
}
