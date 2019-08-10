import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class SUNSUN extends javax.swing.JFrame {
    int n1,n2,n3,n4,total=0;
    static int tot=0;
    Zomato z = new Zomato();
    String s3;
    public SUNSUN() {
        initComponents();
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME TO  KFC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/burger1.jpeg"))); // NOI18N
        jLabel2.setText("Burger");
        jLabel2.setIconTextGap(50);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 200, 340, 140);

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setForeground(jLabel2.getForeground());
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/french1.jpg"))); // NOI18N
        jLabel3.setText("French Fries");
        jLabel3.setBorder(jLabel2.getBorder());
        jLabel3.setIconTextGap(50);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 360, 110);

        jLabel5.setBackground(jLabel1.getBackground());
        jLabel5.setFont(jLabel2.getFont());
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/superpack1.jpg"))); // NOI18N
        jLabel5.setText("Jumbo pack");
        jLabel5.setBorder(jLabel2.getBorder());
        jLabel5.setIconTextGap(50);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 340, 370, 130);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner1(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(430, 120, 40, 30);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner2(evt);
            }
        });
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(430, 260, 40, 30);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner3(evt);
            }
        });
        getContentPane().add(jSpinner3);
        jSpinner3.setBounds(430, 380, 40, 30);

        jButton1.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 167, 231));
        jButton1.setText("order");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 560, 90, 23);

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        jLabel6.setText(" 0 ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 120, 50, 30);

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(530, 260, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 2, 24)); // NOI18N
        jLabel9.setText("0");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 380, 50, 40);

        jLabel7.setFont(jLabel2.getFont());
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/nudgpop.jpg"))); // NOI18N
        jLabel7.setText("NUGGET POPCORN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 460, 410, 120);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SPINNER4(evt);
            }
        });
        getContentPane().add(jSpinner4);
        jSpinner4.setBounds(450, 500, 40, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel10.setText("0");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(530, 490, 70, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 30, 80, 30);

        jButton3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("@logout");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 30, 110, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("confirm");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(260, 600, 90, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 550, 180, 96);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dishes/kfc/wbg3.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, -90, 680, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void order(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order
      
       total = (n1*30)+(n2*40)+(n3*25)+(n4*125);
       
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

    private void spinner1(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner1
         n1= (Integer)jSpinner1.getValue();
                jLabel6.setText(String.valueOf(n1*30));
    }//GEN-LAST:event_spinner1

    private void spinner2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner2
         n2 = (Integer)jSpinner2.getValue();
                jLabel8.setText(String.valueOf(n2*40));
    }//GEN-LAST:event_spinner2

    private void spinner3(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner3
       n3 = (Integer)jSpinner3.getValue();
                jLabel9.setText(String.valueOf(n3*25));
    }//GEN-LAST:event_spinner3

    private void SPINNER4(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SPINNER4
       n4 = (Integer)jSpinner4.getValue();
                jLabel10.setText(String.valueOf(n4*125));
    }//GEN-LAST:event_SPINNER4

    private void back(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back
        dispose();
        new NewFrame().setVisible(true);
                
    }//GEN-LAST:event_back

    private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
        dispose();
        new Zomato().setVisible(true);
    }//GEN-LAST:event_logout

    private void confirm(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm
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
    }//GEN-LAST:event_confirm
    
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
            java.util.logging.Logger.getLogger(SUNSUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUNSUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUNSUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUNSUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               SUNSUN s= new SUNSUN();
               s.setVisible(true);
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
