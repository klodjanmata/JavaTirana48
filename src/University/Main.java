package University;

import JavaFundamentalsCoding.Helper;

public class Main {

    public static void main(String[] args) {
        while(true){
            printMenu();
            int choice = getChoice();
            if(choice == 0){
                return;
            }
            executeAction(choice);
        }
    }

    public static void printMenu(){
        System.out.println( "Chose action: \n" +
                "1 - Add Lecturer \n" +
                "2 - Add Student \n" +
                "3 - Grades \n" +
                "0 - Exit" );
    }

    public static int getChoice(){
        int choice = -1;
        try{
            choice = Helper.getIntFromUser();
        }catch (Exception e){
            choice = -1;
        }
        return choice;
    }

    public static void executeAction(int choice){
        switch (choice){
            case 1:
                System.out.println("Adding Lecturer");
                break;
            case 2:
                System.out.println("Adding Student");
                break;
            case 3:
                System.out.println("Grades");
                break;
            default:
                System.out.println("Invalid choice! Please chose again!");
        }
    }
}
