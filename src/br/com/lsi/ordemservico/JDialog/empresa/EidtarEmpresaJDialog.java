package br.com.lsi.ordemservico.JDialog.empresa;


import br.com.lsi.ordemservico.fachada.Facade;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.modelo.Endereco;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EidtarEmpresaJDialog extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    private Empresa empresa = new Empresa();
    private Facade empresaFacade = new Facade();

    /**
     * Creates new form EidtarEmpresaJDialog
     */
    public EidtarEmpresaJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public void preencherCampos() {

        int linha = jTabelaEditarEmpresa.getSelectedRow();

        id = (Integer) jTabelaEditarEmpresa.getValueAt(linha, 0);

        String nomeFantasia = (String) jTabelaEditarEmpresa.getValueAt(linha, 1);
        String cnpj = (String) jTabelaEditarEmpresa.getValueAt(linha, 2);
        String rua = (String) jTabelaEditarEmpresa.getValueAt(linha, 3);
        String bairro = (String) jTabelaEditarEmpresa.getValueAt(linha, 4);
        String uf = (String) jTabelaEditarEmpresa.getValueAt(linha, 5);
        String cidade = (String) jTabelaEditarEmpresa.getValueAt(linha, 6);
        String cep = (String) jTabelaEditarEmpresa.getValueAt(linha, 7);

        jTextNomeFantasia.setText(nomeFantasia);
        jFormateCNPJ.setText(cnpj);
        jTextBairro.setText(bairro);
        jComboBoxUF.setSelectedItem(uf);
        jTextRua.setText(rua);
        jTextCidade.setText(cidade);
        jFormateCEP.setText(cep);

    }

    public void preencherTabela() {

        modelo.setNumRows(0);
        Endereco endereco = new Endereco();

        try {
            List<Empresa> listarEmpresa = new ArrayList<Empresa>();
            listarEmpresa = empresaFacade.listarEmpresa();

            for (Empresa empresa : listarEmpresa) {

                modelo.addRow(new Object[]{empresa.getId(), empresa.getNomeFantasia(), empresa.getCNPJ(),
                    endereco.getId(), endereco.getRua(), endereco.getBairro(), endereco.getUf(),
                    endereco.getCidade(), endereco.getCep()

                }
                );

            }

            // e isso tem que ficar despois de tudo
            jTabelaEditarEmpresa.setModel(modelo);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaEditarEmpresa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextNomeFantasia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jButtonCanncelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jFormateCEP = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jFormateCNPJ = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Editar Empresa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTabelaEditarEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabelaEditarEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaEditarEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaEditarEmpresa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NomeFantasia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));
        getContentPane().add(jTextNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CNPJ:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Rua:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));
        getContentPane().add(jTextRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Cidade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));
        getContentPane().add(jTextCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 150, -1));

        jButtonCanncelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LSI\\src\\br\\com\\lsi\\ordemservico\\Icones\\delet.png")); // NOI18N
        jButtonCanncelar.setText("Cancelar");
        jButtonCanncelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanncelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCanncelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 100, 30));

        jButtonSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\LSI\\src\\br\\com\\lsi\\ordemservico\\Icones\\accept.png")); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("UF:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        getContentPane().add(jComboBoxUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 40, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("CEP:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        try {
            jFormateCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormateCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormateCEPActionPerformed(evt);
            }
        });
        getContentPane().add(jFormateCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("BAIRRO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));
        getContentPane().add(jTextBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 120, -1));

        try {
            jFormateCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormateCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormateCNPJActionPerformed(evt);
            }
        });
        getContentPane().add(jFormateCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaEditarEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaEditarEmpresaMouseClicked
        preencherCampos();
    }//GEN-LAST:event_jTabelaEditarEmpresaMouseClicked

    private void jButtonCanncelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanncelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanncelarActionPerformed


    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        Empresa e = new Empresa();

        e.setId(Long.MIN_VALUE);

        e.setNomeFantasia(jTextNomeFantasia.getText());
        e.setCNPJ(jFormateCNPJ.getText());

        Endereco end = new Endereco();
        end.setBairro(jTextBairro.getText());
        end.setRua(jTextRua.getText());
        end.setUf((String) jComboBoxUF.getSelectedItem());
        end.setCidade(jTextCidade.getText());
        end.setCep(jFormateCEP.getText());

        try {

            e.setEndereco(end);
            empresaFacade.editarEmpresa(e);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja editado esse Livro ?", "editar", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            //   JOptionPane.showMessageDialog(null, MensagensUtil.getValor(MensagensUtil.MSG_SUCESSO_EDITAR_GENERICA, "Livro"));
        }

        jTextNomeFantasia.setText("");
        jFormateCNPJ.setText("");

        jTextBairro.setText("");
        jTextRua.setText("");
        jComboBoxUF.setSelectedItem("");
        jTextCidade.setText("");
        jFormateCEP.setText("");

        preencherTabela();

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        modelo = (DefaultTableModel) jTabelaEditarEmpresa.getModel();

        modelo.addColumn("ID");
        modelo.addColumn("NOME FANTASIA");
        modelo.addColumn("CNPJ");

        modelo.addColumn("IDENDERECO");
        modelo.addColumn("RUA");
        modelo.addColumn("BAIRRO");
        modelo.addColumn("UF");
        modelo.addColumn("CIDADE");
        modelo.addColumn("CEP");

        jTabelaEditarEmpresa.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTabelaEditarEmpresa.getColumnModel().getColumn(0).setMaxWidth(0);
        jTabelaEditarEmpresa.getColumnModel().getColumn(0).setMinWidth(0);

        jTabelaEditarEmpresa.getColumnModel().getColumn(1).setPreferredWidth(700);
        jTabelaEditarEmpresa.getColumnModel().getColumn(2).setPreferredWidth(600);

        jTabelaEditarEmpresa.getColumnModel().getColumn(3).setPreferredWidth(500);
        jTabelaEditarEmpresa.getColumnModel().getColumn(3).setPreferredWidth(400);
        jTabelaEditarEmpresa.getColumnModel().getColumn(3).setPreferredWidth(700);

        jTabelaEditarEmpresa.getColumnModel().getColumn(4).setPreferredWidth(750);
        jTabelaEditarEmpresa.getColumnModel().getColumn(5).setPreferredWidth(0);
        jTabelaEditarEmpresa.getColumnModel().getColumn(6).setMaxWidth(0);
        jTabelaEditarEmpresa.getColumnModel().getColumn(7).setMinWidth(0);
        jTabelaEditarEmpresa.getColumnModel().getColumn(8).setPreferredWidth(400);

    }

    private void jFormateCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormateCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormateCEPActionPerformed

    private void jFormateCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormateCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormateCNPJActionPerformed

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
            java.util.logging.Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EidtarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EidtarEmpresaJDialog dialog = new EidtarEmpresaJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCanncelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxUF;
    private javax.swing.JFormattedTextField jFormateCEP;
    private javax.swing.JFormattedTextField jFormateCNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaEditarEmpresa;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextNomeFantasia;
    private javax.swing.JTextField jTextRua;
    // End of variables declaration//GEN-END:variables
}
