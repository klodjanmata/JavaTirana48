package University;

import JavaFundamentalsCoding.Helper;
import University.Registers.LecturerRegister;

public class Application {
    private LecturerRegister lecturerRegister;

    public static void main(String[] args) {
        Application app = new Application();
        initRegisters(app);
        while(true){
            printMenu();
            int choice = getChoice();
            if(choice == 0){
                return;
            }
            executeAction(choice, app);
        }
    }

    private static void initRegisters(Application app) {
        app.lecturerRegister = new LecturerRegister();
    }

    public static void printMenu(){
        System.out.println( "Chose action: \n" +
                "1 - Add Lecturer \n" +
                "2 - Add Student \n" +
                "3 - Grades \n" +
                "4 - Print Lecturers \n" +
                "5 - Print Students \n" +
                "0 - Exit" );
    }

    public static void executeAction(int choice, Application app){
        switch (choice){
            case 1:
                app.lecturerRegister.createNewLecturer();
                break;
            case 2:
                System.out.println("Adding Student");
                break;
            case 3:
                System.out.println("Grades");
                break;
            case 4:
                System.out.println("Print Lecturers");
                app.lecturerRegister.printALlLecturers();
                break;
            case 5:
                System.out.println("Print Students");
                break;
            default:
                System.out.println("Invalid choice! Please chose again!");
        }
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
}
