package com.mphasis.dara;

public class inherit {
	String name;
	public void eat() {
		System.out.println("Animal is etaing");
		
	}

}
class Dog extends inherit{
	String breed;
	public void bark() {
		System.out.println("Dog is barking");
	}
}
