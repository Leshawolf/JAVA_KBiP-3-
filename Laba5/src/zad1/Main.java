package zad1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.Add("���������", "�����");
        p1.Add("����", "�������");
        p1.Add("���", "������");
        p1.Add("���", "�����");
        p1.GoThroughName();
        System.out.println();
        p1.GoThroughType();
        System.out.println();
        p1.GoThroughAll();
    }
}
