package com.aula;

import java.util.Set;

public class ItalicoDecorador extends TextoDecorador {
    private final boolean aplicarItalico;

    public ItalicoDecorador(Texto texto) {
        super(texto);
        aplicarItalico = texto.getEstilos().add(Estilo.ITALICO);
    }

    @Override
    public String render() {
        if (!aplicarItalico) {
            return texto.render();
        }

        return "<i>" + super.render() + "</i>";
    }

    @Override
    public Set<Estilo> getEstilos() {
        return texto.getEstilos();
    }
}
