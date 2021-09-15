package ru.tpu.hiearhia;

public class WashingCreator extends Creator {
    @Override
    public Appliances FactoryMethod(int cost, String type) {

        return new Washing(cost, type);
    }
}
