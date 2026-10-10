package com.aula;

import java.util.Set;

public class NegritoDecorador extends TextoDecorador {
    private final boolean aplicarNegrito;

    public NegritoDecorador(Texto texto) {
        super(texto);
        aplicarNegrito = texto.getEstilos().add(Estilo.NEGRITO);
    }

    @Override
    public String render() {
        if (!aplicarNegrito) {
            return texto.render();
        }

        return "<b>" + super.render() + "</b>";
    }

    @Override
    public Set<Estilo> getEstilos() {
        return texto.getEstilos();
    }
}
