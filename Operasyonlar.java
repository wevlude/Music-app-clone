package operasyonlar.pk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Operasyonlar {

    public  static boolean oturumAcildiMiAdmin(String username, String password, JFrame frame) {
        try {
            Connection baglanti = SQLBaglantisi.getConnection();
            
            
            String SQLSorgusu = "SELECT AdminID, KullaniciAdi FROM admin WHERE KullaniciAdi = '"
                                + username
                                + "' AND Sifre = '"
                                + password
                                + "'";
            
            
            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                OturumAcAdmin.AdminID = resultSet.getInt("AdminID");
                OturumAcAdmin.KullaniciAdi = resultSet.getString("KullaniciAdi");

                return true;
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }

        return false;
    }
    public static boolean oturumAcildiMiKullanici(String username, String password,String usertype,JFrame frame) {
           try {
            Connection baglanti = SQLBaglantisi.getConnection();
            
            
            String SQLSorgusu = "SELECT KullaniciID,KullaniciAdi, KullaniciTipAdi FROM kullanici k inner join kullanicitipi kt on k.KullaniciTipiID=kt.KullaniciTipID WHERE KullaniciAdi = '"
                                + username
                                + "' AND Sifre = '"
                                + password
                                + "' AND KullaniciTipAdi = '"
                                + usertype
                                + "'";
            
            
            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                OturumAcKullanici.KullaniciID = resultSet.getInt("KullaniciID");
                OturumAcKullanici.KullaniciAdi = resultSet.getString("KullaniciAdi");
                      OturumAcKullanici.KullaniciTipAdi = resultSet.getString("KullaniciTipAdi");

                return true;
            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }

        return false;
    }
      
 
}
