package JDBC.Exercise1;

import java.sql.Connection;
import java.util.stream.Collectors;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
