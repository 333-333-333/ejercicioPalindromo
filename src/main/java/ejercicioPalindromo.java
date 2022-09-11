import java.util.Locale;

public class ejercicioPalindromo {

    public static void main(String[] args) {

    }

    /* La función planteada en el ejercicio solamente consideraba sacarle los espacios a la string, e invertirlas, nada
     más*/

    public static boolean esPalindromo (String texto){

        String temp = "";
        temp = texto.replaceAll(" ","");

        String retorno = "";

        for (int i=0; i<temp.length(); i++)
        {
            char c = temp.charAt(i);
            retorno = c + retorno;
        }

        return retorno.equals(texto);

    }

    public static boolean nuevoEsPalindromo(String texto) {

        String textoAComparar = texto.replaceAll(" ","").toLowerCase();
        StringBuilder retorno = new StringBuilder();

        try {
            for (int i=0; i<textoAComparar.length(); i++) {
                char c = textoAComparar.charAt(i);
                retorno.insert(0, c);
            }
            System.out.println(retorno);
        } catch (ClassCastException e) {
            System.out.println("El tipo de objeto no corresponde.");
        } finally {
            return textoAComparar.equals(retorno.toString()) && retorno.length() > 1;
        }
    }

}
