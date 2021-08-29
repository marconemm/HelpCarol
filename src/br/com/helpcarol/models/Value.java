package br.com.helpcarol.models;

public class Value {

	private final String value;

	public Value(Object value) {
		this.value = String.valueOf(value);

	}

	@Override
	public String toString() {
		return value;
	}
	
}
