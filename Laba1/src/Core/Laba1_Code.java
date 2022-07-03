package Core;

import java.util.Scanner;
import java.util.Random;

public class Laba1_Code
{
	public static void main(String[] args) 
	{
		System.out.println("\t���� �1");
		zadanie1 obj1=new zadanie1();
		obj1.zad1();
		
		System.out.println("\t������� �2");
		zadanie2 obj2=new zadanie2();
		obj2.zad2();
		
		System.out.println("\t������� �3");
		zadanie3 obj3=new zadanie3();
		obj3.zad3();
		
		System.out.println("\t������� �4");
		zadanie4 obj4=new zadanie4();
		obj4.zad4();
		
		System.out.println("\t������� �5");
		zadanie5 obj5=new zadanie5();
		obj5.zad5();
	}

}
class zadanie1
{
	public void zad1() 
	{
		System.out.print("������� �1\n�����:");
		double x=(4/2)+Math.pow(3, 2);
		System.out.print(x);
	}
}
class zadanie2
{
	public void zad2()
	{
		System.out.print("������� N2\n��� ������:");
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

		System.out.print("\n���������� ����� �� �������:"+point+"\n");
	}
}
class zadanie3
{
	public void zad3()
	{
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("������ ������: ");
        int first = scanner.nextInt();
        System.out.print("��������� ������: ");
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
        System.out.print("�������� � ��������� : ");
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
        System.out.println("�����: " + summ);
	}
}
class zadanie4
{
		public void zad4() 
		{
			Scanner in = new Scanner(System.in);
			int num;
			int n;
			System.out.print("������� ����� num: ");
			num=in.nextInt();
			System.out.print("������� ����� n: ");
			n=in.nextInt();
			if(num%n==0) {
				System.out.println("�������");			
			}
			else 
			{
				System.out.println("�� �������");
			}
			System.out.print("������� ����� num: ");
			num=in.nextInt();
			switch (num) 
			{
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				System.out.println("���");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("����");
				break;
			case 6:
				System.out.println("�����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("������");
				break;
			case 9:
				System.out.println("������");
				break;
			}
			
			System.out.print("������� ���� ������: ");
			num=in.nextInt();
			switch (num) 
			{
			case 1:
				System.out.println("�����������");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("�����");
				break;
			case 4:
				System.out.println("�������");
				break;
			case 5:
				System.out.println("�������");
				break;
			case 6:
				System.out.println("�������");
				break;
			case 7:
				System.out.println("�����������");
				break;
			}
			
			System.out.print("������� �������: ");
			String stl;
			stl=in.next();
			switch (stl) 
			{
			case "�����":
				System.out.println("��������");
				break;
			case "������":
				System.out.println("������");
				break;
			case "����":
				System.out.println("�������");
				break;
			case "������":
				System.out.println("�������");
				break;
			case "�����":
				System.out.println("������");
				break;
			}
			
			System.out.print("������� n: ");
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
			System.out.println("����� �������� �������� = "+summa);
			
			
			System.out.print("������� n: ");
			num=in.nextInt();
			int proizv=1;
			for (int i = 1; i < num; i++) 
			{
				if(i%2==0) {
					proizv*=i;
				}
			}
			System.out.println("������������ ������ �������� = "+proizv);
			
			double rost;
			double ves;
			System.out.print("������� ����: ");
			rost=in.nextInt();
			System.out.print("������� ���: ");
			ves=in.nextInt();
			if(ves/Math.pow(rost/100, 2)<18.5) 
			{
				System.out.println("����� �����������");
			}
			else if(ves/Math.pow(rost/100, 2)>30) 
			{
				System.out.println("����� ��������");
			}
			else
			{
				System.out.println("��� � �����");
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

