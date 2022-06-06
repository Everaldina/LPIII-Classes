package com.data;

public class DataHora {
    private Data data;
    private Hora hora;

    public DataHora(){
        this.data = new Data();
        this.hora = new Hora();
    }
    public DataHora(byte dia, byte mes, short ano,  byte hora, byte min, byte sec){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, min, sec);
    }

    public String toString(){
        return data.printData() + " "+ hora.printHora();
    }

    public boolean isEqual(DataHora outroObjeto){
        if(data == outroObjeto.getData())
            return true;
        return false;
    }

    public void setData(Data data){
        this.data = data;
    }
    public void setHora(Hora hora){
        this.hora = hora;
    }

    public Data getData(){
        return data;
    }
    public Hora getHora(){
        return hora;
    }




}
