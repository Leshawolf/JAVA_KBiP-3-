package Main;

public class main {

	public static void main(String[] args) 
	{
		System.out.print("Задание 1\n");
		int[] arr={1,2,3,8};
		int[] arr1= {1,2,10,20};
		Massiv c1=new Massiv(arr,arr1);
		for(int i=0;i<10;i++)
		{
			System.out.print("Рандомное число: "+c1.ZN()+"\n");
		}
		System.out.print("Рандомное число: "+c1.ZN());
		System.out.print("\nЗадание 2\nПервый Человек:\n");
		Person m=new Person();
		m.setName("NoName");
		m.setSurname("NoName");
		m.setAge(99);
		m.setWork_Experience(15);
		m.Age1();
		m.displayInfo();
		System.out.print("\n----------------------------------------------------\n");
		m.Add_work_day_experience();
		
		m.Delete_work_day_experience();
		m.displayInfo();
		System.out.print("\n----------------------------------------------------\n");
		System.out.print("Второй Человек:\n");
		Person m1=new Person();
		m1.setName("Igor");
		m1.setSurname("Permenskiy");
		m1.setAge(18);
		m1.setWork_Experience(300);
		m1.displayInfo();
		m1.Age1();
		System.out.print("\n----------------------------------------------------\n");
		m1.Add_work_day_experience();
		
		//m1.Delete_work_day_experience();
		m1.displayInfo();
		System.out.print("\n----------------------------------------------------\n");
		
	}

}
