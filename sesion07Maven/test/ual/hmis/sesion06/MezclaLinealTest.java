package ual.hmis.sesion06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MezclaLinealTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> provideListsForTest() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(), Arrays.asList(), Arrays.asList()
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(), Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(1, 2, 3), Arrays.asList(), Arrays.asList(1, 2, 3)
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(1, 3, 5), Arrays.asList(2, 4, 6), Arrays.asList(1, 2, 3, 4, 5, 6)
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4), Arrays.asList(1, 2, 2, 3, 3, 4)
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(1, 2, 3, 5), Arrays.asList(2, 4, 6, 7), Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7)
            ),
            org.junit.jupiter.params.provider.Arguments.of(
                Arrays.asList(1, 3, 5, 7), Arrays.asList(2, 4, 6, 8), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
            )
        );
    }

    @ParameterizedTest
    @MethodSource("provideListsForTest")
    void testMezclar(List<Integer> listaA, List<Integer> listaB, List<Integer> expected) {
        List<Integer> result = MezclaLineal.mezclar(listaA, listaB);
        assertEquals(expected, result);
    }
}

