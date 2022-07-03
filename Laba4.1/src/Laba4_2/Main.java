package Laba4_2;

public class Main {

	public static void main(String[] args) {		
		Director object = new Director(" Arkadiy", 93);
		Developer object2 = new Developer(" Inokentiy", 200.12);
		object.display();
		object2.display();
		object.srednInMonth();
		object2.srednInMonth();
		Director[] array = new Director[8];
		for (int i = 0;i < array.length;i++){
			array[i] = new Director("Имя"+i, i);
		}
		 for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array.length-1; j++) {
		      if (array[j].money < array[j + 1].money) {
		        Director b = new Director(array[j].name, array[j].money); 
		        array[j] = array[j + 1];
		        array[j + 1] = new Director(b.name, b.money);
		      }
		    }
		  }
		 System.out.println("Первые 5: ");
			 for (int i = 0; i < 5; i++) {
				 String s = array[i].name +"("+array[i].money+") index = " + i;
				  System.out.println(s);

			 }
		 System.out.println("Последние 3: ");
		 for (int i = array.length-1; i > array.length-4; i--) {
			 System.out.println(array[i].name +"("+array[i].money+") index = " + i);
		 }
		 
	}
}

