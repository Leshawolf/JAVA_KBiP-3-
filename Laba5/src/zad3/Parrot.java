package zad3;


public class Parrot extends Pet {
    String breed;

    public Parrot(double weight, String name, String breed) {
        super(weight, name);
        this.breed = breed;
    }

    public void SaySmth() {
        System.out.println("Кукарек");
    }
    public String toString() {return "Информация: \n"+"Имя " + name + "\nРост: " + weight + "\nПорода: " + breed + "\n======================\n";}
    
}

