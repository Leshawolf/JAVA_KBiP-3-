package Laba_1;

public class Main {

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] vilka = new Object[5];
        int c=2;
        System.out.println("������: "+c);

        for (int i = 0; i < vilka.length; i++) {
            vilka[i] = new Object();
        }
        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = vilka[i];
            Object rightFork = vilka[(i + 1) % vilka.length];
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(c, rightFork, leftFork);
            }
            else {
                philosophers[i] = new Philosopher(c, leftFork, rightFork);
            }
            Thread t = new Thread(philosophers[i], "�������: " + (i + 1));
            t.start();
    }
}
}
