package Task1;

public class Person_Task5_5 {
	String name;
	int age;
	public Person_Task5_5(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString()
	{
		String a="���: "+name+"\t �������: "+age;
		return a;
	}
	public static void main(String[] args) 
	{
	Person_Task5_5 p=new Person_Task5_5("�����",23);
	System.out.println(p.toString());
	}	
}
