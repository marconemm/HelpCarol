package br.com.helpcarol.models;

public class Valor {

	private final Object value;

	public Valor(Object value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return this.value.toString();
	}
	
}
