package Laba4_2;

public abstract class Employee {
	public String name;
	public double money;
	Employee(String name, double money){
		this.name = name;
		this.money = money;
	}
	public String getName(){ 
		return name; 
	}
	public abstract void display();
	public abstract void srednInMonth();
}
