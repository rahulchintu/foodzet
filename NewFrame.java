
public class NewFrame extends java.awt.Frame {

    
    public NewFrame() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(400, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotels/taj1.jpg"))); // NOI18N
        jLabel1.setText("HOTEL TAJ BANJARA");
        jLabel1.setIconTextGap(60);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWAGATH(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(90, 80, 450, 110);

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("HOTELS");
        add(jLabel2);
        jLabel2.setBounds(260, 30, 120, 20);

        jLabel3.setFont(jLabel2.getFont());
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotels/nov1.png"))); // NOI18N
        jLabel3.setText("NOVOTEL");
        jLabel3.setIconTextGap(jLabel1.getIconTextGap());
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novotel(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(90, 180, 410, 100);

        jLabel4.setFont(jLabel2.getFont());
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotels/kfc1.png"))); // NOI18N
        jLabel4.setText("KFC");
        jLabel4.setIconTextGap(jLabel1.getIconTextGap());
        jLabel4.setMinimumSize(new java.awt.Dimension(600, 600));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kfc(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(90, 290, 520, 90);
        add(jScrollPane1);
        jScrollPane1.setBounds(410, 210, 2, 2);
        add(jScrollPane2);
        jScrollPane2.setBounds(220, 150, 2, 2);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 50, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5star1.png"))); // NOI18N
        jLabel5.setText("Rating");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(jLabel5);
        jLabel5.setBounds(320, 140, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4 star1.png"))); // NOI18N
        jLabel6.setText("Rating");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(jLabel6);
        jLabel6.setBounds(310, 250, 110, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3 star.png"))); // NOI18N
        jLabel7.setText("Rating");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(jLabel7);
        jLabel7.setBounds(310, 350, 110, 14);

        jLabel9.setFont(jLabel2.getFont());
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotels/MC2.png"))); // NOI18N
        jLabel9.setText("MC DONALDS");
        jLabel9.setIconTextGap(jLabel1.getIconTextGap());
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mcdonalds(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(140, 400, 320, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4 star1.png"))); // NOI18N
        jLabel8.setText("Rating");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(jLabel8);
        jLabel8.setBounds(310, 450, 110, 14);

        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 102));
        jButton2.setText("@Logout");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(480, 70, 100, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/wbg2.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setMaximumSize(new java.awt.Dimension(844, 700));
        jLabel10.setMinimumSize(new java.awt.Dimension(800, 800));
        add(jLabel10);
        jLabel10.setBounds(0, 4, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void SWAGATH(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWAGATH
        new SWAGATH().setVisible(true);
        dispose();
    }//GEN-LAST:event_SWAGATH

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kfc(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kfc
        new SUNSUN().setVisible(true);
        dispose();
    }//GEN-LAST:event_kfc

    private void novotel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novotel
        dispose();
      new   NOVOTEL().setVisible(true);
    }//GEN-LAST:event_novotel

    private void mcdonalds(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcdonalds
       dispose();
       new MCDO().setVisible(true);
    }//GEN-LAST:event_mcdonalds

    private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
        dispose();
        new Zomato().setVisible(true);
    }//GEN-LAST:event_logout

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
