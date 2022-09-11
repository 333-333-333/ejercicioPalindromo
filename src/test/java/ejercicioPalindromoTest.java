import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ejercicioPalindromoTest {

    @Test
    @DisplayName("Para probar esPalindromo con solo una letra.")
    void esPalindromoTestLetra() {

        String objetoPrueba = "h";
        assertEquals(false , ejercicioPalindromo.esPalindromo(objetoPrueba));

    }

    @Test
    @DisplayName("Test es palindomo con string vacía.")
    void esPalindromoTestVacio() {

        String objetoPrueba = "";
        assertEquals(false , ejercicioPalindromo.esPalindromo(objetoPrueba));

    }

    @Test
    @DisplayName("Test es palindomo con string case sensitive.")
    void esPalindromoTestCaseSensitive() {

        String objetoPrueba = "Oso";
        assertEquals(true , ejercicioPalindromo.esPalindromo(objetoPrueba));

    }


    @Test
    @DisplayName("Test es palindomo con números.")
    void esPalindromoTestNumeros() {

        String objetoPrueba = "22";
        assertEquals(false , ejercicioPalindromo.esPalindromo(objetoPrueba));

    }

    @Test
    @DisplayName("Test es palindomo con caracteres que no son letras !!.")
    void esPalindromoTestCaseSimbolos() {

        String objetoPrueba = "os!so";
        assertEquals(false , ejercicioPalindromo.esPalindromo(objetoPrueba));

    }


    @Test
    @DisplayName("Para cuando la string es vacía")
    void nuevoEsPalindromoTestStringVacia() {

        String objetoPrueba = "";
        assertEquals(false, ejercicioPalindromo.nuevoEsPalindromo(objetoPrueba));

    }


    @Test
    @DisplayName("Test string regular")
    void nuevoEsPalindromoTestStringRegular() {

        String objetoPrueba = "aaabcddcbaaa";
        assertEquals(true, ejercicioPalindromo.nuevoEsPalindromo(objetoPrueba));

    }

    @Test
    @DisplayName("Test string más compleja")
    void nuevoEsPalindromoTestStringCompleja () {

        String objetoPrueba = "La tele letal";
        assertEquals(true, ejercicioPalindromo.nuevoEsPalindromo(objetoPrueba));

    }

    @Test
    @DisplayName("Test string que no debería ser palíndromo")
    void nuevoEsPalindromoTestStringFalse () {

        String objetoPrueba = "ahabccbaaa";
        assertEquals(false, ejercicioPalindromo.nuevoEsPalindromo(objetoPrueba));

    }

}