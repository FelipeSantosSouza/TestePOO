package edu.curso;

import java.util.HashMap;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap();
		
		map.put("São Paulo", 10000000);

		map.put("Rio de Janeiro", 10000000);

		map.put("Salvador", 10000000);

		map.put("São Paulo", 10000000);
		
		Set<String> chaves = map.keySet();
		
		for (String chave : chaves){
			System.out.println("Chave : "+chave+" Valor: "+map.get(chave));
		}
	}

}
