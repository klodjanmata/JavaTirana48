package University;

import JavaFundamentalsCoding.Helper;
import University.FilesIO.SubjectCSVUtil;
import University.Registers.LecturerRegister;
import University.Registers.SubjectRegister;

public class Application {
    private LecturerRegister lecturerRegister;
    private SubjectRegister subjectRegister;
    private SubjectCSVUtil subjectCSVUtil;

    public static void main(String[] args) {
        Application app = new Application();
        initUtils(app);
        initRegisters(app);
        while(true){
            printMenu();
            int choice = getChoice();
            if(choice == 0){
                closingOperations(app.subjectRegister, app.subjectCSVUtil);
                return;
            }
            executeAction(choice, app);
        }
    }

    private static void initUtils(Application app){
        app.subjectCSVUtil = new SubjectCSVUtil();
    }

    private static void initRegisters(Application app) {
        app.lecturerRegister = new LecturerRegister();
        app.subjectRegister = new SubjectRegister(app.subjectCSVUtil.readFromFile());

    }

    private static void closingOperations(SubjectRegister sr, SubjectCSVUtil subjectUtil) {
        System.out.println("Closing operations");
        System.out.println("Saving data into files...");
        subjectUtil.writeToFile(sr.getSubjects());

        System.out.println("Good Bye!!");
    }

    public static void printMenu(){
        System.out.println( "Chose action: \n" +
                "1 - Add Lecturer \n" +
                "2 - Add Student \n" +
                "3 - Grades \n" +
                "4 - Add Subject \n" +
                "5 - Print Lecturers \n" +
                "6 - Print Students \n" +
                "7 - Print Subjects \n" +
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
                app.subjectRegister.createNewSubject();
                break;
            case 5:
                System.out.println("Print Lecturers");
                app.lecturerRegister.printALlLecturers();
                break;
            case 6:
                System.out.println("Print Students");
                break;
            case 7:
                app.subjectRegister.printAllSubjects();
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
