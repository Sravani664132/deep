package com.mphasis.dara;

interface Sports {
	void play();
}
class Football implements Sports{
	public void play() {
		System.out.println("This is football class...");
	}
	
}class Basketball implements Sports{
	public void play() {
		System.out.println("This is basketall class...");
	}
	
}
class Rubgy implements Sports{
	public void play() {
		System.out.println("This is rugby class...");
	}
	
}
public class srav2{
	public static void main(String[] args) {
		Sports f=new Football();
		f.play();
		f=new Basketball();
		f.play();
		f=new Rubgy();
		f.play();
	}
}


