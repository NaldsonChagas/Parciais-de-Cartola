package br.com.naldson.turmacachaca.model;

public class Jogadores {
	private Integer id;
	private String name;
	
	public Jogadores(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
