/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DaoClasse.EvenementDAO;
import DaoClasse.GalerieDao;
import DaoClasse.PrestataireDao;
import DaoInterface.IEvenementDAO;
import DaoInterface.IGalerieDao;
import DaoInterface.IPrestataireDao;
import Entites.Evenement;
import Entites.Galerie;
import Entites.Prestataire;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author GaiaDev
 */
public class CreeEvenement extends javax.swing.JFrame {

    /**
     * Creates new form CreeEvenement
     */ 
        Float prixEvenet = null;
        Evenement event ;
        IEvenementDAO eventDAO = new EvenementDAO();
        IPrestataireDao presDAO = new PrestataireDao();
        List<Prestataire> prestataires = new ArrayList<>();
        
              
                           IGalerieDao iGal = new GalerieDao();
        Galerie gal = new Galerie();
        String completeFileName="C:\\Users\\user\\Documents\\NetBeansProjects\\3a18eventothecoders\\src\\img\\No_Image.gif";
        
            

            
                public static BufferedImage resize(BufferedImage image, int width, int height) {
    BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
    Graphics2D g2d = (Graphics2D) bi.createGraphics();
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(image, 0, 0, width, height, null);
    g2d.dispose();
    return bi;
}

        

        
    public CreeEvenement() {
           initComponents();
          setBounds(300, 100, 996, 613);
       prestataires = presDAO.retrieveAllPrestataire();
       EvenementDAO eventDAO = new EvenementDAO();
       
            jComboBox1.addItem(null);
        for (Prestataire prestataire : prestataires) {
            jComboBox1.addItem(prestataire.getNom());
        }
        
        ButtonGroup groupButton = new ButtonGroup();
        groupButton.add(publicRadioButton);
        groupButton.add(priveRadioButton);
        publicRadioButton.setSelected(true);
        ButtonGroup groupButtonGP = new ButtonGroup();
        groupButtonGP.add(PayantradioButton);
        groupButtonGP.add(jRadioGratuit);
        publicRadioButton.setSelected(true);
        
        
               
            BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResource("/img/No_Image.gif"));
            BufferedImage resizedImage=resize(image,jLabel7.getWidth(),jLabel7.getHeight());//resize the image to 100x100
            ImageIcon iv=new ImageIcon(resizedImage);
             jLabel7.setIcon(iv);
        } catch (IOException ex) {
            Logger.getLogger(CreeEvenement.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
       
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jRadioGratuit = new javax.swing.JRadioButton();
        PayantradioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prix = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        publicRadioButton = new javax.swing.JRadioButton();
        priveRadioButton = new javax.swing.JRadioButton();
        ajouterButton = new javax.swing.JButton();
        jComboBoxCaateg = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crée votre évenement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 0, 255)));
        jPanel1.setLayout(null);

        jLabel1.setText("Nom");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 35, 60, 14);

        jLabel2.setText("Adresse");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 66, 70, 14);

        jLabel3.setText("Date debut ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 108, 90, 14);

        jLabel4.setText("Date fin");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(16, 146, 110, 14);

        jLabel10.setText("Description de l'évenement");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(16, 194, 150, 14);

        jLabel11.setText("Choisir un prestataire");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(16, 274, 103, 14);

        description.setColumns(20);
        description.setRows(5);
        description.setName("descriptionEvent"); // NOI18N
        jScrollPane3.setViewportView(description);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(198, 193, 451, 60);

        jRadioGratuit.setText("Gratuit");
        jRadioGratuit.setName("gratuit"); // NOI18N
        jRadioGratuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGratuitActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioGratuit);
        jRadioGratuit.setBounds(198, 309, 59, 23);

        PayantradioButton.setText("Payant");
        PayantradioButton.setName("payant"); // NOI18N
        PayantradioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayantradioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PayantradioButton);
        PayantradioButton.setBounds(297, 309, 59, 23);

        jLabel12.setText("Type de l'évenement");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(28, 353, 166, 14);

        jLabel5.setText("prix");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(28, 384, 96, 14);

        prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixActionPerformed(evt);
            }
        });
        jPanel1.add(prix);
        prix.setBounds(198, 381, 451, 30);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(198, 32, 451, 30);
        jPanel1.add(adresse);
        adresse.setBounds(200, 70, 451, 30);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(198, 271, 451, 20);

        publicRadioButton.setText("Public");
        publicRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicRadioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(publicRadioButton);
        publicRadioButton.setBounds(477, 309, 53, 23);

        priveRadioButton.setText("Prive");
        jPanel1.add(priveRadioButton);
        priveRadioButton.setBounds(566, 309, 49, 23);

        ajouterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-bravo-bleu1.png"))); // NOI18N
        ajouterButton.setText("Créer Evènement");
        ajouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ajouterButton);
        ajouterButton.setBounds(240, 480, 170, 40);

        jComboBoxCaateg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Musique", "Sport", "Art", "Professionel", "Meeting", "Food", "others" }));
        jComboBoxCaateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCaategActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxCaateg);
        jComboBoxCaateg.setBounds(198, 350, 451, 20);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1424819742_arrow_return_down_left.png"))); // NOI18N
        jButton7.setText("Retour");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(430, 480, 180, 40);

        jButton1.setText("IMAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(720, 30, 240, 370);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(200, 110, 450, 20);
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(200, 150, 450, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void ajouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterButtonActionPerformed
        String categorie = (String) jComboBoxCaateg.getSelectedItem();
        String radiobutton ;
        if (publicRadioButton.isSelected()){
            radiobutton = "public"; } else {
            radiobutton = "prive";
        }
        prixEvenet=Float.parseFloat(prix.getText());
        event = new Evenement(name.getText(), adresse.getText(),jDateChooser1.getDate(),jDateChooser2.getDate(),radiobutton,description.getText() ,
                prixEvenet,Authentification.c, categorie);
        eventDAO.insertEvenement(event);
        JOptionPane.showMessageDialog(rootPane, "création effectué ");
        this.setVisible(false);
        new AfficherEvenements().setVisible(true);
        
        
        event.setId_event(eventDAO.retrievEventIdMax());
              gal.setType(0);
              System.out.println(completeFileName.substring(11));
        gal.setUrl(completeFileName.substring(11));
        gal.setEvent(event);
            System.out.println(gal);
         iGal.insertPicture(gal);
        
        
    }//GEN-LAST:event_ajouterButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
       
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBoxCaategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCaategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCaategActionPerformed

    private void publicRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicRadioButtonActionPerformed

    private void PayantradioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayantradioButtonActionPerformed
        // TODO add your handling code here:
         if (PayantradioButton.isSelected()){
        
        prix.setVisible(true);
        jLabel5.setVisible(true);
        } 
      
    }//GEN-LAST:event_PayantradioButtonActionPerformed

    private void jRadioGratuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGratuitActionPerformed
        // TODO add your handling code here:
         if (jRadioGratuit.isSelected()){
        prixEvenet=null;
        prix.setVisible(false);
        jLabel5.setVisible(false);
        } 
       
    }//GEN-LAST:event_jRadioGratuitActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new AcceuilClient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();//création dun nouveau filechosser
        chooser.setApproveButtonText("Choix du fichier..."); //intitulé du bouton
        chooser.setMultiSelectionEnabled(true) ;

        chooser.setFileFilter(new FileFilter() {

            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                final String name = f.getName();
                return name.endsWith(".png") || name.endsWith(".jpg");
            }

            public String getDescription() {
                return "*.png,*.jpg";
            }

        });
        chooser.showOpenDialog(null); //affiche la boite de dialogue

     completeFileName=chooser.getSelectedFile().getAbsolutePath();
     //   File[] fs=chooser.getSelectedFiles();
       // for( int i = 0; i<fs.length; ++i){
            // nom du fichier
         //   fs[i].getName();
            // chemin absolu du fichier
           // String completeFileName =  fs[i].getAbsolutePath();

 BufferedImage image;
        try {
            image = ImageIO.read(new File(completeFileName));
            BufferedImage resizedImage=resize(image,jLabel7.getWidth(),jLabel7.getHeight());//resize the image to 100x100
            ImageIcon iv=new ImageIcon(resizedImage);
             jLabel7.setIcon(iv);
        } catch (IOException ex) {
            Logger.getLogger(CreeEvenement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreeEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreeEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreeEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreeEvenement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreeEvenement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PayantradioButton;
    private javax.swing.JTextField adresse;
    private javax.swing.JButton ajouterButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBoxCaateg;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioGratuit;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton priveRadioButton;
    private javax.swing.JTextField prix;
    private javax.swing.JRadioButton publicRadioButton;
    // End of variables declaration//GEN-END:variables

}