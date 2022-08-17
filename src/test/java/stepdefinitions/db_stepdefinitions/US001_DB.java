package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class US001_DB {
    @Given("")
    public void k() throws ClassNotFoundException, SQLException {
     //driver yukle
        Class.forName("com.mysql.jdbc.Driver");
     //baglanti kur
         DriverManager.getConnection("jdbc:mysql://localhost://3306", "root", "2041");

    }
}