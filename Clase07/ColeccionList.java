package com.curso.java.Clase07;

import java.util.*;

public class ColeccionList {
	public static void main(String[] args) {
		
		List<String> listaNOmbres=new ArrayList<String>();
		
		listaNOmbres.add("Octavio");
		listaNOmbres.add("Analia");
		listaNOmbres.add("Jose");
		listaNOmbres.add(3,"rafael");
		
		
		for (String var : listaNOmbres) {
			System.out.println(var);
		
			
		}
		listaNOmbres.set(0, "Octavio robledo");
		System.out.println(listaNOmbres.get(2));
		
		
		
		
		for (int i = 0; i < listaNOmbres.size(); i++) {
			if (listaNOmbres.get(i).equals("rafael")) {
				listaNOmbres.remove(i);
			}
		}
		
		
		for (String string : listaNOmbres) {
			System.out.println(string);
		}
		
		
	}

}
