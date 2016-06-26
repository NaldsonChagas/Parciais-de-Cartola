package br.com.naldson.turmacachaca.model;

public class Jogadores implements Comparable<Jogadores> {

    private final Integer id;
    private final String nome;
    private final String foto;
    private double pontos;
    private final int posicaoId;

    public Jogadores(Integer id, String nome, String foto, int posicaoId) {
        this.id = id;
        this.nome = nome;
        this.foto = foto;
        this.posicaoId = posicaoId;
    }

    public int compareTo(Jogadores outro) {
        if (outro.getPosicaoId() > this.posicaoId) {
            return -1;
        } else if (outro.getPosicaoId() < this.posicaoId) {
            return 1;
        }
        return 0;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFoto() {
        return foto.replace("FORMATO", "140x140");
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public int getPosicaoId() {
        return posicaoId;
    }
}
