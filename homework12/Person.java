package org.elsys.plane;

import java.util.Random;

public class Person {
	private String gender_;
	public Person(String gender){
		gender_ = " ";
	}
	public void get_gender(Person p){
		
		System.out.println(p.gender_);
	}
	
	public void set_gender(){
		Random randomGenerator = new Random();
		int num = randomGenerator.nextInt(2);
			if(num == 0){
				gender_ = "female";
			}else{
				gender_ = "male";
			}
		
	}

}