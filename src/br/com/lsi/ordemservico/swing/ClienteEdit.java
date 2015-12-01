/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.swing;

import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.enuns.Operadora;
import br.com.lsi.ordemservico.enuns.Sexo;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Cidade;
import br.com.lsi.ordemservico.modelo.Cliente;
import br.com.lsi.ordemservico.modelo.Contato;
import br.com.lsi.ordemservico.modelo.Endereco;
import br.com.lsi.ordemservico.validation.Validation;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Santos Diniz
 */
public class ClienteEdit extends javax.swing.JDialog {

    /**
     * Creates new form ClienteEdit
     */
    private Fachada facade = new Fachada();

    public static Long id = null;

    public static List<Contato> listaConatos = new ArrayList<>();

    public ClienteEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jComboBoxSEXO.setModel(new DefaultComboBoxModel<>(Sexo.values()));
        preencherEstados();
    }

    public void preencherEstados() {
        List<Cidade> listaCidades = new ArrayList<>();
        try {
        String anterior = "";
            listaCidades = facade.getAllCidade();
            for (int i = 0; i < listaCidades.size(); i++) {
                String atual = listaCidades.get(i).getEstado();
                if(!atual.equals(anterior)){
                     jComboBoxEstado.addItem(listaCidades.get(i).getEstado());
                     anterior = listaCidades.get(i).getEstado();
                }
               
            }

        } catch (DAOException ex) {
            System.out.println("Falha ao prencher comobox estado");
        }
    }

    public void inserirCliente(Cliente c) {

        jTextFieldNome.setText(c.getNome());
        jComboBoxSEXO.setSelectedItem(c.getSexo());
        jFormattedTextFieldCpf.setText(c.getCpf());
        jTextFieldRua.setText(c.getEndereco().getRua());
        jFormattedTextFieldCep.setText(c.getEndereco().getCep());
        jTextFieldBairro.setText(c.getEndereco().getBairro());
        jComboBoxCidade.setSelectedItem(c.getEndereco().getCidade());
        jComboBoxEstado.setSelectedItem(c.getEndereco().getUf());

        // Falta termina
        //  jTextFieldNumero.setText(Integer.toString(c.getContato().getTelefone()));
        // jTextFieldDD.setText(Integer.toString(c.getContato().getCodigoEstado()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSEXO = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jComboBoxCidade = new javax.swing.JComboBox();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("NOME:");

        jLabel1.setText("DADOS DO CLIENTE:");

        jLabel3.setText("SEXO:");

        jLabel4.setText("CPF:");

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel17.setText("ENDEREÇO:");

        jLabel18.setText("RUA:");

        jLabel11.setText("CEP:");

        jLabel19.setText("CIDADE:");

        jLabel20.setText("BAIRRO:");

        jLabel10.setText("UF:");

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxEstadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxEstadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxEstadoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxEstadoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxEstadoMouseReleased(evt);
            }
        });
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jButtonCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel20)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6)))))
                .addGap(19, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (Validation.campoObrigatorio(jTextFieldNome)) {
            JOptionPane.showMessageDialog(null, "Campo Nome Obrigatório");
            jTextFieldNome.setText(null);
            return;
        } else {
            try {

                Endereco end = new Endereco();
       
                end.setRua(jTextFieldRua.getText());
                end.setBairro(jTextFieldBairro.getText());
                end.setCep(jFormattedTextFieldCep.getText());
                 end.setCidade(jComboBoxCidade.getSelectedItem().toString());
                end.setUf(jComboBoxEstado.getSelectedItem().toString());
            

                Cliente client = new Cliente();

                client.setNome(jTextFieldNome.getText());
                client.setCpf(jFormattedTextFieldCpf.getText());
                client.setSexo((Sexo) jComboBoxSEXO.getSelectedItem());
                client.setEndereco(end);

                if (id == null) {
                    client.setDtCadastro(Calendar.getInstance());
                    facade.salvarClientes(client);
                    JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
                } else {
                    client.setId(id);
                    facade.atualizarClientes(client);
                    JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
                }

            } catch (DAOException ex) {
                ex.printStackTrace();
            }
            this.dispose();
        
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        System.out.println("Estado" + jComboBoxEstado.getSelectedItem());

        try {
              jComboBoxCidade.setModel(new DefaultComboBoxModel<>()); 
            String uf = (String) jComboBoxEstado.getSelectedItem();
            List<Cidade> listaCidades = new ArrayList<>();
            listaCidades = facade.getCidadePorEstado(uf);
            for (int i = 0; i < listaCidades.size(); i++) {
               
                jComboBoxCidade.addItem(listaCidades.get(i).getCidade());
            }
            listaCidades = new ArrayList<>();
         
        } catch (DAOException ex) {
            Logger.getLogger(ClienteEdit.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

    private void jComboBoxEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEstadoMouseClicked

    }//GEN-LAST:event_jComboBoxEstadoMouseClicked

    private void jComboBoxEstadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEstadoMouseEntered

    }//GEN-LAST:event_jComboBoxEstadoMouseEntered

    private void jComboBoxEstadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEstadoMouseExited

    }//GEN-LAST:event_jComboBoxEstadoMouseExited

    private void jComboBoxEstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEstadoMousePressed

    }//GEN-LAST:event_jComboBoxEstadoMousePressed

    private void jComboBoxEstadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEstadoMouseReleased

    }//GEN-LAST:event_jComboBoxEstadoMouseReleased

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
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteEdit dialog = new ClienteEdit(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCidade;
    public static javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JComboBox jComboBoxSEXO;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
