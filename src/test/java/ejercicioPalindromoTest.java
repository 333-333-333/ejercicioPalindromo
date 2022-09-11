import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ejercicioPalindromoTest {
    @Test
    @DisplayName("caso donde se le da una palabra con numeros")
    void esPalindromoTest1() {
        assertEquals(false, ejercicioPalindromo.esPalindromo("7abccba7"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra normal")
    void esPalindromoTest2() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("reconocer"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra vacia")
    void esPalindromoTest3() {
        assertEquals(false, ejercicioPalindromo.esPalindromo(""));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con mayusculas alternadas")
    void esPalindromoTest4() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("aNiLiNA"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con espacios")
    void esPalindromoTest5() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("Yo de lo minimo le doy"));
    }

}
