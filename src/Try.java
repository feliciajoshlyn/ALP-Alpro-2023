
import java.util.Scanner;
import java.util.ArrayList;

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
        int mt_goal = 0;
        int mt_choice;
        int lt_goal = 0;
        int lt_choice;
        int yes = 0;
        int exit_app = 0;
        int categories_choice;
        int category_choice;
        int remove_choice;
        int list_choice;
        int outcome = 0;
        ArrayList<String> categories = new ArrayList<String>();

        while (true) {
            //main menu
            System.out.println("Budgeting App");
            System.out.println("Outcome : ");
            //diganti jadi money spent!
            //trs display sm goal
            System.out.println("/" + st_goal);
            //trs kl keluar dri goal gmn
            System.out.println("/" + mt_goal);
            //^kl ini kan hrs per bulan, nyimpennya gimana :(
            System.out.println("/" + lt_goal);
            //ini juga kan cz nnti clash sm per month n per week
            System.out.println("=====Menu=====");
            System.out.println("1. Goals");
            System.out.println("2. Categories");
            System.out.println("3. Listing");
            System.out.println("4. Print report");
            System.out.println("5. Exit app");
            System.out.println("===============");
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
                    System.out.println("4. Back to main menu");
                    yes = 0;
                    term = s.nextInt();
                    while (term > 4 || term < 1) {
                        System.out.println("Input is not valid, please input 1-4");
                        term = s.nextInt();
                    }
                    switch (term) {
                        //short term goal menu(weekly) (aku mau set it like if there's no goal, tulisannya set goal but if there's a goal tulisannya edit goal tpi idk how and trs bisa ngeloop balik kl udah set atau edit goal)
                        case 1:
                            while (yes < 1) {
                                System.out.println("set goal : " + st_goal + "/week");
                                if (st_goal == 0) {
                                    System.out.println("1. Set goal");
                                } else {
                                    System.out.println("1. Edit goal");
                                }
                                System.out.println("3. Exit menu");
                                System.out.print("choose : ");
                                st_choice = s.nextInt();
                                while (st_choice > 3 || st_choice < 1) {
                                    System.out.println("Input is not valid, please input 1-3");
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
                            while (yes < 1) {
                                System.out.println("set goal : " + mt_goal + "/month");
                                if (mt_goal == 0) {
                                    System.out.println("1. Set goal");
                                } else {
                                    System.out.println("1. Edit goal");
                                }
                                System.out.println("3. Exit menu");
                                System.out.print("choose : ");
                                mt_choice = s.nextInt();
                                while (mt_choice > 3 || mt_choice < 1) {
                                    System.out.println("Input is not valid, please input 1-3");
                                    mt_choice = s.nextInt();
                                }
                                //medium term goal set up (monthly)
                                switch (mt_choice) {
                                    case 1:
                                        System.out.println("Set up a medium term goal!");
                                        System.out.print("goal : ");
                                        //should it be able to make another goal or just one short term goal
                                        mt_goal = s.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("Edit goal");
                                        System.out.println("Current goal: " + mt_goal);
                                        System.out.print("Change goal to : ");
                                        mt_goal = s.nextInt();
                                        break;
                                    case 3:
                                        yes += 1;
                                        break;
                                }

                            }
                            break;
                        //long term goal menu (6 months?)
                        case 3:
                            while (yes < 1) {
                                System.out.println("set goal : " + lt_goal + "/6 months");
                                if (lt_goal == 0) {
                                    System.out.println("1. Set goal");
                                } else {
                                    System.out.println("1. Edit goal");
                                }
                                System.out.println("3. Exit menu");
                                System.out.print("choose : ");
                                lt_choice = s.nextInt();
                                while (lt_choice > 3 || lt_choice < 1) {
                                    System.out.println("Input is not valid, please input 1-3");
                                    lt_choice = s.nextInt();
                                }
                                //long term goal set up (6 months)
                                switch (lt_choice) {
                                    case 1:
                                        System.out.println("Set up a long term goal! (per 6 months)");
                                        System.out.print("goal : ");
                                        //should it be able to make another goal or just one short term goal
                                        lt_goal = s.nextInt();
                                        break;
                                    case 2:
                                        System.out.println("Edit goal");
                                        System.out.println("Current goal: " + lt_goal);
                                        System.out.print("Change goal to : ");
                                        lt_goal = s.nextInt();
                                        break;
                                    case 3:
                                        yes += 1;
                                        break;
                                }

                            }
                            break;
                        //exit goal menu
                        case 4:
                            break;
                    }
                    break;
                // categories menu
                case 2:
                    yes = 0;
                    while (yes < 1) {
                        System.out.println("Categories!");
                        //put in array of categories here to display
                        //System.out.println(categories);
                        System.out.println("1. Add");
                        System.out.println("2. Edit");
                        System.out.println("3. Exit menu");
                        System.out.print("choose (1-3): ");
                        categories_choice = s.nextInt();
                        while (categories_choice < 1 || categories_choice > 3) {
                            System.out.println("Input is not valid, please input 1-3!");
                            categories_choice = s.nextInt();
                        }

                        switch (categories_choice) {
                            // add categories
                            case 1:
                                System.out.println("Add a category!");
                                for (int i = 0; i < categories.size(); i++) {
                                    System.out.println(categories.get(i));
                                }
                                System.out.print("Category: ");
                                //this i try use arraylist but i dont rlly understand!!!!!
                                categories.add(s.next());
                                break;
                            // edit categories
                            case 2:
                                System.out.println("Remove a category!");
                                //shows the categories here
                                System.out.println("");
                                System.out.println("0. Exit");
                                remove_choice = s.nextInt();
                                while (remove_choice != 0) {
                                    System.out.println("Input is not valid, please reinput!");
                                    remove_choice = s.nextInt();
                                }
                                switch (remove_choice) {
                                    case 0:
                                        break;
                                }
                                break;
                            // exit categories menu
                            case 3:
                                yes += 1;
                                break;
                        }
                    }
                    break;
                //List user's outcome w categories too
                //nnti dijumlah per category

                case 3:
                    System.out.println("List your outcome!");
                    System.out.println("1. Add outcome");
                    System.out.println("2. Exit menu");
                    list_choice = s.nextInt();
                    while (list_choice < 1 || list_choice > 2) {
                        System.out.println("Input is not valid, please input 1-2!");
                        list_choice = s.nextInt();
                    }
                    switch (list_choice) {
                        case 1:
                            System.out.println("Add outcome");
                            //ini yaapa ya ak bingung
//                            outcome = s.nextInt();
                            System.out.println("Which category?");
                            break;
                        case 2:
                            break;
                    }
                    break;
                //print out report
                case 4:
                    System.out.println("Report");
                    System.out.println("Per week");
                    System.out.println("Per month");
                    System.out.println("Per 6 month");
                    System.out.println("Categories!");
                    //nnti ngeprint tiap category n jumlahnya
                    //trs nnti keluar total
                    break;
                // exit whole app
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
