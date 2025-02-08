package University;

import java.util.Date;

public class Lecturer extends Person{
    private Department department;
    private List<Subject> subjectList;
    private Date startDate;

    public Lecturer(String id, String name, String surname, char gender, Date birthday,
                    Department department, List<Subject> subjectList, Date startDate) {
        super(id, name, surname, gender, birthday);
        this.department = department;
        this.subjectList = subjectList;
        this.startDate = startDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
