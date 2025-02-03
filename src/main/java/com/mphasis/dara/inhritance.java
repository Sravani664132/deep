package com.mphasis.dara;

 class parent {
	 double a,b;
	 parent(){}
	 parent(double a,double b) {
		 this.a=a;
		 this.b=b;
		 }
	 }
 class child extends parent{
	 child(){
		 super(2.1,5.6);
	 }
	 double area() {
		 return a*b;
	 }
 }
 public class inhritance {
	 public static void main(String args[]) {
		 child c1=new child();
		 System.out.println(c1.area());
	 }
 }
	


