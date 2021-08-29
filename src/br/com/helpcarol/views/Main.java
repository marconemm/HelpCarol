package br.com.helpcarol.views;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.helpcarol.models.Key;
import br.com.helpcarol.models.Dict;
import br.com.helpcarol.models.Value;

public class Main {

	public static void main(String[] args) {

		Dict palavras = new Dict();

		palavras.setValue(new Key("autor"), new Value("Coord. Disciplina"));
		palavras.setValue(new Key("alias"), palavras.getValue(new Key("autor")));
		palavras.setValue(new Key("data-atual"), new Value(LocalDate.now()));
		palavras.setValue(new Key("hora-atual"), new Value(LocalTime.now()));
		palavras.setValue(new Key("discilina"), new Value("POO"));

		LocalDate data_ad1 = LocalDate.of(2021, 8, 16);

		palavras.setValue(new Key(data_ad1), new Value("Lançar AD1 na plataforma"));
		palavras.delValue(new Key("alias"));

		System.out.println(palavras);
		System.out.println(palavras.toJson());

		Dict.salvar("teste.json", palavras.toJson());

	}

}
