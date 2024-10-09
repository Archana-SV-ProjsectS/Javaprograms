package com.dest.basics.Constructors;
class Dog {
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;
	public Dog() {
		super();
		System.out.println("showing values after executing zero parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	
	public Dog(String name) {
		this("Tommy",5);
		this.name=name;
		System.out.println("showing values after executing 1 parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	
	public Dog(String name,int age) {
		this("Rocky",5,"white");
		this.name=name;
		this.age=age;
		System.out.println("showing values after executing 2 parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	
	public Dog(String name,int age,String color) {
		this("Browny",5,"brown",7000);
		this.name=name;
		this.age=age;
		this.color=color;
		System.out.println("showing values after executing 3 parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	
	public Dog(String name,int age,String color,int cost) {
		this("Blacky",3,"black",7000,"GS");
		this.name=name;
		this.age=age;
		this.color=color;
		this.cost=cost;
		System.out.println("showing values after executing 4 parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
	public Dog(String name,int age,String color,int cost,String breed) {
		this();
		this.name=name;
		this.age=age;
		this.color=color;
		this.cost=cost;
		this.breed=breed;
		System.out.println("showing values after executing 5 parameterised constructors");
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}

	public String getBreed() {
		return breed;
	}
	
    	
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog d=new Dog("Lucky");
         System.out.println(d.getName());
         System.out.println(d.getAge());
         System.out.println(d.getColor());
         System.out.println(d.getCost());
         System.out.println(d.getBreed());
	}

}
