package University.Registers;

import University.Entity.Grade;

import java.util.ArrayList;
import java.util.List;

public class GradeRegister {

    private List<Grade> gradeList;





    public GradeRegister(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public GradeRegister(){
        gradeList = new ArrayList<>();
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }
}
