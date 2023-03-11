/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava2023;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 910640
 */
public class FunGerenciamento extends javax.swing.JFrame {

    /**
     * Creates new form FunGerenciamento
     */
     
    public void tabelaCompleta() {
       final DefaultTableModel modelo = new DefaultTableModel();
       JTable tabela = new JTable(modelo);
       
       
      
        getContentPane().setBackground(UIManager.getColor("Button.focus"));
        setTitle("Gerenciamento de funcionário");

             // Cria colunas da tabela JAVA
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Data de Nascimento");
        modelo.addColumn("CPF");
        modelo.addColumn("E-mail");
        modelo.addColumn("Bairro"); 
        modelo.addColumn("Rua");
        modelo.addColumn("Número");
        modelo.addColumn("Cidade");

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
             st.executeQuery("select * from funcionario");
             ResultSet rs = st.getResultSet();
             //pegando dados da tabela
                while (rs.next()) {
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                String dataNasc = rs.getString("dataNasc");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String bairro = rs.getString("bairro");
                String rua = rs.getString("rua");
                String num = rs.getString("num");
                String cidade = rs.getString("cidade");
                modelo.addRow(new Object[]{id, nome, dataNasc, cpf, email, bairro, rua, num,cidade});
                }
        } catch (SQLException | ClassNotFoundException e) {
             JOptionPane.showMessageDialog(rootPane, e);
             }//Fim try

        tabela.setPreferredScrollableViewportSize(new Dimension(575, 500));

        Container c = getContentPane();
        getContentPane().setLayout(null);

             // adicionando uma barra de rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(12, 120, 1065, 703);
        c.add(scrollPane);

             setSize(596, 601); // tamanho da tabela
             setVisible(true); // torna tabela visível
       
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public void resultadobusca(String buscarnome) {
    
        final DefaultTableModel modelo = new DefaultTableModel();
        JTable tabela = new JTable(modelo);
        getContentPane().setBackground(UIManager.getColor("Button.focus"));
        setTitle("Gerenciamento de funcionário");

             // Cria colunas da tabela JAVA
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Data de Nascimento");
        modelo.addColumn("CPF");
        modelo.addColumn("E-mail");
        modelo.addColumn("Bairro"); 
        modelo.addColumn("Rua");
        modelo.addColumn("Número");
        modelo.addColumn("Cidade");

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
             st.executeQuery("select * from funcionario where nome like  '%"+buscarnome+"%'");
             ResultSet rs = st.getResultSet();
             //pegando dados da tabela
                while (rs.next()) {
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                String dataNasc = rs.getString("dataNasc");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String bairro = rs.getString("bairro");
                String rua = rs.getString("rua");
                String num = rs.getString("num");
                String cidade = rs.getString("cidade");
                modelo.addRow(new Object[]{id, nome, dataNasc, cpf, email, bairro, rua, num,cidade});
                }
        } catch (SQLException | ClassNotFoundException e) {
             JOptionPane.showMessageDialog(rootPane, e);
             }//Fim try

        tabela.setPreferredScrollableViewportSize(new Dimension(575, 500));

        Container c = getContentPane();
        getContentPane().setLayout(null);

             // adicionando uma barra de rolagem
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(12, 120, 1065, 703);
        c.add(scrollPane);

             setSize(596, 601); // tamanho da tabela
             setVisible(true); // torna tabela visível
       
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
    public FunGerenciamento(String buscarnome) {
       
        if(buscarnome==""){
            tabelaCompleta();
        } else {
            this.dispose();
            resultadobusca(buscarnome);
            System.out.print("Hello");
            
            
        }
       
       initComponents(); 
    }
   
             

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        campoBusca = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(941, 896));
        setMinimumSize(new java.awt.Dimension(1141, 896));
        getContentPane().setLayout(null);

        voltar.setBackground(new java.awt.Color(255, 51, 51));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(30, 20, 61, 30);

        excluir.setBackground(new java.awt.Color(255, 51, 51));
        excluir.setText("EXCLUIR");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        getContentPane().add(excluir);
        excluir.setBounds(530, 20, 90, 30);

        editar.setBackground(new java.awt.Color(255, 204, 51));
        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(640, 20, 90, 30);

        cadastrar.setBackground(new java.awt.Color(51, 204, 0));
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(880, 20, 100, 30);

        atualizar.setBackground(new java.awt.Color(51, 255, 51));
        atualizar.setText("ATUALIZAR");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar);
        atualizar.setBounds(760, 20, 100, 30);

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(campoBusca);
        campoBusca.setBounds(1140, 640, 140, 30);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(1160, 700, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_far.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(941, 896));
        jLabel1.setMinimumSize(new java.awt.Dimension(941, 896));
        jLabel1.setPreferredSize(new java.awt.Dimension(941, 796));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -160, 1130, 1220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaPrincipal home = new TelaPrincipal();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
       FunExcluir home = new FunExcluir();
       home.setVisible(true);
    }//GEN-LAST:event_excluirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        FunEditar home = new FunEditar();
        home.setVisible(true);
    }//GEN-LAST:event_editarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        FunCadastrar home = new FunCadastrar();
        home.setVisible(true);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        FunGerenciamento home = new FunGerenciamento("");
        home.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_atualizarActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
      
        
            
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
            String buscarnome = campoBusca.getText();
            this.dispose();
            FunGerenciamento fun = new FunGerenciamento(buscarnome);
            

    }//GEN-LAST:event_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(FunGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunGerenciamento("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
