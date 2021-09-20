package ru.tpu;

public class Getter implements Runnable{
    @Override
    public void run() {
        while(Storage.amountProduct<51) {
            System.out.println("Getter - "+ Storage.amountProduct);
            Storage.Getter();
        }
    }
}
