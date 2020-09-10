package com.curso.java.Clase07;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.curso.java.entidades.Usuarios;

public class ColeccionQueue {
	public static void main(String [] args) throws InterruptedException {
		
		Comparator<Usuarios> ordenPar= new Comparator<Usuarios>() {

			@Override
			public int compare(Usuarios o1, Usuarios o2) {
				
				try {//Ordenando por numeros pares
					int clave1= Integer.parseInt(	o1.getClave()  );//Obtenemos las claves
					int clave2= Integer.parseInt(	o2.getClave()  );//Obtenemos las claves
					
					if (clave1 % 2==0 && clave2 %2 !=0) {//determinamos si es PAR
						return -1;
					}else if (clave1 % 2==0 && clave2 %2 !=0) {
						return 1;
					}else {
						return 0;
					}
					
					
					
				} catch (Exception e) {
					return 2; //No esta bien el 2
				}
				
				
			}
		};
		
		//PriorityQueue<E>(orden Que querramos)
		
		
		Queue<Usuarios> usuariosPrioritarios= new PriorityQueue<Usuarios>(ordenPar);
		usuariosPrioritarios.add(	new Usuarios("user1", "1234"));
		usuariosPrioritarios.add(new Usuarios("user2", "1236")	);
		usuariosPrioritarios.add(	new Usuarios("user3", "1238"));
		usuariosPrioritarios.add(new Usuarios("user5", "1234a")	);	
		
		
		for (Usuarios usuarios : usuariosPrioritarios) {
			System.out.println(usuarios);
		}
		System.out.println("*******************");
		//System.out.println(usuariosPrioritarios.peek());//Retorna el objeto
		//System.out.println(usuariosPrioritarios.poll());// Te lo retorna y te lo elimina, segun el ORDEN en este caso de la calse COMPARTOR(compareTo) esta por CORREO
		System.out.println("*******************");			//va eliminando segun el orden
		
		
		for (Usuarios usuarios : usuariosPrioritarios) {
			System.out.println(usuarios);
		}
		
		
		//-----------------
		while(!usuariosPrioritarios.isEmpty() /*|| usuariosPrioritarios == null*/ ){
			
			Thread.sleep(2000);
			
			System.out.println("Por atender: " + usuariosPrioritarios.peek());
			
			Thread.sleep(2000);
			
			System.out.println("Atendiendo: " + usuariosPrioritarios.poll());
			
			
		}
		
		
		
	}
}



