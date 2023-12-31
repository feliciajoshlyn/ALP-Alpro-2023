
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Felicia
 */
public class BudgetingGame {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Budgeting Game!");

        int currentMode = selectMode();

        System.out.println(currentMode);
    }

    public static int selectMode() {
        int redo = 0, selectedMode = 0;
        String player_choice;

        do {
            redo = 0;

            System.out.println("Choose mode: ");
            System.out.println("1. 1 player");
            System.out.println("2. 2 player");
            System.out.println("0. Exit App");
            System.out.print("> ");

            player_choice = s.next() + s.nextLine();

            switch (player_choice) {
                // after choosing player 1
                case "1":
                    System.out.println("1 player");
                    selectedMode = 1;
                    redo = confirmPlayerChoice(selectedMode);
                    break;
                case "2":
                    System.out.println("2 player");
                    selectedMode = 2;
                    redo = confirmPlayerChoice(selectedMode);
                    break;

                case "0":
                    System.out.println("Exiting app");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input!\n");
                    redo = 1;
                    break;
            }
        } while (redo == 1);

        return selectedMode;
    }

    public static int confirmPlayerChoice(int mode) {
        String choice = "";

        do {
            System.out.printf("\nYou chose %d player\n", mode);
            System.out.println("Are you sure? (y/n)");
            System.out.print("> ");
            choice = s.next() + s.nextLine();

            if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
                System.out.println("Invalid input!\n");
            }
        } while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));

        if (choice.equalsIgnoreCase("y")) {
            return 0;
        }
        return 1;
    }

    public static void startGame(int mode) {
        int food_bar = 0;
        int fun_bar = 0;
        
        System.out.println("Welcome!\n Let's start our budgeting journey!");
        System.out.println("Here are some of the rules for our game! ");
        //rules
        System.out.println("You are going to be given a random amount of money. \n list them into the set categories");
        System.out.println("There are set targets that you have to take in mind as limits!");
        System.out.println("You win if ");

        //jdi kita kasih a week, tiap hari ada unexpected outcome
        for (int i = 1; i < 8; i++) {
            System.out.println("day " + i);
            System.out.println("========");
            System.out.println("food : " + food_bar);
            System.out.println("fun : " + fun_bar);
            System.out.println("transport"); // transport is everyday
            System.out.println("food price :");
            System.out.println("transport price");
            
        }
        //report
        System.out.println("game report!");
        //score??
    }
}
