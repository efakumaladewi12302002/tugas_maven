package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectoinTest {
    @Test
    void testConnection() {
        String jdbcUrl ="jdbc:mysql://localhost:3306/belajar-java-database";
        String username ="root";
        String password ="";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            System.out.println("sukses koneksi ke database");
            connection.close();
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
}
