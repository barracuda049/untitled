package ru.tpu;

import ru.tpu.hiearhia.AppliancesFactory;
import ru.tpu.hiearhia.Kettle;
import ru.tpu.hiearhia.Sony.SonyAppliancesFactory;
import ru.tpu.hiearhia.Sony.SonyKet;
import ru.tpu.hiearhia.Vacuum;
import ru.tpu.hiearhia.Washing;

public class Lab6 {

    public static void main(String[] args) {
        AppliancesFactory sonyFactory = new SonyAppliancesFactory();

        Kettle kettle = sonyFactory.addKet();
        Vacuum vacuum = sonyFactory.addVac();
        Washing washing = sonyFactory.addWash();

        kettle.getDisc();
        vacuum.getDisc();
        washing.getDisc();

    }
}