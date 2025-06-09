package A8_ejemploClaroExcepciones;

public class Excepcion_1 {

    public static void main (String[] args){

        try{ //Intentar hacer este codigo (divir entre 0)
            @SuppressWarnings("unused")
			int resultado = 3/0;
        }
        catch (Exception e){ //Si no puede hacer lo del 'try' entonces captura la excepcion y realizar este codigo (mostrar que no se puede didvir por 0)
                             //Forma generica de ahcer excepciones 'Exception e' se puede colcalar un tipo particar de excepcion
            System.out.println("No se puede divir entre 0!!");
        }

    }
}

