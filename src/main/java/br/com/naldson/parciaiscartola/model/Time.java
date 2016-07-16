package br.com.naldson.parciaiscartola.model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Time implements Comparable<Time> {

    private final String nome;
    private final String escudoSvg;
    private final String nomeJogador;
    private double pontos;
    private List<Jogadores> jogadores = new ArrayList<Jogadores>(11);
    private String slug;

    public Time(String nome, String escudoSvg, String nomeJogador, String slug) {
        this.nome = nome;
        this.escudoSvg = escudoSvg;
        this.nomeJogador = nomeJogador;
        this.slug = slug;
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

    public String getFormatPontos() {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(this.pontos);
    }

    public double getPontos() {
        return pontos;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int compareTo(Time outro) {
        if (outro.getPontos() > getPontos()) {
            return 1;
        }
        return -1;
    }
}
