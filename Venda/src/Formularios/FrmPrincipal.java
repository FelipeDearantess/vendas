
package Formularios;

import Clases.Dados;

public class FrmPrincipal extends javax.swing.JFrame {
    private Dados msDados;
    
        public void setDados(Dados msDados){
        this.msDados=msDados;
    }
  
    public FrmPrincipal() {
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

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArquivoClientes = new javax.swing.JMenuItem();
        mnuArquivoProdutos = new javax.swing.JMenuItem();
        mnuArquivoUsuarios = new javax.swing.JMenuItem();
        mnuArquivoTrocarSenha = new javax.swing.JRadioButtonMenuItem();
        mnuArquivoSair = new javax.swing.JRadioButtonMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuMovimentos = new javax.swing.JMenu();
        mnuMovimentosNovaVenda = new javax.swing.JMenuItem();
        mnuMovimentosRelatorioVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        mnuAjudaSobre = new javax.swing.JMenuItem();
        mnuAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas De Vendas");

        dpnDesk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");
        mnuArquivo.add(jSeparator1);

        mnuArquivoClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoClientes.setForeground(new java.awt.Color(0, 51, 255));
        mnuArquivoClientes.setText("Clientes");
        mnuArquivo.add(mnuArquivoClientes);

        mnuArquivoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoProdutos.setForeground(new java.awt.Color(0, 51, 255));
        mnuArquivoProdutos.setText("Produtos");
        mnuArquivo.add(mnuArquivoProdutos);

        mnuArquivoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoUsuarios.setForeground(new java.awt.Color(0, 51, 255));
        mnuArquivoUsuarios.setText("Usuarios");
        mnuArquivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoUsuariosActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoUsuarios);

        mnuArquivoTrocarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoTrocarSenha.setForeground(new java.awt.Color(0, 51, 255));
        mnuArquivoTrocarSenha.setSelected(true);
        mnuArquivoTrocarSenha.setText("Trocar Senha");
        mnuArquivo.add(mnuArquivoTrocarSenha);

        mnuArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuArquivoSair.setForeground(new java.awt.Color(0, 51, 255));
        mnuArquivoSair.setSelected(true);
        mnuArquivoSair.setText("Trocar Usuario");
        mnuArquivo.add(mnuArquivoSair);
        mnuArquivo.add(jSeparator2);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 51, 255));
        jMenuItem4.setText("Sair");
        mnuArquivo.add(jMenuItem4);
        mnuArquivo.add(jSeparator3);

        jMenuBar1.add(mnuArquivo);

        mnuMovimentos.setText("Movimentos");

        mnuMovimentosNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosNovaVenda.setForeground(new java.awt.Color(0, 51, 255));
        mnuMovimentosNovaVenda.setText("Nova Venda");
        mnuMovimentos.add(mnuMovimentosNovaVenda);

        mnuMovimentosRelatorioVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuMovimentosRelatorioVenda.setForeground(new java.awt.Color(0, 51, 255));
        mnuMovimentosRelatorioVenda.setText("Relatorio Venda");
        mnuMovimentos.add(mnuMovimentosRelatorioVenda);

        jMenuBar1.add(mnuMovimentos);

        mnuAjuda.setText("Ajuda");

        mnuAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaSobre.setForeground(new java.awt.Color(0, 51, 255));
        mnuAjudaSobre.setText("Sobre");
        mnuAjuda.add(mnuAjudaSobre);

        mnuAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuAjudaAjuda.setForeground(new java.awt.Color(0, 51, 255));
        mnuAjudaAjuda.setText("Ajuda");
        mnuAjuda.add(mnuAjudaAjuda);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArquivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoUsuariosActionPerformed
      FrmUsuarios mUsuarios =new FrmUsuarios();
      mUsuarios.setDados(msDados);
      dpnDesk.add(mUsuarios);
      mUsuarios.show();
    }//GEN-LAST:event_mnuArquivoUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenuItem mnuAjudaAjuda;
    private javax.swing.JMenuItem mnuAjudaSobre;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoClientes;
    private javax.swing.JMenuItem mnuArquivoProdutos;
    private javax.swing.JRadioButtonMenuItem mnuArquivoSair;
    private javax.swing.JRadioButtonMenuItem mnuArquivoTrocarSenha;
    private javax.swing.JMenuItem mnuArquivoUsuarios;
    private javax.swing.JMenu mnuMovimentos;
    private javax.swing.JMenuItem mnuMovimentosNovaVenda;
    private javax.swing.JMenuItem mnuMovimentosRelatorioVenda;
    // End of variables declaration//GEN-END:variables
}
