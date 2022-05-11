package com.data;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Agendamento {
    private String nome;
    private Hora horaInicio;
    private Hora duracao;
    private Data data;
    private Contato[] participantes;


    public void iniciAgendamento(String nome, Hora ini, Hora temp, Data data, Contato[] pessoas){
        setNome(nome);
        setInicio(ini);
        setDuracao(temp);
        setData(data);
        setParticipantes(pessoas);
    }

    private void setNome(String Nome){
        this.nome = Nome;
    }
    private void setInicio(Hora Inicio){
        this.horaInicio = Inicio;
    }
    private void setDuracao(Hora tempo){
        this.duracao = tempo;
    }
    private void setData(Data data){
        this.data = data;
    }
    private void setParticipantes(Contato[] pessoas){
        for(Contato pessoa : pessoas) {
            this.participantes = appendContato(pessoa);
        }
    }

    public String getNome(){
        return nome;
    }
    public Hora getInicio(){
        return horaInicio;
    }
    public Hora getDuracao(){
        return duracao;
    }
    public Data getData(){
        return data;
    }
    public Contato[] getParticipantes(){
        return  participantes;
    }

    private Contato[] appendContato(Contato novoCont) {
        if(this.participantes==null){
            ArrayList<Contato> temp = new ArrayList<Contato>();
            temp.add(novoCont);
            return temp.toArray(new Contato[0]);
        }else {
            ArrayList<Contato> temp = new ArrayList<Contato>(Arrays.asList((this.participantes)));
            temp.add(novoCont);
            temp.toArray(new Contato[0]);
            return temp.toArray(new Contato[0]);
        }

    }

    public Hora fim(){
        Hora fim = new Hora();
        fim = horaInicio;
        fim.somarHora(duracao.getHoras(), duracao.getMinutos(), duracao.getSegundos());
        return fim;
    }

    public void printDados(){
        System.out.println(nome.toUpperCase(Locale.ROOT));
        System.out.println("- Inicio: "+ horaInicio.printHora());
        System.out.println("- Duração: "+ duracao.printHora());
        System.out.println("- Fim: "+ this.fim().printHora());
        System.out.println("Participantes:");
        for (Contato pessoa: participantes){
            System.out.println("- "+pessoa.getNome());
        }
    }
}
