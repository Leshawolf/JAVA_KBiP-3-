package zad3;


public class Parrot extends Pet {
    String breed;

    public Parrot(double weight, String name, String breed) {
        super(weight, name);
        this.breed = breed;
    }

    public void SaySmth() {
        System.out.println("�������");
    }
    public String toString() {return "����������: \n"+"��� " + name + "\n����: " + weight + "\n������: " + breed + "\n======================\n";}
    
}

