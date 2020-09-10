package com.curso.java.Clase07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import com.curso.java.entidades.Usuarios;

public class ColeccionDeque {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		
		ArrayDeque <Usuarios> usuariosPrioritarios=new ArrayDeque<Usuarios>();
		
		usuariosPrioritarios.add(	new Usuarios("user1", "1234"));
		usuariosPrioritarios.add(new Usuarios("user2", "1236")	);
		usuariosPrioritarios.add(	new Usuarios("user3", "1238"));
		usuariosPrioritarios.add(new Usuarios("user4", "1234")	);	
		usuariosPrioritarios.add(new Usuarios("user5", "1234")	);	
		
		while(!usuariosPrioritarios.isEmpty()) {
			
			Thread.sleep(2000);
			//FIFO
		/*	System.out.println("Por atender" +usuariosPrioritarios.peekFirst());
			
			Thread.sleep(2000);

			System.out.println("Atendiendo "+usuariosPrioritarios.pollFirst());
			*/
			
			//LIFO
			Thread.sleep(2000);
			
			System.out.println("Por atender" +usuariosPrioritarios.peekLast());
			
			Thread.sleep(2000);

			System.out.println("Atendiendo "+usuariosPrioritarios.pollLast());
			
			
		}
		
		
		
		
		
		
	}

}
