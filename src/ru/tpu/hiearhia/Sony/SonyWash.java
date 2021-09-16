package ru.tpu.hiearhia.Sony;

import ru.tpu.hiearhia.Washing;

public class SonyWash implements Washing {
    @Override
    public int getCost() {
        return 350;
    }

    @Override
    public String getName() {
        return "Sony";
    }

    @Override
    public String getType() {
        return "Washing";
    }
    @Override
    public void getDisc() {
        System.out.println("Продукт - " + getType() + "; Модель - "+ getName() + "; Стоимость - " + getCost());
    }
}
