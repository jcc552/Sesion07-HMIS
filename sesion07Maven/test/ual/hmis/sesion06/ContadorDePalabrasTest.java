package ual.hmis.sesion06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorDePalabrasTest {

    private ContadorDePalabras contador;

    @BeforeEach
    void setUp() {
        String texto = "Hola mundo Este es un archivo de prueba Prueba de JUnit para contar palabras Palabras repetidas palabras";
        contador = new ContadorDePalabras(texto);
    }

    @Test
    void testObtenerPalabrasEnOrdenAlfabetico() {
        List<String> esperado = Arrays.asList("Este", "Hola", "JUnit", "Palabras", "Prueba", "archivo", "contar", "de", "es", "mundo", "palabras", "para", "prueba", "repetidas", "un");
        List<String> resultado = contador.obtenerPalabrasEnOrdenAlfabetico();
        Collections.sort(esperado);
        Collections.sort(resultado);
        assertEquals(esperado, resultado);
    }

    @Test
    void testObtenerPalabrasPorFrecuencia() {
        List<String> esperado = Arrays.asList("Palabras", "palabras", "Prueba", "de", "Hola", "mundo", "Este", "es", "un", "archivo", "prueba", "de", "JUnit", "para", "contar", "repetidas");
        List<String> resultado = contador.obtenerPalabrasPorFrecuencia();
        Set<String> esperadoSet = new HashSet<>(esperado);
        Set<String> resultadoSet = new HashSet<>(resultado);
        assertEquals(esperadoSet, resultadoSet);
    }
}
