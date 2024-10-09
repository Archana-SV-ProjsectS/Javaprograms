package com.dest.basics.variables;
class Sample{
	int a,b,c;
	static int p,q,r;
	static {
		p=10;
		q=20;
		r=30;
		
	}
	{
		a=100;
		b=200;
		c=150;
	}
	static void displayStatic(){
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class StaticSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sample.displayStatic();
	}

}
