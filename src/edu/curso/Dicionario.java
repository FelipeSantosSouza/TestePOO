package edu.curso;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Dicionario {

	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap();
		
		String p=JOptionPane.showInputDialog("Digite a palavra: ");
		try{
		while (p.compareTo("s")!=0){
			
		if(dic.containsKey(p)){
			JOptionPane.showMessageDialog(null,"Defini��o: "+dic.get(p));
		}
		else{
			String d = JOptionPane.showInputDialog("Palavra n�o existe digite a defini��o: ");;
			dic.put(p, d);
		}
		p=JOptionPane.showInputDialog("Digite a palavra: ");
		}
		}
		catch(NullPointerException e){
		System.out.println("Saiu");
		}
		}
	
	}


