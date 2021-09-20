package ru.tpu;

public class Storage{
    public static int amountProduct;
    public static int maxProduct=50;

    public Storage()
    {
        Thread t1 = new Thread(new Getter());
        Thread t2 = new Thread(new Giver());
        t1.start();
        try {
            t1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {

            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static synchronized void Getter()
    {
        amountProduct++;
    }

    public static synchronized void Giver()
    {
        amountProduct--;
    }

}
