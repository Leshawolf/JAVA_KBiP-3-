package zad3;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void Keyses(HashMap<String, Pet> pets) {
        Set<String> type = pets.keySet();
        for (String types : type) {
            System.out.println(types);
        }
    }
    public static <K,V> void values(HashMap<K,V> map)
    {
    	for(V key : map.values()) {
    		System.out.println(key);
    	}
    }
    public static void main(String[] args) {
        HashMap<String, Pet> pets = new HashMap<>();
        pets.put("Коричневый", new Cat(6.3, "Вили", "Британце"));
        pets.toString();
        pets.put("Жёлтый", new Dog(4.3, "Ник", "Немецкая"));
        pets.toString();
        pets.put("Розовый", new Dog(7.1, "Граф","Терьер"));
        pets.toString();
        pets.put("Коричнеый", new Parrot(6.4, "Макс","Аро"));
        values(pets);
    }
}
