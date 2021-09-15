package ru.tpu.hiearhia;

public class Improved extends Appliances{
    private Appliances appliances;

    public Improved(Appliances appliances)
    {
        this.appliances = appliances;
        appliances.setCost(1000);
    }

    public Improved(Appliances appliances,int cost)
    {
        this.appliances = appliances;
        appliances.setCost(cost);
    }
    @Override
    public String getDescription() {
        return this.appliances.getDescription() + " Устройство модернезировано";
    }
}