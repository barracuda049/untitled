package ru.tpu;

import ru.tpu.hiearhia.*;

public class Lab5 {


    public static void main(String[] args) {
    Creator creator = new WashingCreator();
    Appliances appliances = creator.FactoryMethod(300,"Sony");
    System.out.println(appliances.getDescription());

    }
}