package zad3;


public class Cat extends Pet {
    String breed;

    public Cat(double weight, String name, String breed) {
        super(weight, name);
        this.breed = breed;
    }

    public void SaySmth()
    {
        System.out.println("���");
    }

    public String toString() {return "����������: \n"+"��� " + name + "\n����: " + weight + "\n������: " + breed + "\n======================\n";}
}
