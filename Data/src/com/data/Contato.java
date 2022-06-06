package com.data;

public class Contato {
    private Nome nome;
    private EMail email;
    private Telefone telefone;


    public Contato(Nome nome, EMail email, Telefone telefone){
        this.nome  = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public Contato(Nome nome, Telefone telefone){
        this.nome  = nome;
        this.telefone = telefone;
        email = new EMail();
    }
    public Contato(Nome nome, EMail email){
        this.nome  = nome;
        this.email = email;
        telefone = new Telefone();
    }
    public Contato(){
        nome  = new Nome();
        email = new EMail();
        telefone = new Telefone();
    }


    private void setNome(String nome){
        this.nome.setNome(nome);
    }
    private void setEmail(String email){
        this.email.setEMail(email);
    }
    private void setTel(String tel){
        this.telefone.setTel(tel);
    }

    public String getNome(){
        return nome.getNome();
    }
    public String getEmail(){
        return email.getEMail();
    }
    public String getTel(){
        return telefone.getTel();
    }

    public void printDados(){
        System.out.println("- Nome: "+nome.getNome());
        System.out.println("- Email: "+email.getEMail());
        System.out.println("- Telefone: "+this.getFormatNum());
    }

    public String getSobrenome(){
        int pos = nome.getNome().lastIndexOf(' ');
        return nome.getNome().substring(pos).trim();
    }
    private String getFormatNum(){
        return telefone.formatTel();
    }

    public String returnDDD(){
        return telefone.getDDD();
    }


}
