package ual.hmis.sesion06;

import java.util.*;

public class ContadorDePalabras {

    private final Map<String, Integer> conteoPalabras;

    public ContadorDePalabras(String texto) {
        conteoPalabras = new HashMap<>();
        leerTexto(texto);
    }

    private void leerTexto(String texto) {
        String[] palabras = texto.split("\\W+");
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
            }
        }
    }

    public List<String> obtenerPalabrasEnOrdenAlfabetico() {
        List<String> palabrasOrdenadas = new ArrayList<>(conteoPalabras.keySet());
        Collections.sort(palabrasOrdenadas);
        return palabrasOrdenadas;
    }

    public List<String> obtenerPalabrasPorFrecuencia() {
        List<Map.Entry<String, Integer>> listaEntradas = new ArrayList<>(conteoPalabras.entrySet());
        listaEntradas.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        List<String> palabrasPorFrecuencia = new ArrayList<>();
        for (Map.Entry<String, Integer> entrada : listaEntradas) {
            palabrasPorFrecuencia.add(entrada.getKey());
        }
        return palabrasPorFrecuencia;
    }
}
