package br.com.helpcarol.utils;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
	
	private static final String PKG_DIR = "./bin/br/com/helpcarol/";

	public static void salvar(String nomeArquivo, String conteudo) {
		
		nomeArquivo = PKG_DIR + nomeArquivo;
		
		try {
			FileWriter myWriter = new FileWriter(nomeArquivo);

			myWriter.write(conteudo);

			myWriter.close();

			System.out.println("Sucesso ao gravar o arquivo" + nomeArquivo + ".");

		} catch (IOException ioe) {

			System.err.println("Houve um erro ao tentar salvar o arquivo \"" + nomeArquivo + "\":\n\n");

			ioe.printStackTrace();
		}

	}

}
