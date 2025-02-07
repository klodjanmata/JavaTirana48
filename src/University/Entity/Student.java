package University.Entity;

import java.util.Date;

public class Student extends Person {
    private FieldOfStudy fieldOfStudy;
    private Date dateOfStart;
    private Date dateOfGraduation;
    private boolean graduated;
    private float gpa;

    public Student(String id, String name, String surname, char gender, Date birthday,
                   FieldOfStudy fieldOfStudy, Date dateOfStart) {
        super(id, name, surname, gender, birthday);
        this.fieldOfStudy = fieldOfStudy;
        this.dateOfStart = dateOfStart;
        this.graduated = false;
        this.dateOfGraduation = null;
        this.gpa = 0;
    }

    public Date getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
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
