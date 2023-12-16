
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
        int yes = 0;
        int exit_app = 0;
        int categories_choice;

        while (true) {
            //main menu
            System.out.println("Budgeting App");
            System.out.println("Balance : ");
            System.out.println("=====Menu=====");
            System.out.println("1. Goals");
            System.out.println("2. Categories");
            System.out.println("3. Listing");
            System.out.println("4. Print report");
            System.out.println("5. Exit app");
            System.out.println("==============");
            System.out.println("Where would you like to go? (1-5)");
            menu = s.nextInt();
            while (menu > 5 || menu < 1) {
                System.out.println("Input not valid, please input 1-5");
                menu = s.nextInt();
            }

            switch (menu) {
                //goal menu (ini mau dibuat ngeloop gmn yaa)
                case 1:
                    System.out.println("What term goals would you like to set");
                    System.out.println("1. Short term goal");
                    System.out.println("2. Medium term goal");
                    System.out.println("3. Long term goal");
                    term = s.nextInt();
                    while (term > 3 || term < 1) {
                        System.out.println("Input is not valid, please input 1-3");
                        term = s.nextInt();
                    }
                    switch (term) {
                        //short term goal menu(weekly) (aku mau set it like if there's no goal, tulisannya set goal but if there's a goal tulisannya edit goal tpi idk how and trs bisa ngeloop balik kl udah set atau edit goal)
                        case 1:
                            while (yes < 1) {
                                System.out.println("set goal : " + st_goal + "/week");
                                System.out.println("1. Set goal");
                                System.out.println("2. Edit goal");
                                System.out.println("3. Exit menu");
                                System.out.print("choose : ");
                                st_choice = s.nextInt();
                                while (st_choice > 3 || st_choice < 1) {
                                    System.out.println("Input is not valid, please input 1-2");
                                    st_choice = s.nextInt();
                                }
                                //short term goal set up (weekly)
                                switch (st_choice) {
                                    case 1:
                                        System.out.println("Set up a short term goal!");
                                        System.out.print("goal : ");
                                        //should it be able to make another goal or just one short term goal
                                        st_goal = s.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("Edit goal");
                                        System.out.println("Current goal: " + st_goal);
                                        System.out.print("Change goal to : ");
                                        st_goal = s.nextInt();
                                        break;
                                    case 3:
                                        yes += 1;
                                        break;
                                }

                            }
                            break;
                        //medium term goal menu (monthly)
                        case 2:

                            break;
                        //long term goal menu (6 months?)
                        case 3:

                            break;
                    }
                    break;
                // categories menu
                case 2:
//                            while(){
                    System.out.println("Categories!");
                    //put in array of categories here to display
                    //System.out.println(categories);
                    System.out.println("1. Add");
                    System.out.println("2. Edit");
                    System.out.println("3. Exit menu");
                    System.out.print("choose (1-3): ");
                    categories_choice = s.nextInt();
                    while(categories_choice<1 || categories_choice>3){
                        System.out.println("Input is not valid, please input 1-3!");
                        categories_choice = s.nextInt();
                    }

                    switch (categories_choice) {
                        // add categories
                        case 1:
                            break;
                        // edit categories
                        case 2:
                            break;
                        // exit categories menu
                        case 3:
                            break;
                    }
//                    }
                    break;
                //List user's outcome w categories too
                case 3:
                    break;
                //print out report
                case 4:
                    break;
                // exit whole app
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
