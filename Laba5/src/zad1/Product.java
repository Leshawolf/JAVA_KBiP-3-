package zad1;

import java.util.HashMap;

public class Product {
    HashMap<String, String> Toys = new HashMap<String, String>();

    public void Add(String name, String type) {
        Toys.put(name, type);
    }

    public void GoThroughName() {
        System.out.print("�����:\t");
        for (String i : Toys.keySet()) {
            System.out.print(i + ' ');
        }
    }

    public void GoThroughType() {
        System.out.print("���:\t");
        for (String i : Toys.values()) {
            System.out.print(i + ' ');
        }
    } 

    public void GoThroughAll() {
        for (String i : Toys.keySet()) {
            System.out.println("���: " + i + "\t���: " + Toys.get(i));
        }
    }
}
