
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class NOVOTEL extends javax.swing.JFrame {

    
    Zomato z = new Zomato();
    int n1,n2,n3,n4;
    int total;
    String s3;
    
    public NOVOTEL() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 590));
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resizd novotel/prawns.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 100, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resizd novotel/veg bir.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 180, 149, 95);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resizd novotel/biriyanu-1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 280, 149, 92);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resizd novotel/icecream.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 380, 149, 113);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setText("Pepper Crab");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(257, 124, 135, 25);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel6.setText("Veg Biryani");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(257, 207, 98, 25);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setText("Chicken Biryani");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 299, 152, 25);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel8.setText("Ice Cream");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(271, 397, 84, 25);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner1(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(420, 125, 49, 30);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner2(evt);
            }
        });
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(420, 208, 49, 30);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner3(evt);
            }
        });
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(420, 300, 49, 30);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner4(evt);
            }
        });
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(420, 398, 49, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(528, 130, 75, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("0");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(528, 213, 151, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("0");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(528, 305, 75, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("0");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(528, 403, 75, 17);

        jLabel13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel13.setText("WELCOME TO NOVOTEL");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(180, 40, 378, 33);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 510, 114, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("order");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 483, 100, 20);

        jButton3.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("<Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 60, 90, 25);

        jButton4.setFont(new java.awt.Font("Tekton Pro", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("@Logout");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(490, 70, 110, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 456, 170, 90);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/wbg2.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 10, 630, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Spinner1(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner1
        
        n1= (Integer)jSpinner1.getValue();
        jLabel9.setText(String.valueOf(n1*180));
    }//GEN-LAST:event_Spinner1

    private void Spinner2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner2
    
        n2= (Integer)jSpinner2.getValue();
        jLabel10.setText(String.valueOf(n2*210));
    }//GEN-LAST:event_Spinner2

    private void Spinner3(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner3
        
        n3= (Integer)jSpinner3.getValue();
        jLabel11.setText(String.valueOf(n3*250));
    }//GEN-LAST:event_Spinner3

    private void Spinner4(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner4
        
        n4= (Integer)jSpinner4.getValue();
        jLabel12.setText(String.valueOf(n4*120));
    }//GEN-LAST:event_Spinner4

    private void Submit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Submit
        try
        {
            
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1494");
			String s1 = z.iid;
                        
                        String query1 = "use test";
                       Statement st = con.createStatement();
                       ResultSet r = st.executeQuery(query1);
                       ResultSet rs = st.executeQuery("select address from valid where id ='"+s1+"'");
                       rs.next();
                       String s2 = rs.getString("address");
                       PreparedStatement ps = con.prepareStatement("insert into orders values(?,?,?)");
                       ps.setString(1, s1);
                       ps.setString(2,s2);
                       ps.setInt(3,total);
                       ps.executeUpdate();
                       
                       JOptionPane.showMessageDialog(null,"Order confirmed your food is on your way");
                       dispose();
                       new NewFrame().setVisible(true);
                       
        }
        catch(Exception e)
        {}
      
    }//GEN-LAST:event_Submit

    private void order(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order
        total = (n1*180)+(n2*210)+(n3*250)+(n4*120);
          try
        {
            
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1494");
			String s1 = z.iid;
                        
                        String query2 = "use test";
                       Statement st1 = con.createStatement();
                       ResultSet r1 = st1.executeQuery(query2);
                       ResultSet rs2 = st1.executeQuery("select address from valid where id ='"+s1+"'");
                       rs2.next();
                       String s3 = rs2.getString("address");
        jTextArea1.setText("username:"+z.iid+"\n total bill is"+total+"\n "+s3);
    }//GEN-LAST:event_order

          catch(Exception e){}
    }
    private void back(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back
        dispose();
        new NewFrame().setVisible(true);
    }//GEN-LAST:event_back

    private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
        dispose();
        new Zomato().setVisible(true);
    }//GEN-LAST:event_logout

    
    
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
            java.util.logging.Logger.getLogger(NOVOTEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NOVOTEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NOVOTEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NOVOTEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NOVOTEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
