
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Felicia
 */
public class Try {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;
        int term;
        int st_goal = 0;
        int st_choice;
        int yes=0;

        while (true) {
            System.out.println("Budgeting App");
            System.out.println("Balance : ");
            System.out.println("=====Menu=====");
            System.out.println("1. Goals");
            System.out.println("2. Categories");
            System.out.println("3. Listing");
            System.out.println("==============");
            System.out.println("Where would you like to go? (1-3)");
            menu = s.nextInt();
            while (menu > 3 || menu < 1) {
                System.out.println("Input not valid, please input 1-3");
                menu = s.nextInt();
            }

            switch (menu) {
                case 1:
                    System.out.println("What term goals would you like to set");
                    System.out.println("1. Short term goal");3
                    System.out.println("2. Medium term goal");
                    System.out.println("3. Long term goal");
                    term = s.nextInt();
                    while (term > 3 || term < 1) {
                        System.out.println("Input is not valid, please input 1-3");
                        term = s.nextInt();
                    }
                    switch (term) {
                        case 1:
                            while(yes<1){
                            System.out.println("set goal : " + st_goal + "/month");
                            System.out.println("1. Set goal");
                            System.out.println("2. Edit goal");
                            System.out.println("3. Exit menu");
                            System.out.print("choose : ");
                            st_choice = s.nextInt();
                            while (st_choice > 3 || st_choice < 1) {
                                System.out.println("Input is not valid, please input 1-2");
                                st_choice = s.nextInt();
                            }

                            switch (st_choice) {
                                case 1:
                                    System.out.println("Set up a short term goal!");
                                    System.out.print("goal : ");
                                    st_goal = s.nextInt();
                                    break;
                                case 2: 
                                    break;
                                case 3:
                                    yes+=1;
                                    break;
                                    
                            }
                            }
                    }
            }
        }
    }
}
