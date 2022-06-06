package com.data;
import java.util.*;

public class ContatoExemplo {
    public static void main(String[] args){
        Nome nome= new Nome("Everaldina Guimaraes Barbosa");
        EMail email = new EMail("egbarbosa.cic@uesc.br");
        Telefone tel = new Telefone("73","982003551");

        Contato contato = new Contato(nome, email, tel);

        contato.printDados();
        System.out.println("\nSobrenome: "+contato.getSobrenome());
        System.out.println("DDD: "+contato.returnDDD());


    }
}
