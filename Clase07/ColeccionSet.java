package com.curso.java.Clase07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColeccionSet {

	public static void main(String[] args) {
		
		//No permite datos duplicados
		//Los ordena
		Set<Integer> numeros = new HashSet<Integer>();	
		//Agregar elementos
		numeros.add(2);
		numeros.add(4);
		numeros.add(5);
		numeros.add(8);
		numeros.add(1);
			for (Integer var : numeros) {
				System.out.println(var);
			}
		
			numeros.add(3);
			System.out.println("*******************");
			for (Integer var : numeros) {
				System.out.println(var);
			}
			
				numeros.remove(5);
				System.out.println("*******************");
				for (Integer var : numeros) {
					System.out.println(var);
				}
				
				//Determinamos TRUE O FALSE si contiene el elemento dentro del HasSet
				System.out.println(numeros.contains(8));
				
				
		//--------------------------------------------------
				
		Set<Integer> numeroPares=new HashSet<Integer>();
		numeroPares.add(2);
		numeroPares.add(4);
		
		//Tu contienes todas los elemtnos que tiene numeros pares dentro de numeros?
		System.out.println(numeroPares.containsAll(numeroPares));
		
			//Podemos eliminar todo los elementos que tenga numerosPares dentro de Numeros
			numeros.removeAll(numeroPares);
			
			
			numeros.addAll(numeroPares);//Agregamos todos los elementos de numerosPares en Numeros
		
			
		//---------------------------------------------------
		//Eliminar elementos de la collecion
			//Esto lanza un erro por que no s epuede  iterar asi
		/*for (Integer var : numeros) {
			//Por cada elemento que recorra dentro de la coleccion
			if(var %2 != 0) {
				numeros.remove(var);
			}
		}*/
			
			
		//Creamos un ITERADOR para realizar un CRUD
			//LE asignamos todos los elementos del elemento NUMEROS al "IT"
			Iterator<Integer> it=numeros.iterator();
			
			//----
			System.out.println("Iteradores ******************");
			while(it.hasNext()) {
				System.out.println(it.next());
				
				//Podemos realizar las acciones de CRUD en el ITERADOR no la coleccion
				if (it.next() % 2 !=0) {//Para saber si es Par
					it.remove();
				}
			}
			//Solo se permite usar una vez el Iterador
		
	}
	
}






