package com.data;
import java.util.*;

public class testeHoraFunca {
    public static void main(String[] args) {
        Hora hora1 = new Hora((byte) 20,(byte)40,(byte)23);
        Hora hora2 = new Hora((byte)23,(byte)43,(byte)12);

        if(hora1.eAM())
            System.out.println(hora1.printHora() +" eh AM");
        else
            System.out.println(hora1.printHora() +" eh PM");

        if(hora2.eAM())
            System.out.println(hora2.printHora() +" eh AM");
        else
            System.out.println(hora2.printHora() +" eh PM");

        System.out.println("De "+ hora1.printHora()+" ate "+hora2.printHora()+" sao: "+hora1.cronometra(hora2)+" segundos");

        System.out.println("\nHora original: "+hora1.printHora());
        System.out.println("+"+hora2.printHora());
        hora1.adiantaemSegundos(hora2.toSec());
        System.out.println("Nova hora: "+hora1.printHora());
    }

}
