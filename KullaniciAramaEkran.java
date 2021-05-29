/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasyonlar.pk;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sulev
 */
public class KullaniciAramaEkran extends javax.swing.JFrame {

    Connection baglanti = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public KullaniciAramaEkran() {
        initComponents();
        KullaniciAdi.setText(OturumAcKullanici.KullaniciAdi);
        KullaniciTipAdi.setText(OturumAcKullanici.KullaniciTipAdi);
        jTextField5.setText(OturumAcKullanici.KullaniciAramaAdi);
        TabloyuGosterPop(OturumAcKullanici.KullaniciAramaAdi);
        TabloyuGosterJazz(OturumAcKullanici.KullaniciAramaAdi);
        TabloyuGosterKlasik(OturumAcKullanici.KullaniciAramaAdi);
         
        KlasikListe.setVisible(false);
        Klasikliste.setVisible(false);
        PopListe.setVisible(false);
        Popliste.setVisible(false);
        JazzListe.setVisible(false);
        Jazzliste.setVisible(false);
        Pop.setVisible(false);
        Jazz.setVisible(false);
        Klasik.setVisible(false);
   
    
        
         TakipciSorgulama(OturumAcKullanici.KullaniciAramaID, this);
        AramaMotoru(OturumAcKullanici.KullaniciAramaAdi, this);
        

    }

