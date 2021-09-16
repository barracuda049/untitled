package ru.tpu.hiearhia.Sony;

import ru.tpu.hiearhia.Vacuum;

public class SonyVac implements Vacuum {
    @Override
    public String getType() {
        return "Vacuum";
    }

    @Override
    public String getName() {
        return "Sony";
    }

    @Override
    public int getCost() {
        return 600;
    }
    @Override
    public void getDisc() {
        System.out.println("Продукт - " + getType() + "; Модель - "+ getName() + "; Стоимость - " + getCost());
    }
}
