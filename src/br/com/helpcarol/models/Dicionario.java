package br.com.helpcarol.models;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import br.com.helpcarol.utils.Salvavel;

public class Dicionario extends Salvavel {

	private Dictionary<String, String> privDict = new Hashtable<String, String>();

	public void setValor(Chave key, Object value) {
		String strKey = key.toString();
		String strValue = String.valueOf(value);

		this.privDict.put(strKey, strValue);

	}

	@Override
	public String toString() {
		String result = "";

		Enumeration<String> valuesEnum = privDict.elements();

		for (Enumeration<String> key = privDict.keys(); key.hasMoreElements();) {

			result += key.nextElement() + "=" + valuesEnum.nextElement() + "\n";
		}

		return result;
	}

	public Object getValor(Chave chave) {

		String strKey = chave.toString();
		Object result = privDict.get(strKey);

		return result;
	}

	public void delValor(Chave chave) {

		this.privDict.remove(chave.toString());
	}

	public String toJson() {

		String result = "{";

		Enumeration<String> valuesEnum = privDict.elements();

		for (Enumeration<String> key = privDict.keys(); key.hasMoreElements();) {

			result += "\""+key.nextElement()+"\"" + ":"+"\"" + valuesEnum.nextElement() + "\",";
		}
		
		result = result.substring(0, result.length() -1); // remove the last comma.
		
		result += "}\n";

		return result;
	}

}
