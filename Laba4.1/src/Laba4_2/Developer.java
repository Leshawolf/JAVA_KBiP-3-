package Laba4_2;
public class Developer extends Employee{

	public Developer(String name, double money) {
		super(name, money);
	}

	@Override
	public void display() {
		System.out.println("�����������" + super.name + "\n���������� �����(�� ���) = " + super.money);
		
	}

	@Override
	public void srednInMonth() {
		System.out.println("����������� ������������ �� ����� (������ �� ����� ������) = " + 20.8*8*super.money);
	}

}
