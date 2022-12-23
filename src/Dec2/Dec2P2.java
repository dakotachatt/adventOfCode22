package Dec2;

import java.io.File;
import java.util.Scanner;

public class Dec2P2 {

    public static void main(String[] args) {

        char[] rpsOpponent = {'A', 'B', 'C'};
        char[] win = {'Y', 'Z', 'X'};
        char[] draw = {'X', 'Y', 'Z'};
        char[] lose = {'Z', 'X', 'Y'};
        int totalPoints = 0;

        try {
            File file = new File("./res/Dec2.txt");
            Scanner in = new Scanner(file);

            while(in.hasNextLine()) {
                String round = in.nextLine();
                char opp = round.charAt(0);
                char outcome = round.charAt(2);
                char shape = '\0';
                int oppIndex = 0;

                for(int i =0; i < rpsOpponent.length; i++) {
                    if(rpsOpponent[i] == opp) {
                        oppIndex = i;
                    }
                }

                switch(outcome) {
                    case 'X': //Lose
                        shape = lose[oppIndex];
                        break;
                    case 'Y': //Draw
                        totalPoints += 3;
                        shape = draw[oppIndex];
                        break;
                    case 'Z': //Win
                        totalPoints += 6;
                        shape = win[oppIndex];
                        break;
                    default:
                        break;
                }

                switch(shape) {
                    case 'X':
                        totalPoints += 1;
                        break;
                    case 'Y':
                        totalPoints += 2;
                        break;
                    case 'Z':
                        totalPoints += 3;
                        break;
                    default:
                        break;
                }
            }

            System.out.println(totalPoints);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
