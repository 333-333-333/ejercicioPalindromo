import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ejercicioPalindromoTest {
    @Test
    @DisplayName("Mejorado: caso donde se le da una palabra con numeros")
    void esPalindromoTest1() {
        assertEquals(false, ejercicioPalindromo.esPalindromo("7abccba7"));
    }

    @Test
    @DisplayName("Mejorado: caso donde se le da una palabra normal")
    void esPalindromoTest2() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("reconocer"));
    }

    @Test
    @DisplayName("Mejorado: caso donde se le da una palabra vacia")
    void esPalindromoTest3() {
        assertEquals(false, ejercicioPalindromo.esPalindromo(""));
    }

    @Test
    @DisplayName("Mejorado: caso donde se le da una palabra con mayusculas alternadas")
    void esPalindromoTest4() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("aNiLiNA"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con espacios")
    void esPalindromoTest5() {
        assertEquals(true, ejercicioPalindromo.esPalindromo("Yo de lo minimo le doy"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con numeros")
    void esPalindromoViejoTest1() {
        assertEquals(false, ejercicioPalindromo.esPalindromoViejo("7abccba7"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra normal")
    void esPalindromoViejoTest2() {
        assertEquals(true, ejercicioPalindromo.esPalindromoViejo("reconocer"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra vacia")
    void esPalindromoViejoTest3() {
        assertEquals(false, ejercicioPalindromo.esPalindromoViejo(""));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con mayusculas alternadas")
    void esPalindromoViejoTest4() {
        assertEquals(true, ejercicioPalindromo.esPalindromoViejo("aNiLiNA"));
    }

    @Test
    @DisplayName("caso donde se le da una palabra con espacios")
    void esPalindromoViejoTest5() {
        assertEquals(true, ejercicioPalindromo.esPalindromoViejo("Yo de lo minimo le doy"));
    }
}
