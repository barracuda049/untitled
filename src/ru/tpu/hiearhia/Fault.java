package ru.tpu.hiearhia;

public class Fault extends Appliances {
    private Appliances appliances;

    public Fault(Appliances appliances)
    {
        this.appliances = appliances;
        appliances.setCost(1);
    }
     public Fault (Appliances appliances, int cost)
     {
         this.appliances = appliances;
         appliances.setCost(cost);
     }
  @Override
    public String getDescription() {
        return this.appliances.getDescription() + " Устройство неисправно";
    }
}

