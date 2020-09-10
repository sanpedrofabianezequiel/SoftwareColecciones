package com.curso.java.Clase07;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.curso.java.entidades.Usuarios;
import com.curso.java.utilidades.UsuarioOrdenClave;

public class ColeccionSet3 {

	public static void main(String [] args) {
		
		//Interfaz para Ordenar
		UsuarioOrdenClave ordenClave =new UsuarioOrdenClave();
		ordenID ordenID= new ordenID();
		//Le enviamos el ordenClave
		
		
		
		//---Podemos crear un ANONIMO
		
		Comparator<Usuarios> ordernAnonimo=new Comparator<Usuarios>() {

			@Override
			public int compare(Usuarios o1, Usuarios o2) {
				// TODO Auto-generated method stub
				return o1.getCorre().compareTo(o2.getCorre());
			}
			
		};
		
		
		//------------------------------
		
		
		
		//Set<Usuarios> usuarios = new LinkedHashSet<Usuarios>();
		//Set<Usuarios> usuarios = new TreeSet<Usuarios>(ordenClave);//Le enviamos el ordenClave
		Set<Usuarios> usuarios = new TreeSet<Usuarios>(ordenID);//Le enviamos el ordenClave

		
		usuarios.add(new Usuarios("orobleto", "1"));
		usuarios.add(new Usuarios("mbracho", "2"));
		usuarios.add(new Usuarios("aprez", "3"));
		usuarios.add(new Usuarios("aprez", "4"));
		
		for (Usuarios var : usuarios) {
			System.out.println(var);
		}
		
		System.out.println("************************");
		
		//-------------
		//Para eliminar usamos un iterator
		
		Iterator<Usuarios> it= usuarios.iterator();
		/*while(it.hasNext()) {
			
			//Obtengo el siguiente elemento, y sus metodos y comparo
			if (it.next().getId().equals(4)) {
				it.remove();
			}
		}
		*/
		
		for (Usuarios var : usuarios) {
			System.out.println(var);
		}
		
	}
}

//-------------------Clase interna
class ordenID implements Comparator<Usuarios>{

	@Override
	public int compare(Usuarios o1, Usuarios o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
	
}








