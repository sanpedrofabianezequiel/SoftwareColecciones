package com.curso.java.utilidades;

import java.util.Comparator;

import com.curso.java.entidades.Usuarios;

public class UsuarioOrdenClave  implements Comparator<Usuarios>{

	
	//Clase solo PARA ORDENAR
	@Override
	public int compare(Usuarios usuario1, Usuarios usuario2) {
		
		return usuario1.getClave().compareTo(usuario2.getClave());
	}

}
