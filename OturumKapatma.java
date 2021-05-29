package operasyonlar.pk;

import javax.swing.JFrame;

public class OturumKapatma {

    public static void oturumKapat(JFrame context, LoginForm girisEkrani) {
        OturumAcAdmin.isLoggedIn = false;
        context.setVisible(false);
        girisEkrani.setVisible(true);
    }
    
   

}
