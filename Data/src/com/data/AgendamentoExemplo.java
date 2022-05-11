package com.data;

public class AgendamentoExemplo {
    public static void main(String[] args) {
        Hora inicio = new Hora();
        Hora duracao = new Hora();
        inicio.inicializarHora((byte)10,(byte)30,(byte)0);
        duracao.inicializarHora((byte)2,(byte)15,(byte)0);

        Data dia = new Data();
        dia.inicializarData((byte)10,(byte)05,(short)22);
        Contato alunos[] = new Contato[4];
        alunos[0] = new Contato("Everaldina G. Barbosa", "everaldina@gmail.com", "73982003551");
        alunos[1] = new Contato("Mathues", "math@gmail.com", "21981664552");
        alunos[2] = new Contato("Igorrr", "puts@gmail.com", "73991439623");
        alunos[3] = new Contato("Albertinho", "birll@gmail.com", "72999664438");

        Agendamento prova = new Agendamento();
        prova.iniciAgendamento("prova", inicio, duracao, dia, alunos);
        prova.printDados();

    }
}
