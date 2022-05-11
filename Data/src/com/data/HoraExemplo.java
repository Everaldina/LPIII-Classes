package com.data;

import java.util.Scanner;

public class HoraExemplo {
    public static void main(String[] args) {
        byte hrs=0,min=0, sec=0;
        String horario;
        boolean reg=false; //true quando data inserida em formato valido

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Digite a hora (hh:mm:ss): ");
            horario = input.nextLine();

            try{// pega data no formato dd/mm/aaaa
                hrs = (byte) Integer.parseInt(horario.substring(0,2));
                min = (byte) Integer.parseInt(horario.substring(3,5));
                sec= (byte) Integer.parseInt(horario.substring(6));
                reg = true;
            }catch (NumberFormatException e){
                System.out.println("\nFormato inválido.\n\n");
            }
        }while(!reg);

        Hora agora = new Hora();
        reg = agora.inicializarHora(hrs, min, sec);

        //verifica se data foi inicializada corretamente
        if(reg){
            //imprime dia da semana da data
            System.out.println("Horario - "+agora.printHora());

            if(agora.eAM()){
                System.out.println("Esta de manha");
            }else{
                System.out.println("Esta de noite");
            }

            reg = !reg;
            do{
                System.out.print("Digite a hora pra adicionar (hh:mm:ss): ");
                horario = input.nextLine();

                try{// pega data no formato dd/mm/aaaa
                    hrs = (byte) Integer.parseInt(horario.substring(0,2));
                    min = (byte) Integer.parseInt(horario.substring(3,5));
                    sec= (byte) Integer.parseInt(horario.substring(6));
                    reg = true;
                }catch (NumberFormatException e){
                    System.out.println("\nFormato inválido.\n\n");
                }
            }while(!reg);
            agora.somarHora(hrs, min, sec);
            System.out.println("Horario - "+agora.printHora());

        }else{
            System.out.println("\nHora invalida");
        }
        input.close();
    }
}


