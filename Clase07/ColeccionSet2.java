package com.curso.java.Clase07;

import java.util.HashSet;
import java.util.Set;

import com.curso.java.entidades.Usuarios;

public class ColeccionSet2 {

	public static void main	(String [] args) {
		
		//No permite repetidos
		/*Set<String> nombres=new HashSet<String>();
		
		nombres.add("Analia");
		nombres.add("Octavio");
		nombres.add("Mariana");
		
		for (String var : nombres) {
			System.out.println(var);
		}*/
		
		
		
		
		//-------------------------
		Set<Usuarios> usuarios =new HashSet<Usuarios>();
		//-----No los ordeno
		usuarios.add(new Usuarios("Orobleto", "1234"));
		usuarios.add(new Usuarios("eas", "1234"));
		usuarios.add(new Usuarios("Orble","1234"));
		usuarios.add(new Usuarios("aprez", "1234"));
		usuarios.add(new Usuarios("aprez", "1234"));
		
		for (Usuarios var : usuarios) {
			System.out.println(var);
		}
		
		//
		Usuarios usuario1=new Usuarios("eze", "2312");
		Usuarios usuario2=new Usuarios("eze", "2312");
		//Comparamos a ver si son iguales
		
		//Usamos el metodo OVERRIDE de la clase USUARIO PARA COMPAR SEGUN LOS METODOS
		//Usamos el metodo OVERRIDE de la clase USUARIO PARA COMPAR SEGUN LOS METODOS
		//Usamos el metodo OVERRIDE de la clase USUARIO PARA COMPAR SEGUN LOS METODOS
		System.out.println(usuario1.equals(usuario2));//Usamos el metodo OVERRIDE de la clase USUARIO PARA COMPAR SEGUN LOS METODOS
	
	
	
	}
}
