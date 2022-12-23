package Dec3;

import java.io.File;
import java.util.Scanner;

public class Dec3P2 {
    public static void main(String[] args) {

        try {
            File file = new File("./res/Dec3.txt");
            Scanner in = new Scanner(file);
            int commonSum = 0;

            while(in.hasNextLine()) {
                String sack1Contents = in.nextLine();
                String sack2Contents = in.nextLine();
                String sack3Contents = in.nextLine();
                char match = '\0';

                for(int i = 0; i < sack1Contents.length(); i++) {
                    if(sack2Contents.contains(Character.toString(sack1Contents.charAt(i))) && sack3Contents.contains(Character.toString(sack1Contents.charAt(i)))) {
                        match = sack1Contents.charAt(i);
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
