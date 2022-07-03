package zad3;
public class Dog extends Pet{
    String breed;
    public Dog(double weight, String name, String breed) {
        super(weight, name);
        this.breed = breed;
    }
    public void SaySmth(){
        System.out.println("Гав");
    }

    public String toString() {return "Информация: \n"+"Имя " + name + "\nРост: " + weight + "\nПорода: " + breed + "\n======================\n";}
}
