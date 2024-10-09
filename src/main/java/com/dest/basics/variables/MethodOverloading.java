package com.dest.basics.variables;
class Calculator1{
	int add(int a,int b) {
		return a+b;
		}
	int add(int a,int b,int c) {
		return a+b+c;
		}
	float add(float a,float b) {
		return a+b;
		}
	float add(float a,float b,float c) {
		return a+b+c;
		}
	double add(double a,double b) {
		return a+b;
		}
	double add(double a,double b,double c) {
		return a+b+c;
		}
	float add(int a,float b) {
		return a+b;
		}
	float add(float b,int a) {
		return a+b;
		}
	double add(int a,float b,double c) {
		return a+b+c;
		}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator1 c=new Calculator1();
      System.out.println(c.add(10, 10));
      System.out.println(c.add(10.7f, 10.9f));
      System.out.println(c.add(10, 25.5f, 13.5678));
	}

}
