package ru.tpu.hiearhia;

public class VacuumCreator extends Creator {
    @Override
    public Appliances FactoryMethod(int cost, String type) {

        return new Vacuum(cost, type);
    }
}
