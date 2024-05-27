package ual.hmis.sesion06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio3Test {

    @ParameterizedTest
    @CsvSource({
        "'abc', 'password demasiado corto'",
        "'abcd', 'password demasiado corto'",
        "'abcde', '********'",
        "'abcdef', '********'",
        "'abcdefgh', '********'",
        "'abcdefghi', '************'",
        "'123456789012', '************'",
        "'1234567890123456789012345678901234567890', '************'",
        "'12345678901234567890123456789012345678901', 'password demasiado largo'"
    })
    void testEnmascararPassword(String input, String expected) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        String result = ejercicio3.enmascararPassword(input);
        assertEquals(expected, result);
    }
}