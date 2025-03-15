package JDBC.Exercise2;

import JDBC.Exercise1.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class MovieDAOImpl implements MovieDAO {

    @Override
    public void createTable() {
        try(Connection connection = DBConnection.getConnection()){
            String createTableSql = "CREATE TABLE IF NOT EXISTS MOVIES (" +
                    "id INTEGER AUTO_INCREMENT, " +
                    "title VARCHAR(255), " +
                    "genre VARCHAR(255), " +
                    "yearOfRelease INTEGER, " +
                    "PRIMARY KEY (id))";
            PreparedStatement ps = connection.prepareStatement(createTableSql);
            ps.execute();
            System.out.println("Movie table is created ");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTable() {
        try(Connection connection = DBConnection.getConnection()){
            String dropTableSQL = "DROP TABLE IF EXISTS movies";
            PreparedStatement ps = connection.prepareStatement(dropTableSQL);
            ps.execute();
            System.out.println("Movie table is deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(int id) {

    }

    @Override
    public void updateMoviesTitle(int id, String newTitle) {

    }

    @Override
    public Optional<Movie> findMovieById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Movie> findAll() {
        return null;
    }
}
