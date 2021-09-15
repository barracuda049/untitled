package ru.tpu.hiearhia;

public class Washing extends Appliances{
    private int drumCapacity;

    public int getDrumCapacity() {
        return drumCapacity;
    }

    public void setDrumCapacity(int drumCapacity) {
        this.drumCapacity = drumCapacity;
    }

    public Washing(int cost, String type) {

        super(cost,type, "Стиральная машинка");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Объем барабана: " + drumCapacity+ ";";
    }
}