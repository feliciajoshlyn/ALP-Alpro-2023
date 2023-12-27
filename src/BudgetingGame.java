
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
                    System.out.println("Invalid input! dumbass\n");
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
                System.out.println("Invalid input! dumbass\n");
            }
        } while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));

        if (choice.equalsIgnoreCase("y")) {
            return 0;
        }
        return 1;
    }

    public static void startGame(int mode) {
        System.out.println("");
    }
}
