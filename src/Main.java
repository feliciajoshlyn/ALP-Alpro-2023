import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int current_money = 10000;
        int months = 5;
        int monthly = 10000;
        int savings = 0;
        int score = 0;
        int monthly_savings = 0;
        int groceries = 0;
        int entertainment = 0;
        int rent = 0;
        int limit = (int) (current_money * 0.2);
        String next = "";
        String name = "";

        // Username setup
        System.out.println("Enter your Name:");
        name = s.nextLine();

        for (int i = 1; i <= months; i++) {
            System.out.println("");
            System.out.println("Month " + i);
            System.out.println("Current money: " + current_money);
            System.out.println("Limit: " + limit);
            System.out.println("Monthly savings: " + monthly_savings);
            System.out.println("Current score: " + score);
            System.out.println("================================");

            String[] events = {"Friend's birthday", "Dinner with family", "Trip to a theme park"};
            int event_cost = r.nextInt(300);
            String event = events[r.nextInt(events.length)];

            System.out.println("Input spending!");
            System.out.print("Enter amount for saving \n>");
            savings = s.nextInt();
            System.out.print("Enter amount for groceries \n>");
            groceries = s.nextInt();
            System.out.print("Enter amount for entertainment \n>");
            entertainment = s.nextInt();
            System.out.print("Enter amount for rent \n>");
            rent = s.nextInt();

            System.out.println("Random event occurred! " + event + ". The cost is " + event_cost + ".");
            current_money -= event_cost;

            int sum_spent = savings + groceries + entertainment + rent + event_cost ;

            if (sum_spent > limit) {
                score -= 5;
            } else if (sum_spent < limit) {
                score += 3;
            }

            monthly_savings += savings;
            current_money += monthly - sum_spent;

            if (current_money <= 0) {
                score -= 10;
            }

            System.out.println("Next (input y)");
            next = s.next() + s.nextLine();
            while (!next.equalsIgnoreCase("y")) {
                System.out.println("Invalid input!\n");
                next = s.next() + s.nextLine();
            }

            if (next.equalsIgnoreCase("y")) {
                System.out.println("Feedback!");
                System.out.println("Total spent this month: " + sum_spent);
                System.out.println("Savings: " + monthly_savings);
                System.out.println("Monthly income: " + monthly);
                if (sum_spent > limit) {
                    System.out.println("You went over the budget >:C!");
                } else if (sum_spent < limit) {
                    System.out.println("Good Job, You stayed within the budget :).");
                }
                System.out.println("Score :" + score);
            }
        }
    }
}
