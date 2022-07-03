package Main;

public class Person 
{
	private String Name;
	private String Surname;
	private int age;
	private int Work_Experience;
	
	public Person() {}
	
	public Person(String name, String surname, int age, int work_Experience) {
		Name = name;
		Surname = surname;
		this.age = age;
		Work_Experience = work_Experience;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWork_Experience() {
		return Work_Experience;
	}
	public void setWork_Experience(int work_Experience) {
		Work_Experience = work_Experience;
	}
	public void displayInfo()
	{
		System.out.print("���: "+Name+"\n�������: "+Surname+"\n�������: "+age+"\n������� ����(� ����): "+Work_Experience);
	}
	public void Add_work_day_experience()
	{
		Work_Experience++;
		System.out.print("������ "+Name+" ���������: "+Work_Experience+" ����.\n");
	}
	public void Delete_work_day_experience()
	{
		Work_Experience--;
		System.out.print("������ "+Name+" ���������: "+Work_Experience+" ����.\n");		
	}
	public void Age1()
	{
		System.out.print("\n��� ��������:"+(2021-age));
	}
}
