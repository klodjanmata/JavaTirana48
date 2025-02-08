package University.Registers;

import JavaFundamentalsCoding.Helper;
import University.Entity.Department;
import University.Entity.Lecturer;
import University.Entity.Subject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LecturerRegister {
    private HashMap<String, Lecturer> lecturers;

    public boolean createNewLecturer(){
        System.out.println("Creating new lecturer! Please give the correct information about the lecturer.");
        Lecturer l = new Lecturer();
        System.out.print("ID: ");
        String id = Helper.getStringFromUser();
        if (containsLecturerById(id)){
            System.out.println("This lecturer already exists!");
            return false;
        }
        l.setId(id);
        System.out.print("Name: ");
        l.setName(Helper.getStringFromUser());
        System.out.print("Surname: ");
        l.setSurname(Helper.getStringFromUser());
        System.out.print("Gender: (M, F)");
        l.setGender(Helper.getCharFromUser());
        System.out.print("Date of birth:");
        l.setBirthday(Helper.getDateFromUser());
        System.out.print("Start date: ");
        l.setStartDate(Helper.getDateFromUser());
        System.out.print("Email: ");
        l.setEmail(Helper.getStringFromUser());
        System.out.print("Phone number: ");
        l.setPhoneNumber(Helper.getStringFromUser());
        System.out.println("Chose Department: ");
        Department.printChoseDepartment();
        int choice = Helper.getIntFromUser();
        l.setDepartment(Department.values()[choice-1]);
        // TO DO
        // add subjects
        l.setSubjectList(new ArrayList<Subject>());
        lecturers.put(l.getId(), l);
        return true;
    }

    public void printALlLecturers(){
        lecturers.values().forEach(System.out::println);
    }



    public boolean containsLecturerById(String id){
        if(lecturers.get(id) == null){
            return false;
        }else{
            return true;
        }
//        return lecturers.get(id) == null ? false : true;
    }



    public LecturerRegister(HashMap<String, Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public LecturerRegister() {
        lecturers = new HashMap<>();
    }

    public HashMap<String, Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(HashMap<String, Lecturer> lecturers) {
        this.lecturers = lecturers;
    }
}
