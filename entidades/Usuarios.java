package com.curso.java.entidades;

public class Usuarios implements Comparable<Usuarios>{
	
	private String corre;
	private String clave;
	private static Integer contador=0;
	private Integer id;
	
	public Usuarios(String corre, String clave) {
		
		this.corre = corre;
		this.clave = clave;
		contador++;
		this.id=contador;
	}
	
	
	
	//-----para comparar
	
	@Override
	public boolean equals(Object obj) {
	//Soy igual a otro?
		//Un objeto es igual a otro por el ID
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof Usuarios) {	//si es instanciado de USUARIO
			//Ejemplo
			/*
			Usuarios usuario1=new Usuarios("eze", "2312");
			Usuarios usuario2=new Usuarios("eze", "2312");*/
			
			//PRIMERO EL OBJETO QUE RECIBO LO CASTEO Y COMPARO IDS X EJEMPLO
			Usuarios aux= (Usuarios) obj;
			//Comparacion
			if (this.id == aux.getId() ) {
				return true;
			}
		}
		
		return super.equals(obj);
	}
	

	@Override
	public String toString() {
		return "Usuarios [corre=" + corre + ", clave=" + clave + ", id=" + id + "]";
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public static Integer getContador() {
		return contador;
	}

	public static void setContador(Integer contador) {
		Usuarios.contador = contador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public int compareTo(Usuarios o) {
		//De esta forma estamos determinando que se ordene de forma ascendente
		//Comparamos el ID que tengo con el ID que RECIBO
		
		//return this.id - o.getId();	
		return this.corre.compareTo(o.getCorre());//Para saber si un elemento es igual al otro
	}
	
	
	
	

}
