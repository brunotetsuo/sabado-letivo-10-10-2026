package com.aula;

import java.util.Set;

public class SublinhadoDecorador extends TextoDecorador {
    private final boolean aplicarSublinhado;

    public SublinhadoDecorador(Texto texto) {
        super(texto);
        aplicarSublinhado = texto.getEstilos().add(Estilo.SUBLINHADO);
    }

    @Override
    public String render() {
        if (!aplicarSublinhado) {
            return texto.render();
        }

        return "<u>" + super.render() + "</u>";
    }

    @Override
    public Set<Estilo> getEstilos() {
        return texto.getEstilos();
    }
}
