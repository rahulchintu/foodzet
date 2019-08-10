import java.sql.*;
import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;


public class Register extends java.awt.Frame {


    public Register() {
        initComponents();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(634, 416));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");
        add(jLabel1);
        jLabel1.setBounds(180, 40, 160, 22);

        jLabel2.setFont(jLabel1.getFont());
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("username");
        add(jLabel2);
        jLabel2.setBounds(100, 90, 120, 22);
        add(jTextField1);
        jTextField1.setBounds(280, 90, 140, 30);

        jLabel3.setFont(jLabel1.getFont());
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("password");
        add(jLabel3);
        jLabel3.setBounds(100, 130, 90, 20);

        jLabel4.setFont(jLabel2.getFont());
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        add(jLabel4);
        jLabel4.setBounds(110, 170, 80, 22);
        add(jTextField3);
        jTextField3.setBounds(280, 170, 140, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1);
        jPasswordField1.setBounds(280, 130, 140, 30);

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(210, 310, 90, 23);

        jLabel5.setFont(jLabel1.getFont());
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No");
        add(jLabel5);
        jLabel5.setBounds(100, 210, 90, 22);
        add(jTextField2);
        jTextField2.setBounds(280, 210, 140, 30);
        add(jTextField4);
        jTextField4.setBounds(280, 260, 140, 30);

        jLabel6.setFont(jLabel2.getFont());
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        add(jLabel6);
        jLabel6.setBounds(110, 260, 90, 22);

        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jButton2.setText("<Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(20, 50, 80, 23);

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 15)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reg2.jpg"))); // NOI18N
        jLabel7.setText("<Back");
        add(jLabel7);
        jLabel7.setBounds(-120, 10, 750, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void button1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1
      try{
        String s1 = jTextField1.getText();
      String s2 = jPasswordField1.getText();
      String s3 = jTextField3.getText();
      String s4 = jTextField2.getText();
      String s5 = jTextField4.getText();
      
      
      
     int f=0;
          if(s3.contains("@gmail.com"))
              f =1;
      
      Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1494");
    Statement st = con.createStatement();
    ResultSet r1 = st.executeQuery("use test");
    PreparedStatement ps = con.prepareStatement("insert into valid values(?,?,?,?,?)");
    Statement stt = con.createStatement();
    ResultSet r2 = stt.executeQuery("select count(*) from valid where id in(select id from valid where id = '"+s1 +"')");
    
  
   
    int n;
    r2.next();
    n =r2.getInt(1);
    if(n!=0)
    {
        JOptionPane.showMessageDialog(null,"username not available!");
    }
   
  
   
    else
    {
    if(s1.length()==0||s1.length()>10)
    {
        JOptionPane.showMessageDialog(null,"check yor user name");
    }
    
    else if(s2.equals(""))
    {
        JOptionPane.showMessageDialog(null,"invalid password");
    }
   
    else if(s3.length()==0 || f==0 || s3.length()<=10)
    {
        System.out.println(s3.length());
        //JOptionPane.showMessageDialog(null,"check mail");
        JOptionPane.showMessageDialog(null,"invalid mail");
    }
    else if(s4==null || s4.length()<10)
    {
        JOptionPane.showMessageDialog(null,"invalid Phone number");
    }
    else if(s5.length()==0)
    {
        //System.out.println(s5.length());
        JOptionPane.showMessageDialog(null,"invalid Adress");
    }
    
    
    else
    {
    ps.setString(1,s1);
    ps.setString(2,s2);
    ps.setString(3,s3);
    ps.setString(4,s4);
    ps.setString(5,s5);
    ps.executeUpdate();
    System.out.println("success");
    dispose();
    new Zomato().setVisible(true);
    }
      }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
 
    }//GEN-LAST:event_button1

    private void back(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back
        dispose();
        new Zomato().setVisible(true);
    }//GEN-LAST:event_back

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
