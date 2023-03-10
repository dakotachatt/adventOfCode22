package Dec3;

import java.util.*;
import java.io.*;

public class Dec3P1 {
    public static void main(String[] args) {

        try {
            File file = new File("./res/Dec3.txt");
            Scanner in = new Scanner(file);
            int commonSum = 0;

            while(in.hasNextLine()) {
                String sackContents = in.nextLine();
                String sackComp1 = sackContents.substring(0, sackContents.length() / 2);
                String sackComp2 = sackContents.substring(sackContents.length() / 2);
                char match = '\0';

                for(int i = 0; i < sackComp1.length(); i++) {
                    if(sackComp2.contains(Character.toString(sackComp1.charAt(i)))) {
                        match = sackComp1.charAt(i);
                    }
                }

                int matchNum = match;

                matchNum = (matchNum >= 97) ? (matchNum - 96) : (matchNum - 38);
                commonSum += matchNum;

                System.out.println(match + ": " + matchNum);
            }

            System.out.println(commonSum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
