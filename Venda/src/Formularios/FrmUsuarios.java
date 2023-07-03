package Formularios;

import Clases.Dados;
import Clases.Usuario;
import javax.swing.JOptionPane;


public class FrmUsuarios extends javax.swing.JInternalFrame {
    private Dados msDados;
    private int usuAtual =0;
    private boolean Novo= false;
    
    public void setDados(Dados msDados){
        this.msDados=msDados;
    }   
    public FrmUsuarios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtS_Nome = new javax.swing.JTextField();
        txtIDUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnPrimeiro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JPasswordField();
        cmbPerfil = new javax.swing.JComboBox();
        bntAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        bntNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Usuarios:");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("ID Usuario:");
        jLabel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("S_Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Senha:");

        txtNome.setEnabled(false);

        txtS_Nome.setEnabled(false);

        txtIDUsuario.setEnabled(false);

        txtSenha.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Perfil:");

        btnPrimeiro.setText("Primeiro");
        btnPrimeiro.setToolTipText("Navegar para o primeiro cadastro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Conf Senha:");

        txtConfSenha.setEnabled(false);

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Um Perfil", "ADM", "Usuario" }));
        cmbPerfil.setEnabled(false);

        bntAnterior.setText("Anterior");
        bntAnterior.setToolTipText("Navegar para o cadastro Anterior");
        bntAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText("Proximo");
        btnProximo.setToolTipText("Navegar para o cadastro proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setToolTipText("Navegar para o ultimo cadastro");

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Navegar para o primeiro cadastro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Navegar para o primeiro cadastro");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Navegar para o primeiro cadastro");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("pesquisar");
        btnPesquisar.setToolTipText("Navegar para o primeiro cadastro");

        bntNovo.setText("Novo");
        bntNovo.setToolTipText("Navegar para o cadastro Anterior");
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Navegar para o primeiro cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPesquisar)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSair)
                                .addGap(45, 45, 45))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPrimeiro)
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bntAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bntNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConfSenha)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCancelar)
                                            .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExcluir))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtS_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 150, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtS_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNovo)
                    .addComponent(btnExcluir))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(bntAnterior)
                    .addComponent(btnSair)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnEditar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
       btnPrimeiro.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnPesquisar.setEnabled(false);
       btnProximo.setEnabled(false);
       btnSair.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       //caixa de textos
       txtIDUsuario.setEnabled(true);
       txtNome.setEnabled(true);
       txtS_Nome.setEnabled(true);
       txtSenha.setEnabled(true);
       txtConfSenha.setEnabled(true);
       cmbPerfil.setEnabled(true);
       //Limpar caixa de textos    
       txtIDUsuario.setText("");
       txtNome.setText("");
       txtS_Nome.setText("");
       txtSenha.setText("");
       txtConfSenha.setText("");
       cmbPerfil.setSelectedIndex(0);
               
       Novo=true;

       txtIDUsuario.requestFocus();
      
    }//GEN-LAST:event_bntNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtIDUsuario.getText().equals("")){
           JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
           txtIDUsuario.requestFocusInWindow();
           return;
       }
       
        if(cmbPerfil.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
          cmbPerfil.requestFocusInWindow();
          return;
       }
        if(txtNome.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
          txtNome.requestFocusInWindow();
          return;
       }
        if(txtS_Nome.getText().equals("")){
          JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
          txtS_Nome.requestFocusInWindow();
          return;
       }
        
        String senha=new String (txtSenha.getPassword());
        String ConfSenha=new String (txtConfSenha.getPassword());
        
        if(senha.equals("")){
          JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
          txtNome.requestFocusInWindow();
          return;
       }
        if(ConfSenha.equals("")){
          JOptionPane.showMessageDialog(rootPane,"favor inserir um numero de ID");
          txtConfSenha.requestFocusInWindow();
          return;
        }
        
        if(!senha.equals(ConfSenha)){
          JOptionPane.showMessageDialog(rootPane,"sua senha esta diferente da confirmação");
          txtSenha.requestFocusInWindow();
          return;
        }
        
        int pos=msDados.PosicaoUsuario(txtIDUsuario.getText());
        if(Novo){
        if (pos!=-1){
        JOptionPane.showMessageDialog(rootPane,"Este Usuario ja existe");
        txtIDUsuario.requestFocusInWindow();
        return;
        }
        }else{
            if(pos==-1){
            JOptionPane.showMessageDialog(rootPane,"Este Usuario Ainda nao existe");
            txtIDUsuario.requestFocusInWindow();
            return;
            }
            
        }
        Usuario msuUsuario = new Usuario(
                txtIDUsuario.getText(),
                txtNome.getText(),
                txtS_Nome.getText(),
                senha,
                cmbPerfil.getSelectedIndex());
        String msg=msDados.adicionarUsuario(msuUsuario);
        JOptionPane.showMessageDialog(rootPane, msg); 
    
    
    
       btnPrimeiro.setEnabled(true);
       btnEditar.setEnabled(true);
       btnExcluir.setEnabled(true);
       btnPesquisar.setEnabled(true);
       btnProximo.setEnabled(true);
       btnSair.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
        //Desabilitar os campos                                 
       txtIDUsuario.setEnabled(false);
       txtNome.setEnabled(false);
       txtS_Nome.setEnabled(false);
       txtSenha.setEnabled(false);
       txtConfSenha.setEnabled(false);
       cmbPerfil.setEnabled(false);
       
       txtIDUsuario.requestFocus();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
btnPrimeiro.setEnabled(true);
       btnEditar.setEnabled(true);
       btnExcluir.setEnabled(true);
       btnPesquisar.setEnabled(true);
       btnProximo.setEnabled(true);
       btnSair.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
                                          }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         btnPrimeiro.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnPesquisar.setEnabled(false);
       btnProximo.setEnabled(false);
       btnSair.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       //caixa de textos
       txtNome.setEnabled(true);
       txtS_Nome.setEnabled(true);
       txtSenha.setEnabled(true);
       txtConfSenha.setEnabled(true);
       cmbPerfil.setEnabled(true);
       Novo=false;
       txtNome.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrarRegistro();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        usuAtual = 0;
        mostrarRegistro();

    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void bntAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnteriorActionPerformed
       usuAtual--;
       if (usuAtual == -1){
           usuAtual=msDados.numeroUsuarios()-1;
           mostrarRegistro();

    }//GEN-LAST:event_bntAnteriorActionPerformed
        mostrarRegistro();
    }
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        usuAtual++;
        if(usuAtual == msDados.numeroUsuarios()){
        usuAtual = 0;
      }
        mostrarRegistro();
    }//GEN-LAST:event_btnProximoActionPerformed
private void mostrarRegistro(){
        txtIDUsuario.setText(msDados.getUsuarios()[usuAtual].getIdUSuario());
        txtNome.setText(msDados.getUsuarios()[usuAtual].getNome());
        txtS_Nome.setText(msDados.getUsuarios()[usuAtual].getSnome());
        txtSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        txtConfSenha.setText(msDados.getUsuarios()[usuAtual].getSenha());
        cmbPerfil.setSelectedIndex(msDados.getUsuarios()[usuAtual].getPerfil());   
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAnterior;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtS_Nome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
