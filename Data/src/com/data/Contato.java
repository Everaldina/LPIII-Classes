package com.data;

public class Contato {
    private String nome, email, telefone;

    public Contato(String nome, String email, String tel){
        setNome(nome);
        setTel(formatNum(tel));
        setEmail(email);
    }

    public Contato(){
        setNome(null);
        setTel(null);
        setEmail(null);
    }
    public boolean inicializaContato(String nome, String email, String tel){
        setNome(nome);
        setTel(formatNum(tel));
        setEmail(email);

        if(getTel()==null)
            return false;

        return true;
    }

    private void setNome(String nome){
        this.nome = nome;
    }
    private void setEmail(String email){
        this.email = email;
    }
    private void setTel(String tel){
        this.telefone = tel;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getTel(){
        return telefone;
    }

    public void printDados(){
        System.out.println("- Nome: "+nome);
        System.out.println("- Email: "+email);
        System.out.println("- Telefone: "+telefone);
    }

    public String sobrenome(){
        int pos = nome.lastIndexOf(' ');
        return nome.substring(pos);
    }
    private String formatNum(String num){
        String numFormat = null;
        if(num.length()!=11)
            return numFormat;
        else{
            numFormat = "("+num.substring(0,2)+") "+num.substring(2,7)+"-"+num.substring(7);
            return numFormat;
        }
    }

    public int getDDD(){
        return Integer.parseInt(getTel().substring(1,3));
    }
}
