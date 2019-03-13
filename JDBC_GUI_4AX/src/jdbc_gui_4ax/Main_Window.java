/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_gui_4ax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Main_Window extends javax.swing.JFrame {
        
    
        Connection con=null;
        PreparedStatement stmt_selectALL=null;
        PreparedStatement stmt_add=null;
        ResultSet res_selectAll=null;
   
    /**
     * Creates new form Main_Window
     */
        
    public Main_Window() {
        initComponents();
        
        try { 
           Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
           System.out.println("Datenbank kann nicht geladen werden.");
           
        javax.swing.JOptionPane.showMessageDialog(this, "Datenbank kann nicht geladen werden.");
        System.exit(1);
       }
        
        //Select 
       
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Server = new javax.swing.JLabel();
        Port = new javax.swing.JLabel();
        Connect = new javax.swing.JButton();
        Disconnect = new javax.swing.JButton();
        Server_INPUT = new javax.swing.JTextField();
        Port_INPUT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtEName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtComm = new javax.swing.JTextField();
        txtJob = new javax.swing.JTextField();
        btnAddEmployee = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        nachVorne = new javax.swing.JButton();
        Zurück = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMgr = new javax.swing.JTextField();
        txtDeptno = new javax.swing.JTextField();
        txtHiredate = new javax.swing.JTextField();
        User = new javax.swing.JLabel();
        Database = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Server.setText("Server");

        Port.setText("Port");

        Connect.setText("Connect");
        Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectActionPerformed(evt);
            }
        });

        Disconnect.setText("Disconnect");
        Disconnect.setEnabled(false);
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });

        Server_INPUT.setText("localhost");
        Server_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Server_INPUTActionPerformed(evt);
            }
        });

        Port_INPUT.setText("3306");

        jLabel1.setText("ID");

        jLabel2.setText("EName");

        jLabel3.setText("Salary");

        jLabel4.setText("Comm");

        jLabel5.setText("Job");

        txtID.setEditable(false);
        txtID.setText("      ");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtEName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtENameActionPerformed(evt);
            }
        });

        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        nachVorne.setText(">");
        nachVorne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nachVorneActionPerformed(evt);
            }
        });

        Zurück.setText("<");
        Zurück.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückActionPerformed(evt);
            }
        });

        jLabel6.setText("Custom SQL Statement for SELECT");

        jTextField3.setText("scott");

        jLabel7.setText("Mgr");

        jLabel8.setText("Deptno");

        jLabel9.setText("Hiredate");

        User.setText("User");

        Database.setText("Database");

        Password.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Server)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Server_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Port)
                                                .addGap(18, 18, 18)
                                                .addComponent(Port_INPUT)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(User, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtComm, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(txtJob)
                                            .addComponent(txtEName)
                                            .addComponent(txtSalary)
                                            .addComponent(txtID)
                                            .addComponent(txtMgr)
                                            .addComponent(txtDeptno))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Database)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Connect, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Disconnect, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nachVorne)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Zurück))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnClear)
                                        .addGap(13, 13, 13))
                                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtHiredate)
                        .addGap(314, 314, 314))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Disconnect))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Server)
                                    .addComponent(Server_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Connect)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(User)
                                    .addComponent(Database))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Port)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Port_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Password)))))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nachVorne)
                            .addComponent(Zurück))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMgr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectActionPerformed
        try{
         con = DriverManager.getConnection("jdbc:mysql://" + Server_INPUT.getText() + ":3306/1819_4ax_antoniojakova_scott","root", "");
         Connect.setEnabled(false);
         Disconnect.setEnabled(true);
         Server_INPUT.setEnabled(false);
        }
        
        catch(SQLException ex){
            System.out.println("Verbindung mit der Datenbank konnte nicht hergestellt werden.");
            javax.swing.JOptionPane.showMessageDialog(this, "Datenbank kann nicht geladen werden.");
            
        }
         try {
        stmt_selectALL = con.prepareStatement("SELECT * FROM EMP");
        res_selectAll= stmt_selectALL.executeQuery();
        
        if(res_selectAll.next()){
        int empno= res_selectAll.getInt("Empno");
        String Ename = res_selectAll.getString("Ename");
        int salary = res_selectAll.getInt("Sal");
        String job = res_selectAll.getString("Job");
        double comm = res_selectAll.getInt("Comm");
        int mgr=res_selectAll.getInt("Mgr");
        String hiredate=res_selectAll.getString("Hiredate");
        int deptno=res_selectAll.getInt("Deptno");
        
        
        txtID.setText(""+empno);
        txtEName.setText(Ename);
        txtSalary.setText(""+salary);
        txtJob.setText(job);
        txtComm.setText(""+comm);
        txtMgr.setText(""+mgr);
        txtHiredate.setText(hiredate);
        txtDeptno.setText(""+deptno);
        
        
        }
        
            stmt_add =con.prepareStatement(
                "INSERT INTO EMP (Ename,salary,job,comm,mgr,hiredate,deptno) values(?,?,?,?,?,?,?)"
            );

        }catch(SQLException ex){
             System.out.println("konnte nicht gemacht werden.");
             javax.swing.JOptionPane.showMessageDialog(this, "Selekt kann nicht gemacht werden.");
        }
        
    }//GEN-LAST:event_ConnectActionPerformed

    private void Server_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Server_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Server_INPUTActionPerformed

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
         try{
        con.close();
      
         Connect.setEnabled(true);
         Disconnect.setEnabled(true);
         Server_INPUT.setEnabled(false);
        }
        
        catch(SQLException ex){
            System.out.println("Verbindung mit der Datenbank konnte nicht hergestellt werden.");
            javax.swing.JOptionPane.showMessageDialog(this, "Datenbank kann nicht geladen werden.");
            
        }
    }//GEN-LAST:event_DisconnectActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtENameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtENameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtENameActionPerformed

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void nachVorneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nachVorneActionPerformed
         try {
        if(res_selectAll.next()){
        int empno= res_selectAll.getInt("Empno");
        String Ename = res_selectAll.getString("Ename");
        int salary = res_selectAll.getInt("Sal");
        String job = res_selectAll.getString("Job");
        double comm = res_selectAll.getInt("Comm");
        int mgr=res_selectAll.getInt("Mgr");
        String hiredate=res_selectAll.getString("Hiredate");
        int deptno=res_selectAll.getInt("Deptno");
        
        
        txtID.setText(""+empno);
        txtEName.setText(Ename);
        txtSalary.setText(""+salary);
        txtJob.setText(job);
        txtComm.setText(""+comm);
        txtMgr.setText(""+mgr);
        txtHiredate.setText(hiredate);
        txtDeptno.setText(""+deptno);
        
        
        
        }else{
            res_selectAll.beforeFirst();
        }
        
        }catch(SQLException ex){
             System.out.println("konnte nicht gemacht werden.");
             javax.swing.JOptionPane.showMessageDialog(this, "Select kann nicht gemacht werden.");
        }
    }//GEN-LAST:event_nachVorneActionPerformed

    private void ZurückActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückActionPerformed
 try {
           if(res_selectAll.previous()){
       int empno= res_selectAll.getInt("Empno");
        String Ename = res_selectAll.getString("Ename");
        int salary = res_selectAll.getInt("Sal");
        String job = res_selectAll.getString("Job");
        double comm = res_selectAll.getInt("Comm");
        int mgr=res_selectAll.getInt("Mgr");
        String hiredate=res_selectAll.getString("Hiredate");
        int deptno=res_selectAll.getInt("Deptno");
        
        
        txtID.setText(""+empno);
        txtEName.setText(Ename);
        txtSalary.setText(""+salary);
        txtJob.setText(job);
        txtComm.setText(""+comm);
        txtMgr.setText(""+mgr);
        txtHiredate.setText(hiredate);
        txtDeptno.setText(""+deptno);
        
        }else{
            res_selectAll.afterLast();
        }
        
        }catch(SQLException ex){
             System.out.println("konnte nicht gemacht werden.");
             javax.swing.JOptionPane.showMessageDialog(this, "Select kann nicht gemacht werden.");
        }        
    }//GEN-LAST:event_ZurückActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtID.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
       //Werte von Textfields in Variablen speichern.
       //Parameter an ein ADD
       //Statement ausführen
       //Fehlermeldung,wenn es kein Add gegeben hat.
       try{
       stmt_add.setString(1, txtEName.getText());
       stmt_add.setString(2, txtSalary.getText());
       int comm=Integer.parseInt(txtComm.getText());
       stmt_add.setInt(3, comm);
       stmt_add.setString(4, txtJob.getText());
       
       
       int mgr=Integer.parseInt(txtMgr.getText());
       stmt_add.setInt(5, mgr);
         int deptno=Integer.parseInt(txtDeptno.getText());
       stmt_add.setInt(6, deptno);
       
       stmt_add.setString(7, txtHiredate.getText());
       
       
       int rows_changed=stmt_add.executeUpdate();
       
       if(rows_changed > 0){
       javax.swing.JOptionPane.showMessageDialog(this, "Angestellter wurde eingefügt");

       }
       else{
           javax.swing.JOptionPane.showMessageDialog(this, "Angestellter wurde nicht eingefügt");
       }
       }
       
       catch(SQLException ex){
             System.out.println("Error adding employeee");
             javax.swing.JOptionPane.showMessageDialog(this, "Select kann nicht gemacht werden.");
       }
       
       
       
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Connect;
    private javax.swing.JLabel Database;
    private javax.swing.JButton Disconnect;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Port;
    private javax.swing.JTextField Port_INPUT;
    private javax.swing.JLabel Server;
    private javax.swing.JTextField Server_INPUT;
    private javax.swing.JLabel User;
    private javax.swing.JButton Zurück;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton nachVorne;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtDeptno;
    private javax.swing.JTextField txtEName;
    private javax.swing.JTextField txtHiredate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtMgr;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
