package ru.tpu.hiearhia;

public class Appliances
{
            private int cost;
            private String type;
            private String hero;

            public int getCost() {
                return cost;
            }
            public void setCost(int cost)
            {
                if (cost <=0){
                    System.out.println("Цена отрицательна");
        }
        else {
            this.cost = cost;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }
    Appliances()
    {
        this.cost=1;
        this.type="";
        this.hero="";
    }

    Appliances(int cost,String type, String hero)
    {
        setCost(cost);
        this.hero=hero;
        this.type=type;
    }
    public String getDescription(){
        return "Фирма: " + type + "; Тип бытовой техники: " +hero+"; Стоимость: "+cost+";";
    }
}
