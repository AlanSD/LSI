package br.com.lsi.ordemservico.swing;


import br.com.lsi.ordemservico.commom.exception.DAOException;
import br.com.lsi.ordemservico.fachada.Fachada;
import br.com.lsi.ordemservico.modelo.Cidade;
import br.com.lsi.ordemservico.util.Utilitarios;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FrmLogin_semUso extends javax.swing.JFrame {


    private Fachada facade = new Fachada();
    private Utilitarios utilitarios = new Utilitarios();
    public FrmLogin_semUso() throws DAOException  { //criando a frame
        initComponents();
        
        this.setLocationRelativeTo(null);
        iniciaBanco();

    }

   
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try {
            List<Cidade> listaCidade = facade.getAllCidade();
     
              List<Cidade> listaArquivoCidades = new ArrayList<Cidade>();
            if(listaCidade.size()>=0){
              
                 listaArquivoCidades = utilitarios.LerCidadesEstadosNoArquivo();
              
                 if(listaCidade.size()<listaArquivoCidades.size()){
                     System.out.println("Entrou");
                     for(int i=0;i<listaCidade.size();i++){
                         facade.deletarCidade(listaCidade.get(i));
                     }
                     try{
                     for(int i=0;i<listaArquivoCidades.size();i++){
                  
                         facade.salvarCidade(listaArquivoCidades.get(i));
                     }
                     }catch(Exception e){
                         e.printStackTrace();
                     }
                 }
              
            }else if (listaCidade.size()<0){
                
                System.out.println("Lista menor que (0)");
                System.out.println(listaCidade.size());
                  listaArquivoCidades = utilitarios.LerCidadesEstadosNoArquivo();
                  System.out.println(listaArquivoCidades.size());
                     for(int i=0;i<listaArquivoCidades.size();i++){
                         facade.salvarCidade(listaArquivoCidades.get(i));
                     }
                  
            }
                
        } catch (DAOException ex) {
            Logger.getLogger(FrmLogin_semUso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Principal princ = new Principal();
        princ.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  public void iniciaBanco() throws DAOException{
      facade.getAllMarca();
  }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

         public void run() {
             try {
                 new FrmLogin_semUso().setVisible(true);
             } catch (DAOException ex) {
                 Logger.getLogger(FrmLogin_semUso.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
