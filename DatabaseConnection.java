package Singleton;

import java.sql.*;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private Connection connection;
    private Statement stmt;
    private ResultSet rs;
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "postgres";

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            stmt=connection.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }


    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void setQueryInsert(String query) throws SQLException{
        stmt.executeQuery(query);
    }
    public void setQuerySelect(String query)throws SQLException{
        rs=stmt.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
    }

}
