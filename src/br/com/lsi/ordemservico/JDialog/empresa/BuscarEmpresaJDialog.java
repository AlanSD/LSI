package br.com.lsi.ordemservico.JDialog.empresa;



import br.com.lsi.ordemservico.fachada.Facade;
import br.com.lsi.ordemservico.modelo.Empresa;
import br.com.lsi.ordemservico.modelo.Endereco;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarEmpresaJDialog extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();

    private Empresa empresa = new Empresa();

    private Facade empresaFacade = new Facade();

    public BuscarEmpresaJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void preencherTabela() {

        modelo.setRowCount(0);
        Endereco endereco = new Endereco();
        
        try {
            List<Empresa> listarEmpresa = empresaFacade.listarEmpresa();

            for (Empresa empresa : listarEmpresa) {

                modelo.addRow(new Object[]{empresa.getId(), empresa.getNomeFantasia(), empresa.getCNPJ(),
                    endereco.getId(), endereco.getRua(), endereco.getBairro(), endereco.getUf(),
                    endereco.getCidade(), endereco.getCep()
                }
                );

            }

            jTabelaBuscarNomeFantasia.setModel(modelo);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preencherTabelaPorNomeFantasia(String nomeFantasia) {
        modelo.setRowCount(0);
        Endereco endereco = new Endereco();

        try {
            List<Empresa> listarEmpresas = empresaFacade.buscarEmpresaPorNome(nomeFantasia);

            for (Empresa empresa : listarEmpresas) {

                modelo.addRow(new Object[]{empresa.getId(), empresa.getNomeFantasia(), empresa.getCNPJ(),
                    endereco.getId(), endereco.getRua(), endereco.getBairro(), endereco.getUf(),
                    endereco.getCidade(), endereco.getCep()

                }
                );

            }

            jTabelaBuscarNomeFantasia.setModel(modelo);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        modelo = (DefaultTableModel) jTabelaBuscarNomeFantasia.getModel();

        modelo.addColumn("ID");
        modelo.addColumn("NOME FANTASIA");
        modelo.addColumn("CNPJ");

        modelo.addColumn("IDENDERECO");
        modelo.addColumn("RUA");
        modelo.addColumn("BAIRRO");
        modelo.addColumn("UF");
        modelo.addColumn("CIDADE");
        modelo.addColumn("CEP");

        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(0).setMaxWidth(0);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(0).setMinWidth(0);

        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(1).setPreferredWidth(700);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(2).setPreferredWidth(600);

        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(3).setPreferredWidth(500);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(3).setPreferredWidth(400);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(3).setPreferredWidth(700);

        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(4).setPreferredWidth(750);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(5).setPreferredWidth(0);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(6).setMaxWidth(0);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(7).setMinWidth(0);
        jTabelaBuscarNomeFantasia.getColumnModel().getColumn(8).setPreferredWidth(400);

    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaBuscarNomeFantasia = new javax.swing.JTable();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar Empresa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTabelaBuscarNomeFantasia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabelaBuscarNomeFantasia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 550, 230));
        getContentPane().add(jTextFieldNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 220, 30));

        jLabel2.setText("NomeFantasia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 110, 30));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String nomeFantasia = jTextFieldNomeFantasia.getText();

        preencherTabelaPorNomeFantasia(nomeFantasia);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpresaJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarEmpresaJDialog dialog = new BuscarEmpresaJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaBuscarNomeFantasia;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    // End of variables declaration//GEN-END:variables
}
