package Dec1;

import java.io.File;
import java.util.*;

public class Dec1P2 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> elves = new ArrayList<>();
            File file = new File("./res/Dec1.txt");
            Scanner in = new Scanner(file);

            int currCalSum = 0;

            while(in.hasNextLine()) {
                String currCal = in.nextLine();

                if(currCal.equals("") || !in.hasNextLine()) {
                    //Catches the final line in the file (no empty line after, just EOF)
                    if(!in.hasNextLine()) {
                        currCalSum += Integer.parseInt(currCal);
                    }

                    elves.add(currCalSum);
                    currCalSum = 0;
                } else {
                    currCalSum += Integer.parseInt(currCal);
                }
            }

            Collections.sort(elves, Collections.reverseOrder());
            System.out.println(elves.get(0) + " " + elves.get(1) + " " + elves.get(2));
            System.out.println((elves.get(0) + elves.get(1) + elves.get(2)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}