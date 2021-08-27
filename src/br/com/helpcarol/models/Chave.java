package br.com.helpcarol.models;

public class Chave {
	
	private final String value;

	public Chave(Object value) {
		this.value = String.valueOf(value);
	}

	@Override
	public String toString() {
		return value;
	}
	
	
}
