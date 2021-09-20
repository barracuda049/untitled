package ru.tpu;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab4 {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[0-9]+");
        Matcher matcher1;
        Pattern pattern2 = Pattern.compile("[*/+-]+");
        Matcher matcher2;

        int[] num = new int[2];
        int n;
        int result;
        try {
            File file = new File("C:/Users/barracuda049/Desktop/Lab4.txt");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line= reader.readLine()) != null) {
                System.out.println(line);
                matcher1 = pattern1.matcher(line);
                matcher2 = pattern2.matcher(line);
                n=0;
                result=0;
                while (matcher1.find())
                {
                      num[n] = Integer.parseInt(matcher1.group());
                      n++;
                }

                while (matcher2.find())
                {
                    if (matcher2.group().equals("+"))
                    {
                        result = num[0]+num[1];
                    }
                    else if (matcher2.group().equals("-"))
                    {
                        result = num[0]-num[1];
                    }
                    else if (matcher2.group().equals("/"))
                    {
                        result = num[0]/num[1];
                    }
                    else if (matcher2.group().equals("*"))
                    {
                        result = num[0]*num[1];
                    }
                }
                System.out.println(result);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
