package com.data;

public class NomeExemplo {
    public static void main(String[] args) {
        Nome nome1 = new Nome("everaldina guimaraes barbosa");


        System.out.println("Nome: "+nome1.getNome());
        nome1.capitalize();
        System.out.println("Nome: "+nome1.getNome());
        nome1.toMasc();
        System.out.println("Nome: "+nome1.getNome());
        nome1.toNoSpace();
        System.out.println("Nome: "+nome1.getNome());
        nome1.toMin();
        System.out.println("Nome: "+nome1.getNome());
    }

}
