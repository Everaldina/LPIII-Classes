package com.data;

import java.util.*;

public class ExemploData {
    public static void main(String[] args) {
        byte mes=0,dia=0;
        short ano=0;
        String data;
        boolean reg=false; //true quando data inserida em formato valido

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Digite o data (dd/mm/aaaa): ");
            data = input.nextLine();

            try{// pega data no formato dd/mm/aaaa
                dia = (byte) Integer.parseInt(data.substring(0,2));
                mes = (byte) Integer.parseInt(data.substring(3,5));
                ano = (short) Integer.parseInt(data.substring(6));
                reg = true;
            }catch (NumberFormatException e){
                System.out.println("\nFormato inválido.\n\n");
            }
        }while(reg==false);
        input.close();

        //inicializa objeto data
        Data hoje = new Data();
        hoje.inicializarData(dia, mes, ano);

        //verifica se data foi inicializada corretamente
        if(hoje.getDia()!=0){
            //imprime dia da semana da data
            System.out.println("\n"+ hoje.printData()+" é "+ hoje.diaSemana());
        }else{
            System.out.println("\nData invalida");
        }
    }
}
