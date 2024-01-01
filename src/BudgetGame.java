
import java.util.Scanner;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Felicia
 */
public class BudgetGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu_choice;
        int redo;
        int redo1;
        String name;
        String name_menu;

        System.out.println("Welcome to Budgeting Game!");
        System.out.println("What would you like to do?");
        do {
            redo = 0;
            System.out.println(" 1. Start \n 2. Leaderboard \n 0. Exit");
            System.out.print("> ");
            menu_choice = s.next() + s.nextLine();
            switch (menu_choice) {
                case "1":
                    System.out.println("Insert your name!");
                    System.out.print("> ");
                    name = s.next() + s.nextLine();
                    do {
                        redo1 = 0;

                        System.out.println("Your name : " + name);
                        System.out.println("1. Back");
                        System.out.print("2. Next \n> ");
                        name_menu = s.next();
                        switch (name_menu) {
                            case "1":
                                redo = 1;
                                break;
                            case "2":
                                System.out.println("RULES!");
                                System.out.println("- You will be given a random amount of money!");
                                System.out.println("- Spend your money wisely on the categories provided!");
                                //nnti ada minimum spend
                                System.out.println("- Beware of random events that would pop out!");
                                System.out.println("===================Start===================");
                                game(0);
                                break;
                            default:
                                System.out.println("invalid input!");
                                redo1 = 1;
                                break;
                        }
                    } while (redo1 == 1);
                    break;

                case "2":
                    Leaderboard();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input!");
                    redo = 1;
                    break;
            }

        } while (redo == 1);
    }

    public static void Leaderboard() {
        
    }

    public static void game(int sum_spent) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int months;
        int current_money = 0;
        int limit = 0;
        int savings = 0;
        int score = 0;
        int groceries = 0;
        int entertainment = 0;
        int rent = 0;
        //berapa yah
        int event;
        int monthly = r.nextInt();
        sum_spent = 0;
        String next;

        System.out.println("Input how many months you want to play!");
        months = s.nextInt();
        while (months < 1 || months > 99) {
            System.out.println("Input is not valid!");
            months = s.nextInt();
        }
        for (int i = 1; i <= months; i++) {
            System.out.println("");
            System.out.println("Month " + i);
            System.out.println("Current money: " + current_money);
            System.out.println("Limit: ");
            //nnti ini limit = brp persen dri uang yg didapat
            System.out.println("Savings: " + savings);
            System.out.println("Current score: " + score);
            System.out.println("================================");

            System.out.println("Input spending!");
            System.out.print("Enter amount for saving \n>");
            savings = s.nextInt();
            System.out.print("Enter amount for groceries \n>");
            groceries = s.nextInt();
            System.out.print("Enter amount for entertainment \n>");
            entertainment = s.nextInt();
            System.out.print("Enter amount for rent \n>");
            rent = s.nextInt();
            System.out.println("RANDOM EVENT!!");
            event = r.nextInt(10) + 1;
            switch (event){
                case 1:
                    event1();
                    break;
                case 2:
                    event2();
                    break;
                case 3:
                    event3();
                    break;
                case 4:
                    event4();
                    break;
                case 5:
                    event5();
                    break;
                case 6:
                    event6();
                    break;
                case 7:
                    event7();
                    break;
                case 8:
                    event8();
                    break;
                case 9:
                    event9();
                    break;
                case 10:
                    event10();
                    break;
            }

            System.out.println("Next (input y)");
            next = s.next() + s.nextLine();
            while (!next.equalsIgnoreCase("y")) {
                System.out.println("Invalid input!\n");
                next = s.next() + s.nextLine();
            }
            if (next.equalsIgnoreCase("y")) {
//                feedback();
                System.out.println("Feedback!");
                System.out.println("Total spent this month: " + sum_spent);
                System.out.println("Savings: " + savings);
                System.out.println("Monthly income: " + monthly);
                if (sum_spent > limit) {
                    System.out.println("You went over the budget!");
                } else if (sum_spent < limit) {
                    System.out.println("You did not go over the budget! Congratulations!");
                }
                System.out.println("Score :" + score);
            }
        }

    }

//    public static void feedback() {
//        
//    }
    public static void event1() {
        int cost = -100;
        System.out.println("Friends Birthday!");
        System.out.println("Birthday gift costed 100");
    }

    public static void event2() {
        System.out.println("Gathering dinner!");
        System.out.println("Gathering dinner costed 300");
    }

    public static void event3() {
        System.out.println("Inflation!!");
        System.out.println("For every next month rent would cost extra 200");
    }

    public static void event4() {

    }

    public static void event5() {

    }

    public static void event6() {

    }

    public static void event7() {

    }

    public static void event8() {

    }

    public static void event9() {

    }

    public static void event10() {

    }
}