    public void TabloyuGosterPop(String username) {
        try {
            baglanti = SQLBaglantisi.getConnection();
            String SQLSorgusu = "SELECT sarkiID,sarkiAdi,tur FROM kullanicilarincalmalisteleri kc inner join sarkilar s on kc.SarkiiID =s.sarkiID  inner join kullanici k on kc.KullanicininID=k.KullaniciID inner join muzikturu m on kc.CalmaListeTurID=m.ID WHERE tur='pop' and KullaniciAdi = '"
                    + username
                    + "'";

            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            resultSet = preparedStatement.executeQuery();
            Popliste.setModel(DbUtils.resultSetToTableModel(resultSet));
            //Popliste.getModel().getValueAt(WIDTH, ICONIFIED)

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void TabloyuGosterJazz(String username) {
        try {
            baglanti = SQLBaglantisi.getConnection();
            String SQLSorgusu = "SELECT sarkiID,sarkiAdi,tur FROM kullanicilarincalmalisteleri kc inner join sarkilar s on kc.SarkiiID =s.sarkiID  inner join kullanici k on kc.KullanicininID=k.KullaniciID inner join muzikturu m on kc.CalmaListeTurID=m.ID WHERE tur='jazz' and KullaniciAdi = '"
                    + username
                    + "'";

            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            resultSet = preparedStatement.executeQuery();
            Jazzliste.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void TabloyuGosterKlasik(String username) {
        try {
            baglanti = SQLBaglantisi.getConnection();
            String SQLSorgusu = "SELECT sarkiID,sarkiAdi,tur FROM kullanicilarincalmalisteleri kc inner join sarkilar s on kc.SarkiiID =s.sarkiID  inner join kullanici k on kc.KullanicininID=k.KullaniciID inner join muzikturu m on kc.CalmaListeTurID=m.ID WHERE tur='klasik' and KullaniciAdi = '"
                    + username
                    + "'";

            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            resultSet = preparedStatement.executeQuery();
            Klasikliste.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        KullaniciTipAdi = new javax.swing.JLabel();
        KullaniciAdi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Anasayfa = new javax.swing.JButton();
        KullaniciArama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PopListe = new javax.swing.JScrollPane();
        Popliste = new javax.swing.JTable();
        Pop = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Takipçiler = new javax.swing.JButton();
        TakipEdilenler = new javax.swing.JButton();
        Top = new javax.swing.JButton();
        CalmaListesi = new javax.swing.JButton();
        Klasik = new javax.swing.JTextField();
        JazzListe = new javax.swing.JScrollPane();
        Jazzliste = new javax.swing.JTable();
        Jazz = new javax.swing.JTextField();
        KlasikListe = new javax.swing.JScrollPane();
        Klasikliste = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        TakipEt = new javax.swing.JButton();
        TakipBirak = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        KullaniciTipAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        KullaniciAdi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/operasyonlar/pk/images/logout_btn_big.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(KullaniciTipAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KullaniciTipAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        Anasayfa.setBackground(new java.awt.Color(255, 102, 102));
        Anasayfa.setText("ANASAYFA");
        Anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnasayfaActionPerformed(evt);
            }
        });

        KullaniciArama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KullaniciAramaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Ara");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KullaniciArama)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KullaniciArama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Popliste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Popliste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoplisteMouseClicked(evt);
            }
        });
        PopListe.setViewportView(Popliste);

        Pop.setBackground(new java.awt.Color(255, 153, 102));
        Pop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pop.setText("                              POP");

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setForeground(new java.awt.Color(255, 153, 51));

        Takipçiler.setBackground(new java.awt.Color(255, 0, 0));
        Takipçiler.setText("Takipçiler");
        Takipçiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakipçilerActionPerformed(evt);
            }
        });

        TakipEdilenler.setBackground(new java.awt.Color(255, 51, 51));
        TakipEdilenler.setText("Takip edilenler");
        TakipEdilenler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakipEdilenlerActionPerformed(evt);
            }
        });

        Top.setBackground(new java.awt.Color(255, 51, 0));
        Top.setText("TOP");
        Top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopActionPerformed(evt);
            }
        });

        CalmaListesi.setBackground(new java.awt.Color(255, 51, 0));
        CalmaListesi.setText("Çalma Listeleri");
        CalmaListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalmaListesiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Takipçiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TakipEdilenler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CalmaListesi, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Takipçiler, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TakipEdilenler, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Top, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(CalmaListesi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(676, Short.MAX_VALUE))
        );

        Klasik.setBackground(new java.awt.Color(255, 153, 102));
        Klasik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Klasik.setText("                               KLASİK");

        Jazzliste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Jazzliste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JazzlisteMouseClicked(evt);
            }
        });
        JazzListe.setViewportView(Jazzliste);

        Jazz.setBackground(new java.awt.Color(255, 153, 102));
        Jazz.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Jazz.setText("                              JAZZ");
        Jazz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JazzActionPerformed(evt);
            }
        });

        Klasikliste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Klasikliste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlasiklisteMouseClicked(evt);
            }
        });
        KlasikListe.setViewportView(Klasikliste);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        TakipEt.setText("TAKİP ET");
        TakipEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakipEtActionPerformed(evt);
            }
        });

        TakipBirak.setText("TAKİBİ BIRAK");
        TakipBirak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakipBirakActionPerformed(evt);
            }
        });

        jButton2.setText("ÇALMA LİSTESİNE EKLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ÇALMA LİSTESİNE EKLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ÇALMA LİSTESİNE EKLE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(Pop, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(Klasik, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jazz, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(TakipEt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(TakipBirak, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(227, 227, 227)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(PopListe, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(KlasikListe, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                        .addComponent(JazzListe, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(188, 188, 188))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TakipBirak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TakipEt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jazz, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Klasik, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KlasikListe, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(JazzListe, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(PopListe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2)
                                .addComponent(jButton4))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void AramaMotoru(String username, JFrame frame) {
        try {
            Connection baglanti = SQLBaglantisi.getConnection();

            String SQLSorgusu = "SELECT  KullaniciID,KullaniciAdi,KullaniciTipAdi FROM kullanici k inner join kullanicitipi kt on k.KullaniciTipiID=kt.KullaniciTipID WHERE KullaniciAdi = '"
                    + username
                    + "'";

            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                OturumAcKullanici.KullaniciAramaAdi = resultSet.getString("KullaniciAdi");
                OturumAcKullanici.KullaniciAramaTipAdi = resultSet.getString("KullaniciTipAdi");
                OturumAcKullanici.KullaniciAramaID = resultSet.getInt("KullaniciID");

            }

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }

    }

    public void TakipciSorgulama(int userID, JFrame frame) {
        try {
            Connection baglanti = SQLBaglantisi.getConnection();

            String SQLSorgusu = "SELECT  TakipciID FROM kullanicilarintakipcileri WHERE KullaniciiID = '"
                    + userID
                    + "'";

            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()==false){
                 System.out.println("deneme");
              TakipEt.setVisible(true);
               TakipBirak.setVisible(false);
               jButton2.setVisible(false);
                jButton3.setVisible(false);
                 jButton4.setVisible(false);
            }
            else{
            while (resultSet.next()) {

                if (OturumAcKullanici.KullaniciID == resultSet.getInt("TakipciID") && OturumAcKullanici.KullaniciAramaTipAdi.equals("Premium")) {
                    System.out.println("girdi");
                    TakipEt.setVisible(false);
                    TakipBirak.setVisible(true);
                    KlasikListe.setVisible(true);
                    Klasikliste.setVisible(true);
                    PopListe.setVisible(true);
                    Popliste.setVisible(true);
                    JazzListe.setVisible(true);
                    Jazzliste.setVisible(true);
                    Pop.setVisible(true);
                    Jazz.setVisible(true);
                    Klasik.setVisible(true);

                } else{
                    System.out.println("girmedi");
                    TakipEt.setVisible(true);
                    TakipBirak.setVisible(false);
                    jButton2.setVisible(false);
                jButton3.setVisible(false);
                 jButton4.setVisible(false);
                }

            }
        }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }

    }


    private void AnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnasayfaActionPerformed
        if (OturumAcKullanici.KullaniciTipAdi.equals("Premium")) {
            new PremiumEkrani().setVisible(true);
            this.dispose();
        } else {
            new StandartEkrani().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AnasayfaActionPerformed

    private void KullaniciAramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KullaniciAramaActionPerformed
        OturumAcKullanici.KullaniciAramaAdi = KullaniciArama.getText();
        new KullaniciAramaEkran().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KullaniciAramaActionPerformed

    private void TakipçilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakipçilerActionPerformed
        if (OturumAcKullanici.KullaniciTipAdi.equals("Premium")) {
            new Takipciler().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Standart kullanıcılar için takipçi özelliği bulunmamaktadır.");
        }
    }//GEN-LAST:event_TakipçilerActionPerformed

    private void TakipEdilenlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakipEdilenlerActionPerformed
        new TakipEdilenler().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TakipEdilenlerActionPerformed

    private void TopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopActionPerformed
        new Top().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TopActionPerformed

    private void JazzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JazzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JazzActionPerformed

    private void TakipEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakipEtActionPerformed
        KlasikListe.setVisible(true);
        Klasikliste.setVisible(true);
        PopListe.setVisible(true);
        Popliste.setVisible(true);
        JazzListe.setVisible(true);
        Jazzliste.setVisible(true);
        Pop.setVisible(true);
        Jazz.setVisible(true);
        Klasik.setVisible(true);
        TakipBirak.setVisible(true);
        TakipEt.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        try {

            String SQLSorgusu = "INSERT INTO kullanicilarintakipcileri"
                    + "(KullaniciiID,TakipciID)"
                    + "VALUES (?,?)";

            baglanti = SQLBaglantisi.getConnection();
            preparedStatement = baglanti.prepareStatement(SQLSorgusu);

            preparedStatement.setInt(1, OturumAcKullanici.KullaniciAramaID);
            preparedStatement.setInt(2, OturumAcKullanici.KullaniciID);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_TakipEtActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void CalmaListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalmaListesiActionPerformed
        new CalmaListesi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CalmaListesiActionPerformed

    private void TakipBirakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakipBirakActionPerformed
        try {
            TakipEt.setVisible(true);
            KlasikListe.setVisible(false);
            Klasikliste.setVisible(false);
            PopListe.setVisible(false);
            Popliste.setVisible(false);
            JazzListe.setVisible(false);
            Jazzliste.setVisible(false);
            Pop.setVisible(false);
            Jazz.setVisible(false);
            Klasik.setVisible(false);
            TakipBirak.setVisible(false);
             jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
            String SQLSorgusu = "DELETE FROM kullanicilarintakipcileri WHERE KullaniciiID=? AND TakipciID=? ";

            baglanti = SQLBaglantisi.getConnection();
            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            preparedStatement.setInt(1, OturumAcKullanici.KullaniciAramaID);
            preparedStatement.setInt(2, OturumAcKullanici.KullaniciID);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "delete successfully");

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_TakipBirakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginForm loginForm = new LoginForm();
        OturumKapatma.oturumKapat(this, loginForm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PoplisteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoplisteMouseClicked
        DefaultTableModel model = (DefaultTableModel) Popliste.getModel();
        int selectedRowIndex = Popliste.getSelectedRow();
        try {
            String SQLSorgusu = "INSERT INTO kullanicilarincalmalisteleri"
                    + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                    + "VALUES (?,?,?)";

            baglanti = SQLBaglantisi.getConnection();
            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
            preparedStatement.setInt(2, 1);
            preparedStatement.setString(3, model.getValueAt(selectedRowIndex, 0).toString());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_PoplisteMouseClicked

    private void JazzlisteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JazzlisteMouseClicked
        DefaultTableModel model = (DefaultTableModel) Jazzliste.getModel();
        int selectedRowIndex = Jazzliste.getSelectedRow();
        try {
            String SQLSorgusu = "INSERT INTO kullanicilarincalmalisteleri"
                    + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                    + "VALUES (?,?,?)";

            baglanti = SQLBaglantisi.getConnection();
            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
            preparedStatement.setInt(2, 2);
            preparedStatement.setString(3, model.getValueAt(selectedRowIndex, 0).toString());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_JazzlisteMouseClicked

    private void KlasiklisteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlasiklisteMouseClicked
        DefaultTableModel model = (DefaultTableModel) Klasikliste.getModel();
        int selectedRowIndex = Klasikliste.getSelectedRow();
        try {
            String SQLSorgusu = "INSERT INTO kullanicilarincalmalisteleri"
                    + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                    + "VALUES (?,?,?)";

            baglanti = SQLBaglantisi.getConnection();
            preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
            preparedStatement.setInt(2, 3);
            preparedStatement.setString(3, model.getValueAt(selectedRowIndex, 0).toString());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception ex) {
            Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_KlasiklisteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) Popliste.getModel();
        ArrayList<String> numdata = new ArrayList<String>();
        ArrayList<String> numdatabir = new ArrayList<String>();
        for (int count = 0; count<model.getRowCount(); count++) {
            numdata.add(model.getValueAt(count, 0).toString());

        }

        try {
            Connection baglanti = SQLBaglantisi.getConnection();

            String SQLSorgusu = "SELECT SarkiiID FROM kullanicilarincalmalisteleri WHERE CalmaListeTurID =1 AND KullanicininID = '"
                    + OturumAcKullanici.KullaniciID
                    + "'";

            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();
             
          
            if (resultSet.next()==false){
                System.out.println("girdi");
            for(int i=0;i<numdata.size();i++){
                 
                    numdatabir.add(numdata.get(i));
        
                
                }
            
            }
            else{
                 System.out.println("girmedi");
            while (resultSet.next()) {
           
              
            
                for(int i=0;i<numdata.size();i++){
                  if(!numdata.get(i).equals(resultSet.getString("SarkiiID"))){
                    numdatabir.add(numdata.get(i));
             
                  }
                
                }
                
            

            }
        }
            System.out.println(numdata);
              System.out.println(numdatabir);
            
            for (int i = 0; i < numdata.size(); i++) {
                String SQLSorgusu1 = "INSERT INTO kullanicilarincalmalisteleri"
                        + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                        + "VALUES (?,?,?)";

                baglanti = SQLBaglantisi.getConnection();
                preparedStatement = baglanti.prepareStatement(SQLSorgusu1);
                preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
                preparedStatement.setInt(2, 1);
                preparedStatement.setString(3, numdatabir.get(i));
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "inserted successfully");

            }

        } catch (Exception ex) {
          //  Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       DefaultTableModel model = (DefaultTableModel) Jazzliste.getModel();
        ArrayList<String> numdata = new ArrayList<String>();
        ArrayList<String> numdatabir = new ArrayList<String>();
        for (int count = 0; count<model.getRowCount(); count++) {
            numdata.add(model.getValueAt(count, 0).toString());

        }

        try {
            Connection baglanti = SQLBaglantisi.getConnection();

            String SQLSorgusu = "SELECT SarkiiID FROM kullanicilarincalmalisteleri WHERE CalmaListeTurID =2 AND KullanicininID = '"
                    + OturumAcKullanici.KullaniciID
                    + "'";

            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();
           if (resultSet.next()==false){
                System.out.println("girdi");
            for(int i=0;i<numdata.size();i++){
                 
                    numdatabir.add(numdata.get(i));
        
                
                }
            
            }
            else{
                 System.out.println("girmedi");
            while (resultSet.next()) {
           
                for(int i=0;i<numdata.size();i++){
                  if(!numdata.get(i).equals(resultSet.getString("SarkiiID"))){
                    numdatabir.add(numdata.get(i));
             
                  }
                
                }
                
            

            }
           }
            System.out.println(numdata);
              System.out.println(numdatabir);
            
            for (int i = 0; i < numdata.size(); i++) {
                String SQLSorgusu1 = "INSERT INTO kullanicilarincalmalisteleri"
                        + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                        + "VALUES (?,?,?)";

                baglanti = SQLBaglantisi.getConnection();
                preparedStatement = baglanti.prepareStatement(SQLSorgusu1);
                preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
                preparedStatement.setInt(2, 2);
                preparedStatement.setString(3, numdatabir.get(i));
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "inserted successfully");

            }

        } catch (Exception ex) {
          //  Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       DefaultTableModel model = (DefaultTableModel) Klasikliste.getModel();
        ArrayList<String> numdata = new ArrayList<String>();
        ArrayList<String> numdatabir = new ArrayList<String>();
        for (int count = 0; count<model.getRowCount(); count++) {
            numdata.add(model.getValueAt(count, 0).toString());

        }

        try {
            Connection baglanti = SQLBaglantisi.getConnection();

            String SQLSorgusu = "SELECT SarkiiID FROM kullanicilarincalmalisteleri WHERE CalmaListeTurID =3 AND KullanicininID = '"
                    + OturumAcKullanici.KullaniciID
                    + "'";

            PreparedStatement preparedStatement = baglanti.prepareStatement(SQLSorgusu);
            ResultSet resultSet = preparedStatement.executeQuery();
              if (resultSet.next()==false){
                System.out.println("girdi");
            for(int i=0;i<numdata.size();i++){
                 
                    numdatabir.add(numdata.get(i));
        
                
                }
            
            }
            else{
                 System.out.println("girmedi");
            while (resultSet.next()) {
            System.out.println(resultSet.getString("SarkiiID"));
                for(int i=0;i<numdata.size();i++){
                  if(!numdata.get(i).equals(resultSet.getString("SarkiiID"))){
                    numdatabir.add(numdata.get(i));
             
                  }
                
                }
                
            

            }
              }
            System.out.println(numdata);
              System.out.println(numdatabir);
            
            for (int i = 0; i < numdata.size(); i++) {
                String SQLSorgusu1 = "INSERT INTO kullanicilarincalmalisteleri"
                        + "(KullanicininID,CalmaListeTurID,SarkiiID)"
                        + "VALUES (?,?,?)";

                baglanti = SQLBaglantisi.getConnection();
                preparedStatement = baglanti.prepareStatement(SQLSorgusu1);
                preparedStatement.setInt(1, OturumAcKullanici.KullaniciID);
                preparedStatement.setInt(2, 3);
                preparedStatement.setString(3, numdatabir.get(i));
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "inserted successfully");

            }

        } catch (Exception ex) {
          //  Logger.getLogger(KullaniciAramaEkran.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullaniciAramaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciAramaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciAramaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciAramaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciAramaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anasayfa;
    private javax.swing.JButton CalmaListesi;
    private javax.swing.JTextField Jazz;
    private javax.swing.JScrollPane JazzListe;
    private javax.swing.JTable Jazzliste;
    private javax.swing.JTextField Klasik;
    private javax.swing.JScrollPane KlasikListe;
    private javax.swing.JTable Klasikliste;
    private javax.swing.JLabel KullaniciAdi;
    private javax.swing.JTextField KullaniciArama;
    private javax.swing.JLabel KullaniciTipAdi;
    private javax.swing.JTextField Pop;
    private javax.swing.JScrollPane PopListe;
    private javax.swing.JTable Popliste;
    private javax.swing.JButton TakipBirak;
    private javax.swing.JButton TakipEdilenler;
    private javax.swing.JButton TakipEt;
    private javax.swing.JButton Takipçiler;
    private javax.swing.JButton Top;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
