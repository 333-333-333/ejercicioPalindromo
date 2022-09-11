import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ejercicioPalindromoTest {

    @Test
    void h() {
        ejercicioPalindromo.esPalidromo("h");
        assertEquals(true , ejercicioPalindromo.esPalidromo("h"));
    }

    @Test
    void Stringvacia() {
        ejercicioPalindromo.esPalindromoManual("");
        assertEquals(false, ejercicioPalindromo.esPalindromoManual(""));
    }
    @Test
    void Stringregular(){
        ejercicioPalindromo.esPalindromoManual("aaabcddcbaaa");
        assertEquals(true, ejercicioPalindromo.esPalindromoManual("aaabcddcbaaa"));
    }
    @Test
    void stringCompleja(){
        ejercicioPalindromo.esPalindromoManual("la tele letal");
        assertEquals(true, ejercicioPalindromo.esPalindromoManual("la tele letal"));
    }
}