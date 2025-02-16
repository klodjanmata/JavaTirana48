package University.Registers;

import JavaAdvanced.Exercises.Collections.Task2.Genre;
import JavaFundamentalsCoding.Helper;
import University.Entity.FieldOfStudy;
import University.Entity.Student;

import java.util.Date;
import java.util.List;

public class StudentRegister {
    private List<Student> students;

    public StudentRegister(List<Student> students) {
        this.students = students;
    }

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void createNewStudent(){
        System.out.println("Creating new student");
        Student s = new Student();
        System.out.print("ID: ");
        s.setId(Helper.getStringFromUser());
        System.out.print("Name: ");
        s.setName(Helper.getStringFromUser());
        System.out.print("Surname: ");
        s.setSurname(Helper.getStringFromUser());
        System.out.print("Gender:(M, F) ");
        s.setGender(Helper.getCharFromUser());
        System.out.print("Date of birth: ");
        s.setBirthday(Helper.getDateFromUser());
        System.out.println("Chose Field of Study: ");
        FieldOfStudy.printChoseField();
        int choice = Helper.getIntFromUser();
        s.setFieldOfStudy(FieldOfStudy.values()[choice-1]);
        System.out.print("Date of Start: ");
        s.setDateOfStart(Helper.getDateFromUser());
        System.out.print("Graduated: ");
        s.setGraduated(Helper.getBooleanFromUser());
        Date d = new Date();
        d.setDate(1);
        d.setMonth(1);
        d.setYear(0);
        s.setDateOfGraduation(d);
        s.setGpa(0);
        if(s.isGraduated()){
            System.out.print("Graduation Date: ");
            s.setDateOfGraduation(Helper.getDateFromUser());
            System.out.print("GPA: ");
            s.setGpa(Helper.getFloatFromUser());
        }
        students.add(s);
    }

    public void printAllStudents(){
        System.out.println("ID\tName\tSurname\tGender\tBirthday\tFieldOfStudy\tStartDate\tGraduated\tDate\tGPA");
        if (students != null) {
            students.forEach(System.out::println);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
