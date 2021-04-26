package ru.tpu;

import ru.tpu.hiearhia.Appliances;
import ru.tpu.hiearhia.Vacuum;
import ru.tpu.hiearhia.Washing;

public class Lab1 {

    public static void main(String[] args) {
        Appliances one;
        one = new Washing(500,"Sony");
        System.out.println(one.getDescription());
        Appliances two;
        two = new Vacuum(1000, "SVEN");
        System.out.println(two.getDescription());
    }
}