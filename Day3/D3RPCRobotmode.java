package Week2.Day3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Justin on 7/20/16.
 */
public class D3RPCRobotmode {


    /**
     * Created by Justin on 7/20/16.
     */

    public static Scanner scanner = new Scanner(System.in);
    public static int counter = 0;
    public static int turns = 1000;
    public static int p1wins = 0;
    public static int p2wins = 0;
    public static int ties = 0;
    public static int scissors = 0;
    public static int paper = 0;
    public static int rock = 0;
    private String player1Choice = "";
    private String player2Choice = "";

    public static void main(String[] args) {


        while (counter < turns) {
            counter++;
            System.out.println(counter);


            D3RPCRobotmode robotmode = new D3RPCRobotmode();
            robotmode.setPlayerChoicesRobot();
        }
        System.out.println("p1 wins: " + p1wins);
        System.out.println("p2 wins: " + p2wins);
        System.out.println("ties!: " + ties);
        System.out.println("rock: " + rock);
        System.out.println("paper: " + paper);
        System.out.println("scissors: " + scissors);

    }

    public static String randomSelection() {
        int low = 1;
        int high = 3;
        String randomSelection;
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((high - low) + 1) + low;
        if (randomNumber == 2) {
            randomSelection = "rock";

        } else if (randomNumber == 3) {
            randomSelection = "paper";

        } else {
            randomSelection = "Scissors";
        }
        return randomSelection;
    }

    public static String randomSelection2() {
        int min = 1;
        int max = 3;
        String randomSelection2;
        Random random = new Random(System.nanoTime());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        if (randomNumber == 3) {
            randomSelection2 = "rock";

        } else if (randomNumber == 1) {
            randomSelection2 = "paper";

        } else {
            randomSelection2 = "Scissors";

        }
        return randomSelection2;
    }

    private void setPlayerChoicesRobot() {


        System.out.println("Press [enter} to begin the path of a 1000 deaths kinda...");

        player1Choice = randomSelection();
        System.out.println("Computer 2 has: " + randomSelection());

        player2Choice = randomSelection2();
        System.out.println("Computer has: " + randomSelection2());


        if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer 2 wins!");
            p1wins++;
            rock++;
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Computer 2: scissors vs Computer: paper ------Computer 2 wins!");
            p1wins++;
            scissors++;
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer 2 wins!");
            p1wins++;
            paper++;
        } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            p2wins++;
            rock++;
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            p2wins++;
            paper++;
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            p2wins++;
            scissors++;
        } else {
            System.out.println("ITS A TIE!!!!");
            ties++;
        }

    }
    // Track which player wins most often

    //Track which choice wins most often
    //Using dynamic data structures, track every game (hint: ArrayList)
    //Print your results to the screen


}

// Instead of asking the player for their choice, have the computer automatically randomly select both the player and computer
//   Auto run the simulation 1000 times
// Track which player wins most often
//Track which choice wins most often
//Using dynamic data structures, track every game (hint: ArrayList)
//Print your results to the screen


