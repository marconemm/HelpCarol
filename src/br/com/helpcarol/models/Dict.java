package br.com.helpcarol.models;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import br.com.helpcarol.utils.Save;

public class Dict extends Save {

	private final Dictionary<String, String> privDict = new Hashtable<String, String>();

	public void setValue(Key key, Object value) {
		String strKey = key.toString();
		String strValue = value.toString();

		this.privDict.put(strKey, strValue);

	}

	@Override
	public String toString() {
		String result = "";

		final Enumeration<String> values = privDict.elements();

		final Enumeration<String> keys = privDict.keys();

		while (keys.hasMoreElements()) {
			result += keys.nextElement() + "=" + values.nextElement() + "\n";
		}

		return result;
	}

	public Object getValue(Key chave) {

		final String strKey = chave.toString();
		final Object result = privDict.get(strKey);

		return result;
	}

	public void delValue(Key chave) {

		privDict.remove(chave.toString());
	}

	public String toJson() {

		String result = "{";

		final Enumeration<String> values = privDict.elements();

		final Enumeration<String> keys = privDict.keys();

		while (keys.hasMoreElements()) {
			result += "\"" + keys.nextElement() + "\"" + ":" + "\"" + values.nextElement() + "\",";
		}

		final int endIndex = result.length() -1;
		
		result = result.substring(0, endIndex); // remove the last comma.
		
		result += "}\n";

		return result;
	}

}
