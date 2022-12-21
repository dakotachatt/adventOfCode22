package Dec1;

import java.util.*;
import java.io.*;

public class Dec1P1 {
    public static void main(String[] args) {
        try {
            File file = new File("./res/Dec1.txt");
            Scanner in = new Scanner(file);

            int maxCalSum = 0;
            int currCalSum = 0;

            while(in.hasNextLine()) {
                String currCal = in.nextLine();

                if(currCal.equals("") || !in.hasNextLine()) {
                    if(!in.hasNextLine()) {
                        currCalSum += Integer.parseInt(currCal);
                    }

                    if(currCalSum > maxCalSum) {
                        maxCalSum = currCalSum;
                    }
                    System.out.println(currCalSum);
                    currCalSum = 0;
                } else {
                    currCalSum += Integer.parseInt(currCal);
                }
            }

            System.out.println(maxCalSum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}