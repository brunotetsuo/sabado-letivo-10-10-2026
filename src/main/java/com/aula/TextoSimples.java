package com.aula;

import java.util.HashSet;
import java.util.Set;

public class TextoSimples implements Texto {
    private final Set<Estilo> estilos = new HashSet<>();

    @Override
    public String render() {
        return "Texto Simples";
    }

    @Override
    public Set<Estilo> getEstilos() {
        return estilos;
    }
}
