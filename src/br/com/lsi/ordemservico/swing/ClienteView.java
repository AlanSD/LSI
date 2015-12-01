/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.swing;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Cliente;
import br.com.lsi.ordemservico.modelo.Contato;
import br.com.lsi.ordemservico.util.Utilitarios;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan Santos Diniz
 */
public class ClienteView extends javax.swing.JDialog {

    /**
     * Creates new form ClienteView
     */
    
     private Fachada facade = new Fachada();
    
    public ClienteView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
     private void preencherJtableCliente(List<Cliente> lista) {

      

        DefaultTableModel modelo = (DefaultTableModel) jtDados.getModel();
        jtDados.setRowHeight(25);
        modelo.setNumRows(0);
            Utilitarios utilitarios = new Utilitarios();
        try {

            if (lista.size() > 0) {
                for (Cliente cliente : lista) {
                    String data = utilitarios.pasarCalendarParaString(cliente.getDtCadastro());
                    modelo.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getSexo(),
                       cliente.getEndereco().getUf(),cliente.getEndereco().getCidade(),
                        cliente.getEndereco().getRua(), 
                        cliente.getEndereco().getBairro(),cliente.getEndereco().getCep(),data});
                }
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO LISTAR");
        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem4 = new componentes.UJPanelImagem();
        btNovo = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        uJPanelImagem4.setImagem(new java.io.File("C:\\imagens\\2.jpg"));

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btEdit.setText("Editar");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem4Layout = new javax.swing.GroupLayout(uJPanelImagem4);
        uJPanelImagem4.setLayout(uJPanelImagem4Layout);
        uJPanelImagem4Layout.setHorizontalGroup(
            uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uJPanelImagem4Layout.setVerticalGroup(
            uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btEdit)
                    .addComponent(btExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "SEXO", "ESTADO", "CIDADE", "RUA", "BAIRRO", "CEP", "DATA DE CADASTRO"
            }
        ));
        jtDados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtDadosFocusGained(evt);
            }
        });
        jtDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(uJPanelImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        ClienteEdit ClienteEdit = new ClienteEdit(null, true);

        ClienteEdit.setVisible(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        int linhaSelecionada = jtDados.getSelectedRow();//pegando linha selecionada
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Cliente Não Selecionado");
        }
        String id = (jtDados.getValueAt(linhaSelecionada, 0).toString());
        try {
            ClienteEdit clientEdit = new ClienteEdit(null, true);
            clientEdit.inserirCliente(facade.getByIdClientes(Long.parseLong(id)));
            Cliente clinet = new Cliente();
            clinet = facade.getByIdClientes(Long.parseLong(id));
            clientEdit.id = clinet.getId();
           
           
            
            clientEdit.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = jtDados.getSelectedRow();//pegando linha selecionada
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Cliente Não Selecionado");
        }
        String id = (jtDados.getValueAt(linhaSelecionada, 0).toString());
        int x = JOptionPane.showConfirmDialog(null, "Deseja Deletar");
        if (x == 0) {
            try {
                facade.deletarClientes(facade.getByIdClientes(Long.parseLong(id)));
                JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showConfirmDialog(null, "Erro ao Excluir");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jtDadosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDadosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDadosFocusGained

    private void jtDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDadosMouseClicked

        if (evt.getClickCount() > 1) {
            System.out.println("clicou 2 vezes");
        }
        
    }//GEN-LAST:event_jtDadosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jtDados.getColumnModel().getColumn(1).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(2).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(3).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(4).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(5).setPreferredWidth(100);
        jtDados.getColumnModel().getColumn(6).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(7).setPreferredWidth(50);
        jtDados.getColumnModel().getColumn(8).setPreferredWidth(50);
  
   
        

        //Definindo tamanho 0 a coluna ID
        jtDados.getColumnModel().getColumn(0).setMinWidth(0);
        jtDados.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtDados.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
         try {
             preencherJtableCliente(facade.getAllClientes());
         } catch (DAOException ex) {
             Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteView dialog = new ClienteView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDados;
    private componentes.UJPanelImagem uJPanelImagem4;
    // End of variables declaration//GEN-END:variables
}
