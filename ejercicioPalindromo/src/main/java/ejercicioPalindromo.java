import java.util.Arrays;
import java.util.Collections;

public class ejercicioPalindromo {
    public static void main(String[] args) {

        System.out.println(esPalidromo("ojoojo"));
    }

    public static boolean esPalidromo(String palabra){
        boolean opcion=false;

        String[] resultado;

        resultado= palabra.split("");
        Collections.reverse(Arrays.asList(resultado));

        String resultadoInvertido=String.join("",resultado);
        System.out.println(resultadoInvertido);
        System.out.println(palabra);

        if (resultadoInvertido.equals(palabra)){
            opcion=true;
        }
        return opcion;
    }

    public static boolean esPalindromoManual(String palabra) {

        String[] almacena;
        String resultado;
        String aux;

        boolean esPalindromo = false;

        almacena = palabra.split("");

        for (int i = 0; i < palabra.length() / 2; i++) {

            aux = almacena[i];

            almacena[i] = almacena[almacena.length - i - 1];

            almacena[almacena.length - 1 - i] = aux;
        }
        resultado = String.join("", almacena);

        if (resultado.equals(resultado)) {

            esPalindromo = true;
        }
        return esPalindromo;

    }
}
