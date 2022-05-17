package com.data;

public class Hora {
    private byte horas, minutos, segundos;

    public Hora(){
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    public Hora(byte hrs, byte min, byte sec){
        horas = hrs;
        minutos = min;
        segundos = sec;
    }

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
        value = segundos + (minutos*60) + (horas*3600);
        return value;
    }

    public void somarHora(int hrs, int min, int sec){
        this.horas = (byte) ((hrs + this.horas)%24);
        this.minutos = (byte) ((min + this.minutos)%60);
        this.segundos = (byte) ((sec + this.segundos)%60);
    }

    public String printHora(){
        return horas+":"+minutos+":"+segundos;
    }

    public int cronometra(Hora outraHora){
        int secAgora, secFim;
        secAgora = this.toSec();
        secFim = outraHora.toSec();
        if(secFim >= secAgora)
            return secFim-secAgora;
        else
            return 86400 +secFim -secAgora;
    }

    void adiantaemSegundos(int segundos){
        int sec=0, min, hrs;
        hrs = segundos/3600;
        segundos%=3600;
        min = segundos/60;
        sec = segundos%60;
        this.somarHora(hrs, min, sec);
    }
}
