package com.data;

public class Data {
    private byte dia, mes;
    private short ano;

    //constutores
    public Data(byte dia, byte mes, short ano){
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = (byte) 0;
            this.mes = (byte) 0;
            this.ano = (short) 0;
        }
    }
    public Data(){
        this.dia = (byte) 0;
        this.mes = (byte) 0;
        this.ano = (short) 0;
    }

    //instancia objeto
    public boolean inicializarData(byte dia, byte mes, short ano){
        //verifica se data existe
        if(verificarData(dia, mes, ano)){
            setAno(ano);
            setDia(dia);
            setMes(mes);
            return true;
        }else{//todos os campos são 0 se data invalida
            setAno((short)0);
            setDia((byte)0);
            setMes((byte)0);
            return false;
        }
    }

    //retorna se a data é valida
    private boolean verificarData(byte dia, byte mes, short ano){
        if(ano>=1 && mes>=1 && mes<=12 && dia>=1){
            if(dia>diaMes(mes, ano)){//verifica se o dia informado existe em determinado mes
                return false;
            }
            return true;
        }
        return false;
    }

    //retorna quantidade de dias de determinado mes
    public byte diaMes(byte mes, short ano){
        switch (mes){
            case 1:
                return 31;
            case 2: // se o ano for bissexto fevereiro tem dias diferentes
                if(isLeap(ano)){
                    return 29;
                }
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }

    //retorna true para anos bissextos e false para os demais
    public boolean isLeap(short ano){
        if(ano%400==0){
            return true;
        }else if(ano%4==0 && ano%100!=0){
            return true;
        }
        return false;

    }

    //retorna dia da semana de um data
    public String diaSemana(){
        byte codDia;
        short addMeses=0; // soma de todos os dias dos meses anteriores a data

        //soma dias de todos meses anteriores
        //mes atual nao é contabilizado
        addMeses = countDiasMeses(mes, ano);


        if(!isLeap(ano)){
            //codDia =(byte) ((5 + ((ano/4)*2) +(ano-(ano/4)) + dia + addMeses)%7);
            //simplificando
            codDia =(byte) ((5 + ((5*ano)/4) + dia + addMeses)%7);
        }else{
            //codDia = (byte) ((5 + (((ano/4)-1)*2) +(ano-((ano/4)-1)) + dia + addMeses)%7);
            //simplificando
            codDia = (byte) ((4+ ((5*ano)/4)+dia+addMeses)%7);
        }

        //retorna dia da semana de acordo ao codigo do dia
        switch(codDia){
            case 0:
                return "Domingo";
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sabado";
            default:
                return "Erro";
        }
    }

    //retorna dia
    public byte getDia(){
        return dia;
    }
    //retorna mes
    public byte getMes(){
        return mes;
    }
    //retorna ano
    public short getAno(){
        return ano;
    }

    //muda dia
    private void setDia(byte dia){
        this.dia = dia;
    }
    //muda mes
    private void setMes(byte mes){
        this.mes = mes;
    }
    //muda ano
    private void setAno(short ano){
        this.ano = ano;
    }


    public String printData(){
        return dia+"/"+mes+"/"+ano;
    }

    //verdadeiro se outraData < data
    public boolean eAnterior(Data outraData){
        if(ano > outraData.getAno())
            return true;
        if(ano == outraData.getAno()){
            if(mes > outraData.getMes())
                return true;
            if(mes == outraData.getMes()){
                if (dia > outraData.getDia())
                    return true;
                return false;
            }
            return false;
        }
        return false;

    }

    public int quantosDiasAte(Data outraData){
        int countDias=0;
        boolean maior;

        countDias = countDiasAnos(ano, outraData.getAno());
        countDias += countDiasMeses(mes, outraData.getMes(), ano);
        countDias += outraData.getDia() -dia;

        return countDias;

    }

    private int countDiasAnos(short fim){
        int dias=0;
        do{
            if(isLeap((short)(fim-1))){
                dias+=366;
            }else{
                dias+=365;
            }
            fim--;
        }while (fim>0);
        return  dias;
    }
    private int countDiasAnos(short inicio, short fim){
        int dias=0;
        boolean maior;
        short aux;

        if(fim==inicio)
            return dias;
        maior = (fim>inicio)? true : false;

        if(!maior){
            aux = fim;
            fim = inicio;
            inicio = aux;
        }

        do{
            if(isLeap((short)(fim-1))){
                dias+=366;
            }else{
                dias+=365;
            }
            fim--;
        }while (fim>inicio);

        if(maior)
            return  dias;
        else
            return  -dias;
    }

    private short countDiasMeses(byte fimMes, short ano){
        short dias=0;
        do{
            fimMes--;
            dias += diaMes(fimMes, ano);
        }while(fimMes>0);
        return  dias;
    }
    private short countDiasMeses(byte inicioMes, byte fimMes, short ano){
        short dias=0;
        boolean maior;
        byte aux;

        if(fimMes>inicioMes)
            maior = true;
        else
            maior = false;

        if(!maior){
            aux = fimMes;
            fimMes = inicioMes;
            inicioMes = aux;
        }

        while(fimMes>inicioMes){
            fimMes--;
            dias += diaMes(fimMes, ano);
        };

        if(maior)
            return  dias;
        else
            return  (short) -dias;
    }

}
