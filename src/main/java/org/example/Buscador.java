package org.example;

import java.util.List;

public class Buscador {

    /**
     *
     * @param frase
     * @param lista
     * @return true or false if sentence is in the list
     */
    public boolean buscarFrase(String frase, List<String> lista) {
        for(String phrase: lista){
            if(phrase.equals(frase)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean buscarPalabra(String palabra, List<String> lista){
        return lista.contains(palabra);
    }

    public String devolverPalabra(List<String> lista, int posicion){
        return lista.get(posicion);
    }

    public String devolverPrimerElemento(List<String> lista){
        return lista.get(0);
    }

    public String devolverUltimoElemento(List<String> lista){
        return lista.get(lista.size());
    }

}