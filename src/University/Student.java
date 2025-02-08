package University;

import java.util.Date;

public class Student extends Person {
    private FieldOfStudy fieldOfStudy;
    private Date dateOfStart;
    private boolean graduated;
    private float gpa;

    public Student(String id, String name, String surname, char gender, Date birthday,
                   FieldOfStudy fieldOfStudy, Date dateOfStart, boolean graduated, float gpa) {
        super(id, name, surname, gender, birthday);
        this.fieldOfStudy = fieldOfStudy;
        this.dateOfStart = dateOfStart;
        this.graduated = graduated;
        this.gpa = gpa;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
