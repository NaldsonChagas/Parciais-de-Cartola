package br.com.naldson.turmacachaca.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private String escudoSvg;
	private String nomeJogador;
	private double pontos;
	@SuppressWarnings("unused")
	private List<Jogadores> jogadores = new ArrayList<Jogadores>(12);

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

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public void setJogadores(List<Jogadores> jogadores) {
		this.jogadores = jogadores;
	}
}
