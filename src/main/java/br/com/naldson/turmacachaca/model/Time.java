package br.com.naldson.turmacachaca.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nome;
    private String escudoSvg;
    private String nomeJogador;
    private double pontos;
    private List<Jogadores> jogadores = new ArrayList<Jogadores>(11);

    public Time(String nome, String escudoSvg, String nomeJogador) {
        this.nome = nome;
        this.escudoSvg = escudoSvg;
        this.nomeJogador = nomeJogador;
    }

    public String getNome() {
        return nome;
    }

    public String getEscudoSvg() {
        return escudoSvg;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public String getPontos() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(this.pontos);
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public List<Jogadores> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogadores> jogadores) {
        this.jogadores = jogadores;
    }
}
