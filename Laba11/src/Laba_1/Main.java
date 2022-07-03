package Laba_1;
public class Main {
    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[philosophers.length];
        int c=1;
        System.out.println("Количество 'кругов' ужина: "+c);

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }
        for (int i = 0; i < philosophers.length; i++) {
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(c);
            }
            else {
                philosophers[i] = new Philosopher(c);
            }
            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
