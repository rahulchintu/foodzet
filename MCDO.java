
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MCDO extends javax.swing.JFrame {

    Zomato z = new Zomato();
    int n1,n2,n3,n4;
    int total;
    String s3;
    
    public MCDO() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(590, 560));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resized mcdon/burger.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 130, 90);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setText("Mcdonald's Burger");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 110, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resized mcdon/chickensoup.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 130, 80);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setText("Chicken soup");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 210, 190, 30);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setText("Pizza");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 300, 70, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resized mcdon/pizza3.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 270, 130, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/resized mcdon/chapata.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 350, 130, 100);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel8.setText("Mcdonald's Chapata");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 390, 180, 20);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner1(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(390, 110, 40, 30);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner2(evt);
            }
        });
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(390, 210, 40, 30);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner3(evt);
                Spinner4(evt);
            }
        });
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(390, 290, 40, 30);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner4(evt);
            }
        });
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(390, 390, 40, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 120, 70, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("0");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 204, 80, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("0");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 284, 90, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("0");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 380, 80, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("WELCOME TO MCDONALD'S");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(120, 10, 490, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Submit(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 470, 110, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("order");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 440, 90, 23);

        jButton3.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("<Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(50, 40, 90, 25);

        jButton4.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("@Logout");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 50, 100, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 430, 190, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/wbg2.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 4, 590, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void Spinner1(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner1
       
       n1= (Integer)jSpinner1.getValue();
        jLabel9.setText(String.valueOf(n1*110));
        
    }//GEN-LAST:event_Spinner1

    private void Spinner2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner2
      
         n2= (Integer)jSpinner2.getValue();
        jLabel10.setText(String.valueOf(n2*130));
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void order(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order
         total = (n1*110)+(n2*130)+(n3*250)+(n4*120);
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
    }                      
catch(Exception e){}
    
         
    }//GEN-LAST:event_order

    private void back(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back
        dispose();
        new NewFrame().setVisible(true);
    }//GEN-LAST:event_back

    private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
        dispose();
        new Zomato().setVisible(true);
    }//GEN-LAST:event_logout

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MCDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCDO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCDO().setVisible(true);
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
