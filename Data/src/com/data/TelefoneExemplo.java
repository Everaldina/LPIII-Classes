package com.data;

public class TelefoneExemplo {
    public static void main(String[] args) {
        Telefone tel1 = new Telefone("73", "982003551");
        Telefone tel11 = new Telefone("73", "82003551");
        Telefone tel2 = new Telefone("82003551");
        Telefone tel21 = new Telefone("982003551");

        System.out.println("Numero:"+ tel1.getTel());
        System.out.println("\t-Formatado:"+ tel1.formatTel());
        System.out.println("\t-DDD:"+ tel1.getDDD());

        System.out.println("\nNumero:"+ tel11.getTel());
        System.out.println("\t-Formatado:"+ tel11.formatTel());
        System.out.println("\t-DDD:"+ tel11.getDDD());

        System.out.println("\nNumero:"+ tel2.getTel());
        System.out.println("\t-Formatado:"+ tel2.formatTel());
        System.out.println("\t-DDD:"+ tel2.getDDD());

        System.out.println("\nNumero:"+ tel21.getTel());
        System.out.println("\t-Formatado:"+ tel21.formatTel());
        System.out.println("\t-DDD:"+ tel21.getDDD());


    }
}
