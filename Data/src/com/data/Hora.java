package com.data;

public class Hora {
    private byte horas, minutos, segundos;

    public boolean inicializarHora(byte hrs, byte min, byte sec){
        if(verificarHora(hrs, min, sec)){
            setHoras(hrs);
            setMinutos(min);
            setSegundos(sec);
            return true;
        }else{
            setHoras((byte) 0);
            setMinutos((byte) 0);
            setSegundos((byte) 0);
            return false;
        }
    }

    private boolean verificarHora(byte hrs, byte min, byte sec){
        if(hrs>=0 && hrs<24 && min<60 && min>=0 && sec<60 && sec>=0)
            return true;
        else
            return false;
    }

    private void setHoras(byte hrs){
        this.horas = hrs;
    }
    private void setMinutos(byte min){
        this.minutos = min;
    }
    private void setSegundos(byte sec){
        this.segundos = sec;
    }

    public byte getHoras(){
        return this.horas;
    }
    public byte getMinutos(){
        return this.minutos;
    }
    public byte getSegundos(){
        return this.segundos;
    }

    public boolean eAM(){
        if(horas<12)
            return true;
        else
            return false;
    }

    public int toSec(){
        int value;
        value = segundos + (minutos*60) + (horas*360);
        return value;
    }

    public void somarHora(byte hrs, byte min, byte sec){
        this.horas = (byte) ((hrs + this.horas)%24);
        this.minutos = (byte) ((min + this.minutos)%60);
        this.segundos = (byte) ((sec + this.segundos)%60);
    }

    public String printHora(){
        return horas+":"+minutos+":"+segundos;
    }
}
