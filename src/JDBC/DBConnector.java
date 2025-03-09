package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {
    public static void main(String[] args) {
        List<Author> dbAuthors = new ArrayList<>();
        try (Connection conn  =
         DriverManager.getConnection("jdbc:mysql://localhost:3306/javatirana48",
                                    "root", "root")
        ){
            Statement statement = conn.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM author");
            while (rs.next()){
                Author a = new Author();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setLastname(rs.getString(3));
                a.setDateOfBirth(rs.getDate(4));
                dbAuthors.add(a);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("ID\tName\tLastname\tDateOfBirth");
        for (Author a : dbAuthors){
            System.out.println(a);
        }
    }
}
