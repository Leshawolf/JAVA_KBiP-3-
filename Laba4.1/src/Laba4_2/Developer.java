package Laba4_2;
public class Developer extends Employee{

	public Developer(String name, double money) {
		super(name, money);
	}

	@Override
	public void display() {
		System.out.println("Разработчик" + super.name + "\nКоличество денег(за час) = " + super.money);
		
	}

	@Override
	public void srednInMonth() {
		System.out.println("Разработчик зарабатывает за месяц (оплата за месяц месяцу) = " + 20.8*8*super.money);
	}

}
