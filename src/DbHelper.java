
// Bu class ile veritabanına bağlantı sağlanıyor. Bilgilerin tekrar yazılmasına gerek kalmıyor.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    
    private final String userName = "root";
    private final String password = "12345";
    private final String dbUrl = "jdbc:mysql://localhost:3306/kullanicilar?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    
    // Herhangibir hata durumunda hata mesajını yazdırması için gereken operasyon
    public void showErrorMessage(SQLException exception){
        System.out.println("Errorr : "+exception.getMessage());
        System.out.println("Error Code : "+exception.getErrorCode());
    }
}
