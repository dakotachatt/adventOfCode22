package Dec2;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Dec2P1 {
    public static void main(String[] args) {

        char[] rpsOpponent = {'A', 'B', 'C'};
        char[] rpsDraws = {'X', 'Y', 'Z'};
        char[] rpsWins = {'Y', 'Z', 'X'};
        int totalPoints = 0;
        int count = 0;

        try{
            File file = new File("./res/Dec2.txt");
            Scanner in = new Scanner(file);

            while(in.hasNextLine()) {
                String round = in.nextLine();
                count++;
                char opp = round.charAt(0);
                char you = round.charAt(2);
                int oppIndex = 0;
                int youDrawIndex = 0;
                int youWinIndex = 0;

                for(int i = 0; i < rpsOpponent.length; i++) {
                    if(rpsOpponent[i] == opp) {
                        oppIndex = i;
                    }

                    if(rpsWins[i] == you) {
                        youWinIndex = i;
                    }

                    if(rpsDraws[i] == you) {
                        youDrawIndex = i;
                    }
                }

                //Outcome of round
                if(oppIndex == youWinIndex) { //Win
                    totalPoints += 6;
                } else if (oppIndex == youDrawIndex) { //draw
                    totalPoints += 3;
                }

                switch(you) {
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

                System.out.println("Round Number " + count + " " + totalPoints);
            }
            System.out.println(totalPoints);
            //13809
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
