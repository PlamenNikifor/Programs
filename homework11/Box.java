package org.elsys.hw1;

import java.util.LinkedList;
import java.util.List;

public class Box {
	List<Ball> contents;
	private int capacity = 0;
	private int size = 10;
	public Box(){
		contents = new LinkedList<Ball>();
		
	}
	public void add(Ball b1){
		
		if(capacity >= size){
			
			System.out.println("The box is full motherfucker");
		}else{
			
			contents.add(b1);
			capacity++;
		}
		
	}
	public void remove(Ball b1){
		
		if(capacity <= 0){
			
			System.out.println("The box is empty motherfucker");
		}else{
			
			contents.remove(b1);
			capacity--;
		}
	}
	public int capacity(){
		
		return capacity;
	}
	public int size(){
		
		return size;
	}
	public void clear(){
		
		contents.clear();
		size = 0;
		capacity = 0;
	}
	public boolean contains(Ball b1){
		
		return contents.contains(b1);
	}
}
