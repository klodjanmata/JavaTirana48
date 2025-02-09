package University.FilesIO;

import University.Entity.Subject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SubjectCSVUtil {
    private static final String subjectFile = "UniversityFiles\\Subject.csv";
    private static final String separator = ",";

    public void writeToFile(List<Subject> subjectList) {
        String header = "ID" + separator +
                        "Name" + separator +
                        "Year" + separator +
                        "Semester" + separator +
                        "Credits" + separator +
                        "Department" + separator +
                        "Field Of Study";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(subjectFile))){
            writer.write(header);
            for (Subject s : subjectList){
                writer.newLine();
                writer.write(s.getId() + separator);
                writer.write(s.getName() + separator);
                writer.write(s.getYear() + separator);
                writer.write(s.getSemester() + separator);
                writer.write(s.getCredits() + separator);
                writer.write(s.getDepartment() + separator);
                writer.write(s.getFieldOfStudy().toString());
            }
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public List<Subject> readFromFile(){
        return null;
    }
}
