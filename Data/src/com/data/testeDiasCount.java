package com.data;

public class testeDiasCount {
    public static void main(String[] args) {
        Data data1 = new Data((byte)10,(byte)5,(short)2022);
        Data data2 = new Data((byte)11,(byte)4,(short)2021);

        System.out.println(data1.printData()+" eh "+data1.diaSemana());
        System.out.println(data2.printData()+" eh "+data2.diaSemana());

        if(data1.eAnterior(data2))
            System.out.println(data2.printData() + " vem antes que " + data1.printData());
        else
            System.out.println(data2.printData() + " vem depois que " + data1.printData());

        System.out.println("Sao "+data1.quantosDiasAte(data2)+" dias de "+data1.printData()+" ate "+data2.printData());
    }
}
