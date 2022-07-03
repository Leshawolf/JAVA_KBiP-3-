package zad3;

import java.util.HashMap;

public class Pet 
{


    HashMap<Double,String> Pets = new HashMap<>();
    
    double weight;
    String name;
    boolean grafts;
    
    public Pet(double weight, String name)
    {
        this.weight=weight;
        this.name=name;
    }

    @Override
    public String toString(){
        return "Вес: "+weight+"\nЦвет: "+name+"\nПривычка: "+grafts+'\n';
    }

}
