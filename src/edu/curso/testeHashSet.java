package edu.curso;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testeHashSet {

	public static void main(String[] args) {
		Set h =new HashSet();
		h.add("Texto1");
		h.add(10);
		h.add(new StringBuffer("String Buffer Text"));
		
		Iterator objiterator= h.iterator();
	
		while (objiterator.hasNext()) {
			
		}
		System.out.println("Tamanho " + h.size());
		System.out.println("Elemento texto 1 C: "+ h.contains("Texto1"));
	}
}
