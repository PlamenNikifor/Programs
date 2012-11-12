package org.elsys.plane;

import java.util.List;

import java.util.LinkedList;


public class Plane {
	List<Person> passengers;
	private static int capacity_;
	private static int size_;
	public Plane(int capacity){
		capacity_=capacity;
		size_=capacity;
		passengers = new LinkedList<Person>();
	}
	
	public void add(Person p){
		if (capacity_==0){
			System.out.println("The plane is full!");
		}else{
			passengers.add(p);
			capacity_--;
		}
	}
	
	public void remove(Person p) {
		if(capacity_ == size_){
			System.out.println("The plane is empty!");
		}else{
			passengers.remove(p);
			capacity_++;
		}
	}
	
	public void clear() {
		passengers.clear();
		capacity_=size_;
	}
	
	public void getCapacity() {
		System.out.println(Plane.capacity_);
	}
	
	public int getMales() {
		int counter = 1;
		int value = 0;
		while(counter <= passengers.size()){
			if("male"== Person.get_gender(p) ){
				value+=1;
			}
			counter++;
		}
		return value;
	}
	
	public int getFemales() {
		int counter = 1;
		int value = 0;
		while(counter <= passengers.size()){
			if("female"== Person.get_gender(p) ){
				value+=1;
			}
			counter++;
		}
		return value;
	}
	
}
