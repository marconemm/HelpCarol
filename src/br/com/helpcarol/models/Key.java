package br.com.helpcarol.models;

public class Key {
	
	private final String value;

	public Key(Object value) {
		this.value = String.valueOf(value);
	}

	@Override
	public String toString() {
		return value;
	}
	
	
}
