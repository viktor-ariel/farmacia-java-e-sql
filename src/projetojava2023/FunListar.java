/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava2023;

import java.awt.Container;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 910640
 */
public class FunListar extends javax.swing.JFrame {

       /**
     * Creates new form tabelaAluno
     */
    public FunListar() {
       
        super("JTable");
        getContentPane().setBackground(UIManager.getColor("Button.focus"));
        setTitle("Alunos Cadastrados");

        final DefaultTableModel modelo = new DefaultTableModel();

          
        JTable tabela = new JTable(modelo);

             // Cria colunas da tabela JAVA
        modelo.addColumn("ID"); // nome dos campos da tabela igual a tabela
        modelo.addColumn("Nome"); //em mysql
        modelo.addColumn("Senha");
        modelo.addColumn("E-mail");

             /* Abrindo conexão com o banco de dados
             * código para criar classe de conexão
             * aqui > Banco <
             */
        try {
          //Registra JDBC driver
             Class.forName("com.mysql.jdbc.Driver");

             //Abrindo a conexão
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava2023", "root", "");

             //Executa a query de seleção
             java.sql.Statement st = conn.createStatement();
             //st.executeQuery("select * from aluno ORDER BY nome asc");
             st.executeQuery("select * from login");
             ResultSet rs = st.getResultSet();
             //pegando dados da tabela
                while (rs.next()) {
                String id = rs.getString("id");
                String nome = rs.getString("usuario");
                String senha = rs.getString("senha");
                String email = rs.getString("email");
                modelo.addRow(new Object[]{id, nome, senha, email});
                }
        } catch (SQLException | ClassNotFoundException e) {
             JOptionPane.showMessageDialog(rootPane, e);
             }//Fim try

        tabela.setPreferredScrollableViewportSize(new Dimension(575, 500));

        Container c = getContentPane();
        getContentPane().setLayout(null);

             // adicionando uma barra de rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(12, 12, 565, 503);
        c.add(scrollPane);

             setSize(596, 601); // tamanho da tabela
             setVisible(true); // torna tabela visível
             }
             
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(FunListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
