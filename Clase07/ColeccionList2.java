package com.curso.java.Clase07;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import com.curso.java.entidades.Usuarios;

public class ColeccionList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Usuarios> listaUsuarios= Arrays.asList(
				new Usuarios("user1", "1234"),
				new Usuarios("user2", "1234"),
				new Usuarios("user3", "123456"),
				new Usuarios("user4", "1234")
				);
		*/
		
	
		List<Usuarios> listaUsuarios=new ArrayList<Usuarios>();
	listaUsuarios.add(	new Usuarios("user1", "1234"));
	listaUsuarios.add(new Usuarios("user2", "1234")	);
	listaUsuarios.add(	new Usuarios("user3", "1234"));
	listaUsuarios.add(new Usuarios("user5", "1234")	);		
	
	
	//-------
		for (Usuarios var : listaUsuarios) {
			System.out.println(var);
		}
		
		//--------------------------------
		//= la MYLISTA.MYITERADOR();
		ListIterator<Usuarios> it= listaUsuarios.listIterator();
		
		
		while(it.hasNext()) {
			Usuarios aux= it.next();
			System.out.println(aux);
			//Reemplazo de usuario
			if (aux.getCorre().equalsIgnoreCase("user3")) {
				
				it.set(new Usuarios("user500", "4564"));
				
			}
			
		}
		//---Para movernos hacia atras PREVIAMENTE teniamos que movernos hacia adelante
		while(it.hasPrevious()) {	//si hay un elemento anterior
			
			System.out.println(it.hasPrevious());
		}
		
		
	}

}
