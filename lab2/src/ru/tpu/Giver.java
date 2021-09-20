package ru.tpu;

public class Giver implements Runnable{
    @Override
    public void run() {
        while(Storage.amountProduct>=0) {
            System.out.println("Giver - "+ Storage.amountProduct);
            Storage.Giver();

        }
    }
}
