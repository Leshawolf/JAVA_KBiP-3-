package Core;

import java.util.Scanner;
import java.util.Random;

public class Laba1_Code
{
	public static void main(String[] args) 
	{
		System.out.println("\tЛаба №1");
		zadanie1 obj1=new zadanie1();
		obj1.zad1();
		
		System.out.println("\tЗадание №2");
		zadanie2 obj2=new zadanie2();
		obj2.zad2();
		
		System.out.println("\tЗадание №3");
		zadanie3 obj3=new zadanie3();
		obj3.zad3();
		
		System.out.println("\tЗадание №4");
		zadanie4 obj4=new zadanie4();
		obj4.zad4();
		
		System.out.println("\tЗадание №5");
		zadanie5 obj5=new zadanie5();
		obj5.zad5();
	}

}
class zadanie1
{
	public void zad1() 
	{
		System.out.print("Задание №1\nОтвет:");
		double x=(4/2)+Math.pow(3, 2);
		System.out.print(x);
	}
}
class zadanie2
{
	public void zad2()
	{
		System.out.print("Задание N2\nВаш массив:");
		int size=4;
		double[] arMy=new double[size];
		for(int i=0;i<arMy.length;i++)
		{
			arMy[i]=2+Math.random()*10;
		}
		for(int i=0;i<arMy.length;i++)
		{
			System.out.print(arMy[i]+" , ");
		}
		int point=0;
		for(int i=0;i<arMy.length;i++)
		{
			if(i%2==0)
			{
				if(arMy[i]%2==0)
				{
					point++;
				}
			}
		}

		System.out.print("\nКоличество чисел по заданию:"+point+"\n");
	}
}
class zadanie3
{
	public void zad3()
	{
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Первый индекс: ");
        int first = scanner.nextInt();
        System.out.print("Последний индекс: ");
        int second = scanner.nextInt();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int index = 0;
        int summ = 0;
        System.out.println();
        System.out.print("Элементы в диапазоне : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (index >= first &&  index < second) {
                    summ += matrix[i][j];
                    System.out.print(matrix[i][j] + " ");
                }
                index++;
            }
        }
        System.out.println();
        System.out.println("сумма: " + summ);
	}
}
class zadanie4
{
		public void zad4() 
		{
			Scanner in = new Scanner(System.in);
			int num;
			int n;
			System.out.print("Введите число num: ");
			num=in.nextInt();
			System.out.print("Введите число n: ");
			n=in.nextInt();
			if(num%n==0) {
				System.out.println("Делится");			
			}
			else 
			{
				System.out.println("Не делится");
			}
			System.out.print("Введите число num: ");
			num=in.nextInt();
			switch (num) 
			{
			case 1:
				System.out.println("один");
				break;
			case 2:
				System.out.println("два");
				break;
			case 3:
				System.out.println("три");
				break;
			case 4:
				System.out.println("четыре");
				break;
			case 5:
				System.out.println("пять");
				break;
			case 6:
				System.out.println("шесть");
				break;
			case 7:
				System.out.println("семь");
				break;
			case 8:
				System.out.println("восемь");
				break;
			case 9:
				System.out.println("девять");
				break;
			}
			
			System.out.print("Введите день недели: ");
			num=in.nextInt();
			switch (num) 
			{
			case 1:
				System.out.println("понедельник");
				break;
			case 2:
				System.out.println("вторник");
				break;
			case 3:
				System.out.println("среда");
				break;
			case 4:
				System.out.println("четверг");
				break;
			case 5:
				System.out.println("пятница");
				break;
			case 6:
				System.out.println("суббота");
				break;
			case 7:
				System.out.println("воскресенье");
				break;
			}
			
			System.out.print("Введите столицу: ");
			String stl;
			stl=in.next();
			switch (stl) 
			{
			case "Минск":
				System.out.println("Беларусь");
				break;
			case "Москва":
				System.out.println("Россия");
				break;
			case "Киев":
				System.out.println("Украина");
				break;
			case "Ереван":
				System.out.println("Армения");
				break;
			case "Токио":
				System.out.println("Япония");
				break;
			}
			
			System.out.print("Введите n: ");
			num=in.nextInt();
			int summa=0;
			int k=1;
			while(k<n) {
				if(k%2==1) 
				{
					summa+=k;
				}
				k++;
			}
			System.out.println("Сумма нечётных значений = "+summa);
			
			
			System.out.print("Введите n: ");
			num=in.nextInt();
			int proizv=1;
			for (int i = 1; i < num; i++) 
			{
				if(i%2==0) {
					proizv*=i;
				}
			}
			System.out.println("Произведение чётных значений = "+proizv);
			
			double rost;
			double ves;
			System.out.print("Введите рост: ");
			rost=in.nextInt();
			System.out.print("Введите вес: ");
			ves=in.nextInt();
			if(ves/Math.pow(rost/100, 2)<18.5) 
			{
				System.out.println("Нужно поправиться");
			}
			else if(ves/Math.pow(rost/100, 2)>30) 
			{
				System.out.println("Нужно похудеть");
			}
			else
			{
				System.out.println("Вес в норме");
			}
		}
	
}
class zadanie5
{
	public void zad5()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.print(i+"    ");
		}
	}
}

