import java.util.Scanner;

public class ejercicioPalindromo {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar (){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la palabra a evaluar");
        String palabra = in.next();
        leerEsPalindromo(palabra);
    }
    public static boolean esPalindromo (String palabra){
        int letraInicio = 0;
        int letraFinal = palabra.length()-1;
        boolean interseccionLetras = false;
        while (letraInicio<letraFinal && !interseccionLetras){
            if (palabra.charAt(letraInicio)==palabra.charAt(letraFinal)){
                letraInicio++;
                letraFinal--;
            }else {
                interseccionLetras=true;
            }
        }
        return !interseccionLetras;
    }
    public static void leerEsPalindromo (String palabra){
        if (esPalindromo(palabra)){
            System.out.println("Es un palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
    }
}
