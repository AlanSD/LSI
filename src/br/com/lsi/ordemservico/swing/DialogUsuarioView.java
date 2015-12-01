/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lsi.ordemservico.swing;


import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.enuns.Nivel;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Usuario;
import br.com.lsi.ordemservico.util.PersistenceUtil;
import br.com.lsi.ordemservico.validation.Validation;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Allan
 */
public class DialogUsuarioView extends javax.swing.JDialog {

    Fachada facade =  new Fachada();
    
    public DialogUsuarioView(java.awt.Frame parent, boolean modal) throws DAOException {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtBusca.requestFocus();
        preencherTabela();
        txtBusca.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jButtonNovoUsuario = new javax.swing.JButton();
        jButtonEditUsuario = new javax.swing.JButton();
        jButtonDeleteUsuario = new javax.swing.JButton();
        jButtonUsuarioSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuarios);

        uJPanelImagem1.setImagem(new java.io.File("C:\\imagens\\2.jpg"));

        jButtonNovoUsuario.setText("Novo");
        jButtonNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoUsuarioActionPerformed(evt);
            }
        });

        jButtonEditUsuario.setText("Editar");
        jButtonEditUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditUsuarioActionPerformed(evt);
            }
        });

        jButtonDeleteUsuario.setText("Deletar");
        jButtonDeleteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUsuarioActionPerformed(evt);
            }
        });

        jButtonUsuarioSair.setText("Sair");
        jButtonUsuarioSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUsuarioSair, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEditUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUsuarioSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed

    }//GEN-LAST:event_txtBuscaActionPerformed

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed

    }//GEN-LAST:event_txtBuscaKeyPressed

    private void jButtonNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoUsuarioActionPerformed
        DialogUsuarioEdit frameUsuEdit= new DialogUsuarioEdit(null, true);
        frameUsuEdit.setVisible(true);

    }//GEN-LAST:event_jButtonNovoUsuarioActionPerformed

    private void jButtonEditUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditUsuarioActionPerformed
        int linhaSelecionada = jTableUsuarios.getSelectedRow();//pegando linha selecionada
        Usuario usuario = new Usuario();
        String idSelec = (jTableUsuarios.getValueAt(linhaSelecionada,0).toString());
        usuario.setUsuarioId(Long.parseLong(idSelec));

        try{
            usuario = facade.businessUsuarios.getById(Long.parseLong(idSelec));
            DialogUsuarioEdit frmUsuEdit = new DialogUsuarioEdit(null, true);
            frmUsuEdit.montaUsuario(usuario);
            frmUsuEdit.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Editar");
        }
    }//GEN-LAST:event_jButtonEditUsuarioActionPerformed

    private void jButtonDeleteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUsuarioActionPerformed
        int linhaSelecionada = jTableUsuarios.getSelectedRow();//pegando linha selecionada
        Usuario usuario = new Usuario();
        String idSelec = (jTableUsuarios.getValueAt(linhaSelecionada,0).toString());
        int x = JOptionPane.showConfirmDialog(null, "Deseja deletar?");
        if(x == 0){
            try{
                usuario = facade.businessUsuarios.getById(Long.parseLong(idSelec));
                facade.businessUsuarios.deletar(usuario);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                preencherTabela();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao deletar");

            }

        }
    }//GEN-LAST:event_jButtonDeleteUsuarioActionPerformed

    private void jButtonUsuarioSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonUsuarioSairActionPerformed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked

        if (evt.getClickCount() > 1) {

        }

        if (evt.getClickCount()==1)
        System.out.println("Nada Feito");
        if (evt.getClickCount()==2)
        JOptionPane.showMessageDialog(null, "CLICK DUPLO");
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            preencherTabela();
        } catch (DAOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    public void preencherTabela() throws DAOException{
   
        jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(400);
       
       
        DefaultTableModel modelo = (DefaultTableModel)jTableUsuarios.getModel();
        modelo.setNumRows(0);
        
        
        try{
            List<Usuario> listaUsuarios = new ArrayList<Usuario>();
            String nome = txtBusca.getText();
            
            if(nome.equals("")){
                listaUsuarios = facade.businessUsuarios.getAll();
                  if(!Validation.getUsuario().getNivel().equals(Nivel.MASTER)){
                      listaUsuarios.remove(0);
                  }
                int tamanhoLista = listaUsuarios.size();
            for(int i=0; i<tamanhoLista; i++){
                Usuario  usuario =  listaUsuarios.get(i);
                modelo.addRow(new Object[]{usuario.getId(),usuario.getUsuarioNome()});
               
                }
            }else{
                     listaUsuarios = facade.businessUsuarios.getAll();
                     int tamanhoLista = listaUsuarios.size();
                     for(int i=0; i<tamanhoLista; i++){
                     Usuario  usuario =  listaUsuarios.get(i);
                     modelo.addRow(new Object[]{usuario.getId(),usuario.getUsuarioNome()});
                  }
          }
              
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao listar" +" : "+e);
        }
        
    }
       
      private Session sessao;
      private Transaction trans;
      public List<Usuario> listarPorNome(String nome) throws DAOException {
        try {
            sessao = PersistenceUtil.getSessionFactory().openSession();
            trans = sessao.beginTransaction();
            
            List<Usuario> usuarios = new ArrayList<Usuario>();
            List<Usuario> usuariosReturn = new ArrayList<Usuario>();
            
            Criteria crit = sessao.createCriteria(Usuario.class);
            crit.add(Restrictions.eq("usuarioNome", nome));
            usuarios = crit.list();
            
            trans.commit();
            
            for (Usuario u : usuarios) {
                Usuario usuario = new Usuario();
                    
                usuario.setUsuarioId(u.getId());
                usuario.setUsuarioNome(u.getUsuarioNome());
                usuario.setUsuarioSenha(u.getUsuarioSenha());
                              
                usuariosReturn.add(usuario);
            }
      
            return usuariosReturn;
       
    }catch (HibernateException e) {
            e.printStackTrace();
            throw new DAOException("Erro ao buscar por nome");
        }finally{
            sessao.close();
        }
    }
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
            java.util.logging.Logger.getLogger(DialogUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogUsuarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DialogUsuarioView dialog = new DialogUsuarioView(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (DAOException ex) {
                    Logger.getLogger(DialogUsuarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteUsuario;
    private javax.swing.JButton jButtonEditUsuario;
    private javax.swing.JButton jButtonNovoUsuario;
    private javax.swing.JButton jButtonUsuarioSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField txtBusca;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
