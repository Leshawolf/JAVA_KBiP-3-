package zad1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.Add("Тамагочик", "Робот");
        p1.Add("Миша", "Медведь");
        p1.Add("Ник", "Собака");
        p1.Add("Дум", "Акула");
        p1.GoThroughName();
        System.out.println();
        p1.GoThroughType();
        System.out.println();
        p1.GoThroughAll();
    }
}
