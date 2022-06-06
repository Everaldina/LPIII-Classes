package com.data;

public class EMailExemplo {
    public static void main(String[] args) {
        EMail meu = new EMail("everaldinag@gmail.com");
        boolean val = (meu.emailValido());

        System.out.println("email = "+ meu.getEMail());
        System.out.println("valido = "+ val );
        System.out.println("dominio = "+ meu.getDominio());
        System.out.println("dominio longo = "+ meu.getDominioLong());
    }
}
