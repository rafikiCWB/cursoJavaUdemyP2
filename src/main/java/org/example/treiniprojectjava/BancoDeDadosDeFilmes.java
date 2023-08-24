package org.example.treiniprojectjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.out;

public class BancoDeDadosDeFilmes {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/moviedb";
        String userName = "root";
        String password = "1010";
        String query = "SELECT * FROM movies";

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int year = resultSet.getInt("year");
                String director = resultSet.getString("director");
                out.println(id + " " + title + " " + year + " " + director);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
