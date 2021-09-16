package ru.tpu.hiearhia.Sony;

import ru.tpu.hiearhia.Kettle;

public class SonyKet implements Kettle {

    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public String getType() {
        return "Kettle";
    }

    @Override
    public String getName() {
        return "Sony";
    }

    @Override
    public void getDisc() {
        System.out.println("Продукт - " + getType() + "; Модель - "+ getName() + "; Стоимость - " + getCost());
    }
}
