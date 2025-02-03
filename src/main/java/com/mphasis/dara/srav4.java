package com.mphasis.dara;

interface employee{
	void salary();
}
class emp1 implements employee{
	float sal;
	String name;
	emp1(String name,float sal){
		this.name=name;
		this.sal=sal;
	}
	public void salary() {
		System.out.println("The salary of "+name+" is "+sal);
	}
}
class emp2 implements employee{
	float sal;
	String name;
	emp2(String name, float sal){
		this.name=name;
		this.sal=sal;
	}
	public void salary() {
		System.out.println("The salary of "+name+" is "+sal);
		
	}
}
public class srav4{
	public static void main(String[] args) {
		employee e=new emp1("Jaya",9000);
		e.salary();
		e=new emp2("kil",8000);
		e.salary();
	}
}
