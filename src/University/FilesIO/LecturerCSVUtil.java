package University.FilesIO;

import University.Entity.Lecturer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LecturerCSVUtil {
    private static final String FILENAME = "UniversityFiles\\Lecturers.csv";
    private static final String SEPARATOR = ",";

    private String getHeader(){
        return "ID" + SEPARATOR +
                "NAME" + SEPARATOR +
                "SURNAME" + SEPARATOR +
                "DEPARTMENT" + SEPARATOR +
                "START DATE" + SEPARATOR +
                "EMAIL" + SEPARATOR +
                "PHONE NUMBER" + SEPARATOR +
                "GENDER" + SEPARATOR +
                "BIRTHDAY" + SEPARATOR +
                "SUBJECT LIST";
    }

    public void writeToFile(List<Lecturer> lecturerList){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){
            bw.write(getHeader());
            for(Lecturer lecturer : lecturerList){

            }
        }catch (IOException e){
            System.out.println("Error while writing Lecturers to file");
            e.printStackTrace();
        }
    }
}
