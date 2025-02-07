package University.Entity;

import java.util.List;

public class Subject {
    private Department department;
    private FieldOfStudy fieldOfStudy;
    private List<Lecturer> accreditedLecturer;
    private int year;
    private int semester;
    private int credits;

    public Subject(Department department, FieldOfStudy fieldOfStudy,
                  List<Lecturer> accreditedLecturer, int year, int semester, int credits) {
        this.department = department;
        this.fieldOfStudy = fieldOfStudy;
        this.accreditedLecturer = accreditedLecturer;
        this.year = year;
        this.semester = semester;
        this.credits = credits;
    }

    public Subject() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<Lecturer> getAccreditedLecturer() {
        return accreditedLecturer;
    }

    public void setAccreditedLecturer(List<Lecturer> accreditedLecturer) {
        this.accreditedLecturer = accreditedLecturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
