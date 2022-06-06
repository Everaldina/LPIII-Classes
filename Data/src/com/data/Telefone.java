package com.data;

public class Telefone {
    private String telefone;

    public Telefone(String DDD, String numero){
        if(telValido(DDD, numero)){
            if(DDD==null)
                this.setTel(numero);
            else
                this.setTel(DDD + numero);
        }else{
            telefone = null;
        }
    }
    public Telefone(String numero){
        this(null, numero);
    }
    public Telefone(){
        this.telefone = null;
    }

    private boolean telValido(String DDD, String numero){
        if(DDD==null){
            return telValido(numero);
        }

        if (DDD.length()==2){
            if(numero.length()==8){
               return true;
            }else if(numero.length()==9 && numero.charAt(0)=='9'){
                return true;
            }
        }
        char ch = numero.charAt(0);
        System.out.println(ch);
        return false;
    }
    private boolean telValido(String numero){
        if(numero.length()==8){
            return true;
        }else if(numero.length()==9 && numero.charAt(0)=='9'){
            return true;
        }
        return false;
    }


    public String formatTel(){
        String aux;
        int size;

        if(telefone!=null) {
            size= telefone.length();
            if (size > 9) {//numero com ddd
                aux = "(" + telefone.substring(0, 2) + ") " + telefone.substring(2, size - 4) + "-" + telefone.substring(size - 4);
            } else {
                aux = telefone.substring(0, size - 4) + "-" + telefone.substring(size - 4);
            }
            return aux;
        }
        return null;
    }

    public String getDDD(){
        if(telefone!=null  && telefone.length()>9)
            return telefone.substring(0,2);
        return null;
    }

    public String getTel() {
        return telefone;
    }
    public void setTel(String tel) {
        this.telefone = tel;
    }
}
