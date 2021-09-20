package ru.tpu;
import ru.tpu.hiearhia.Room;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class lab7 {

    public static void main(String[] args)
    {
        Room[] firstFloor = new Room[3];
        for (int i = 0; i < firstFloor.length; i++)
        {
            switch((int)Math.round(Math.random()))
            {
                case 0: firstFloor[i] = new Room(1,"Учебная комната",25);
                    break;
                case 1: firstFloor[i] = new Room(1,"Жилая комната",48);
                    break;
            }
        }

        ArrayList<Room> secondFloor = new ArrayList();
        for(int i = 0; i<6;i++)
        {
            switch((int)Math.round(Math.random()))
            {
                case 0: secondFloor.add(new Room(2,"Учебная комната",25));
                    break;
                case 1: secondFloor.add(new Room(2,"Жилая комната",48));
                    break;
            }
        }

        ArrayList<Room> thirdFloor = new ArrayList();
        for(int i = 0; i<4;i++)
        {
            switch((int)Math.round(Math.random()))
            {
                case 0: thirdFloor.add(new Room(3,"Учебная комната",25));
                    break;
                case 1: thirdFloor.add(new Room(3,"Жилая комната",48));
                    break;
            }
        }

        int fullSum=0;
        int[] sumFloor = new int[]{0,0,0};
        int[] sumFloorTypeLiv = new int[]{0,0,0};
        int[] sumFloorTypeSt = new int[]{0,0,0};
        int fullSumTypeLive=0;
        int fullSumTypeSt=0;


        for (Iterator<Room> iterator = Arrays.stream(firstFloor).iterator();iterator.hasNext();)
        {
            sumFloor[0] += iterator.next().getSquare();
            if(iterator.next().getType().equalsIgnoreCase("Жилая комната"))
            {
                sumFloorTypeLiv[0] += iterator.next().getSquare();
            }
            else
            {
                sumFloorTypeSt[0] += iterator.next().getSquare();
            }
        }

        for (Iterator iterator = secondFloor.iterator();iterator.hasNext();)
        {
            sumFloor[1] += ((Room)(iterator.next())).getSquare();

            if(((Room)iterator.next()).getType().equalsIgnoreCase("Жилая комната"))
            {
                sumFloorTypeLiv[1] += ((Room)iterator.next()).getSquare();
            }
            else
            {
                sumFloorTypeSt[1] += ((Room)iterator.next()).getSquare();
            }
        }
        for (Iterator iterator = thirdFloor.iterator();iterator.hasNext();)
        {
            sumFloor[2] += ((Room)(iterator.next())).getSquare();

            if(((Room)iterator.next()).getType().equalsIgnoreCase("Жилая комната"))
            {
                sumFloorTypeLiv[2] += ((Room)iterator.next()).getSquare();
            }
            else
            {
                sumFloorTypeSt[2] += ((Room)iterator.next()).getSquare();
            }


        }
        for(int i=0;i<3;i++)
        {
            fullSum+= sumFloor[i];
            fullSumTypeLive+= sumFloorTypeLiv[i];
            fullSumTypeSt+= sumFloorTypeSt[i];
        }
    }
}