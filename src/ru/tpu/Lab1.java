package ru.tpu;

import ru.tpu.hiearhia.*;

import java.util.ArrayList;

public class Lab1 {

    public static void main(String[] args) {

        ArrayList<Appliances> array = new ArrayList();

        for (int i=0; i<10; i++)
        {
            switch((int)Math.round(Math.random()))
            {

                case 0: array.add(new Washing((int)(Math.random()*1000),"Sony"));
                break;
                case 1: array.add(new Vacuum((int)(Math.random()*1000),"Bosh"));
                break;
            }
            switch((int)Math.round(Math.random()))
            {

                case 0: array.set(i, new Improved(array.get(i)));
                break;
                case 1: array.set(i, new Fault(array.get(i)));
                break;
            }
            System.out.println(array.get(i).getDescription());
        }
    }
}