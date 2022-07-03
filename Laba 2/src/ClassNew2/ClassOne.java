package ClassNew2;

public class ClassOne 
{
	public static void main(String[]args)
	{
		Class1 m1 = new Class1();
		m1.setLenght(100);
		m1.setSquare(12);
		m1.setWidth(432);
		System.out.println("Lenght1 : "+m1.getLenght());
		System.out.println("Square1: "+m1.getSquare());
		System.out.println("Width1: "+m1.getWidth()+"\n");
		
		Class2 m2 = new Class2();
		m1.setLenght(12);
		m1.setSquare(112);
		m1.setWidth(42);
		System.out.println("Lenght2 : "+m1.getLenght());
		System.out.println("Square2: "+m1.getSquare());
		System.out.println("Width2: "+m1.getWidth()+"\n");
		
		Class3 m3 = new Class3();
		m1.setLenght(10);
		m1.setSquare(123);
		m1.setWidth(43);
		System.out.println("Lenght4: "+m1.getLenght());
		System.out.println("Square4: "+m1.getSquare());
		System.out.println("Width4: "+m1.getWidth());
	}
}

