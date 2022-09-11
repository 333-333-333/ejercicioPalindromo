import java.util.Scanner;

public class ejercicioPalindromo {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar (){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la palabra a evaluar");
        String palabra = in.next();
        if (contieneNumeros(palabra)){
            System.out.println("La palabra contiene numeros por lo tanto no se puede analizar");
        }else {
            leerEsPalindromo(regularizarPalabra(palabra));
        }
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
    public static String quitarEspacios(String palabra){
        return palabra.replace(" ","");
    }
    public static String palabraEnMinusculas (String palabra){
        return palabra.toLowerCase();
    }
    public static String regularizarPalabra (String palabra){
        return quitarEspacios(palabraEnMinusculas(palabra));
    }
    public static boolean contieneNumeros (String palabra){
        boolean tieneNumeros = false;
        for (int i =0; i<palabra.length();i++){
            if (palabra.charAt(i)=='1'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='2'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='3'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='4'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='5'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)==6){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='7'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='8'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='9'){
                tieneNumeros = true;
            }else if (palabra.charAt(i)=='0'){
                tieneNumeros = true;
            }
        }
        return tieneNumeros;
    }
}
