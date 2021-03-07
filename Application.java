package Singleton;

import java.sql.*;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException{
        DatabaseConnection bar = DatabaseConnection.getInstance();
        // bar.setQueryInsert("INSERT INTO Employee(em_name,em_phone) VALUES ('Gulfairus',098765);");
        bar.setQuerySelect("SELECT*FROM Employee;");
        DatabaseConnection foo=DatabaseConnection.getInstance();
        // foo.setQueryInsert("INSERT INTO Employee(em_name,em_phone) VALUES ('Max',385739);");
        foo.setQuerySelect("SELECT*FROM Employee;");
    }
}
