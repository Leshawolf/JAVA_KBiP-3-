package Laba4_2;

public class Director extends Employee{

	public Director(String name, double money) {
		super(name, money);
	}

	@Override
	public void display() {
		System.out.println("Директор " + super.name + " заработал: " + super.money);
	}

	@Override
	public void srednInMonth() {		
		System.out.println("Директор зарабатывает за месяц:  " + super.money);
	}

}
