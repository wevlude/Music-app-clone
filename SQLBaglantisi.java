package operasyonlar.pk;

import java.sql.*;

public class SQLBaglantisi {

    public static Connection getConnection() throws Exception {
        String veriTabaniRoot = "jdbc:mysql://";
        String hostAdi = "localhost:3306/";
        String veriTabaniAdi = "db";
        String baglantiUrl = veriTabaniRoot + hostAdi + veriTabaniAdi;

        String hostUsername = "root";
        String hostPassword = "vf1lm1660133.3";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConn = (Connection) DriverManager.getConnection(baglantiUrl, hostUsername, hostPassword);

        return myConn;
    }
}
