package com.data;
import java.util.*;

public class ContatoExemplo {
    public static void main(String[] args){
        String nome="Everaldina Guimaraes Barbosa";
        String email = "egbarbosa.cic@uesc.br";
        String tel = "73982003551";

        Contato contato = new Contato();
        contato.inicializaContato(nome, email, tel);

        contato.printDados();
        System.out.println("\n\nSobrenome: "+contato.sobrenome());
        System.out.println("DDD: "+contato.getDDD());
    }
}
