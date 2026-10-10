package com.aula;

public class Main {
    public static void main() {
        Texto texto = new TextoSimples();
        System.out.println(texto.render());

        texto = new NegritoDecorador(texto);
        System.out.println(texto.render());

        texto = new NegritoDecorador(texto);
        System.out.println(texto.render());

        texto = new ItalicoDecorador(texto);
        System.out.println(texto.render());

        texto = new SublinhadoDecorador(texto);
        System.out.println(texto.render());

        texto = new SublinhadoDecorador(texto);
        System.out.println(texto.render());

        texto = new ItalicoDecorador(texto);
        System.out.println(texto.render());

        texto = new SublinhadoDecorador(texto);
        System.out.println(texto.render());

        texto = new NegritoDecorador(texto);
        System.out.println(texto.render());
    }
}
