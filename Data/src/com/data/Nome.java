package com.data;

public class Nome {
    private String nome;

    public Nome(String nome){
        this.nome = nome;
    }
    public Nome(){
        this(null);
    }

    public void toMasc(){
        nome = nome.toUpperCase();
    }

    public void toMin(){
        nome = nome.toLowerCase();
    }

    public void capitalize(){
        String[] parts = nome.split(" ");
        String temp=null, aux;
        int partTam = parts.length;
        for(int i=0;i<partTam;i++){
            aux = parts[i].substring(0,1).toUpperCase() + parts[i].substring(1);
            if(temp==null)
                temp = aux;
            else
                temp = temp+" " + aux;
        }
        nome = temp;
    }

    public void noSpace(){
        String[] parts = nome.split(" ");
        String temp=null, aux;
        int partTam = parts.length;
        for(int i=0;i<partTam;i++){
            if(temp==null)
                temp = parts[i];
            else
                temp = temp + parts[i];
        }
        nome = temp;
    }

    //acentos

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
