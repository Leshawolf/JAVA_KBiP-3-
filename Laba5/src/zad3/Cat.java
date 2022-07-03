package zad3;


public class Cat extends Pet {
    String breed;

    public Cat(double weight, String name, String breed) {
        super(weight, name);
        this.breed = breed;
    }

    public void SaySmth()
    {
        System.out.println("Мяу");
    }

    public String toString() {return "Информация: \n"+"Имя " + name + "\nРост: " + weight + "\nПорода: " + breed + "\n======================\n";}
}
