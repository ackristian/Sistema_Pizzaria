package Visao;

import Beans.CardapioBeans;
import Controller.CardapioController;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CardapioVisao extends javax.swing.JInternalFrame {
    DefaultTableModel Modelo;
    CardapioBeans CardB;
    CardapioController CardC;
    DecimalFormat FD;
    public CardapioVisao() {
        initComponents();
        CardC = new CardapioController();
        CardB = new CardapioBeans();
        FD = new DecimalFormat("0.00");
        habilitaCampos(false);
         Modelo = (DefaultTableModel)jTableCard.getModel();
         jTextFieldIdCard.setEditable(false);
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldIdCard = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPesqCard = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCard = new javax.swing.JTable();
        jButtonNovoFunc = new javax.swing.JButton();
        jButtonSalvarFunc = new javax.swing.JButton();
        jButtonEditarFunc = new javax.swing.JButton();
        jButtonLiberarFunc = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCard = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cardápio");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldIdCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdCardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("Pesquisar:");

        jTextFieldPesqCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesqCardActionPerformed(evt);
            }
        });
        jTextFieldPesqCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesqCardKeyReleased(evt);
            }
        });

        jTableCard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Tipo ", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCardMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCard);

        jButtonNovoFunc.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonNovoFunc.setText("Novo");
        jButtonNovoFunc.setToolTipText("Novo Cadastro");
        jButtonNovoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoFuncActionPerformed(evt);
            }
        });

        jButtonSalvarFunc.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonSalvarFunc.setText("Salvar");
        jButtonSalvarFunc.setToolTipText("Salvar Cadastro");
        jButtonSalvarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarFuncActionPerformed(evt);
            }
        });

        jButtonEditarFunc.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonEditarFunc.setText("Editar");
        jButtonEditarFunc.setToolTipText("Alterar Cadastro");
        jButtonEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncActionPerformed(evt);
            }
        });

        jButtonLiberarFunc.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonLiberarFunc.setText("Liberar");
        jButtonLiberarFunc.setToolTipText("Liberarar pra Editar");
        jButtonLiberarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLiberarFuncActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("Sair do Formulario");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Sair do Formulario");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTextAreaCard.setColumns(20);
        jTextAreaCard.setRows(5);
        jScrollPane2.setViewportView(jTextAreaCard);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel10.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pizza", "Refrigerante" }));

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel11.setText("Valor:");

        jTextFieldValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButtonNovoFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvarFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditarFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLiberarFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPesqCard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesqCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLiberarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(231, 231, 231)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(295, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesqCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesqCardActionPerformed
        
    }//GEN-LAST:event_jTextFieldPesqCardActionPerformed

    private void jTextFieldPesqCardKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesqCardKeyReleased
        Modelo.setNumRows(0);
        CardC.ControlePesqusa(jTextFieldPesqCard.getText(), Modelo);
    }//GEN-LAST:event_jTextFieldPesqCardKeyReleased

    private void jTableCardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCardMousePressed
        CardB = CardC.controlePreenchimentoCampos(Integer.parseInt(Modelo.getValueAt(jTableCard.getSelectedRow(),0).toString()));
       jTextFieldIdCard.setText(CardB.getCodigo() + "");
       jTextAreaCard.setText(CardB.getDescricao());
        jComboBoxTipo.setSelectedItem(CardB.getTipo());
        jTextFieldValor.setText(CardB.getValor()+"");
//        jPasswordFieldSenha.setText(FunB.getSenha());
//        jTextFieldDatacadFunc.setText(FunB.getDataCad());
    }//GEN-LAST:event_jTableCardMousePressed

    private void jButtonNovoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoFuncActionPerformed
//         jTextFieldDatacadFunc.setText(VerificadoresCorretores.RetornarDataActual());
            habilitaCampos(true);
//        jTextFieldNomeFunc.requestFocus();
        jTextFieldIdCard.setText(CardC.ControleID());
        LimpaCamposNovoCadastro();
        
        

    }//GEN-LAST:event_jButtonNovoFuncActionPerformed

    private void jButtonSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarFuncActionPerformed
       popularCardBeans();
       if(CardC.VerificarDados(CardB,jTextFieldValor.getText())){ 
            LimpaCamposTodos(); 
            habilitaCampos(false);
        }
    }//GEN-LAST:event_jButtonSalvarFuncActionPerformed

    private void jButtonEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncActionPerformed
        popularCardBeans();
        if(CardC.EditarDados(CardB,jTextFieldValor.getText())){
             LimpaCamposTodos();
             habilitaCampos(false);
        }        
    }//GEN-LAST:event_jButtonEditarFuncActionPerformed

    private void jButtonLiberarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLiberarFuncActionPerformed
        habilitaCampos(true);
    }//GEN-LAST:event_jButtonLiberarFuncActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldIdCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdCardActionPerformed

    private void jTextFieldValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorFocusLost
       try{
           double Verifica = Double.parseDouble(jTextFieldValor.getText().replace(',', '.'));
           jTextFieldValor.setText(FD.format(Verifica).replace(',', '.'));
          }
          catch(NumberFormatException Ex){
               JOptionPane.showMessageDialog(null,"Campo Valor deve conter apenas números","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
               jTextFieldValor.setText("");
               jTextFieldValor.requestFocus();
          }
    }//GEN-LAST:event_jTextFieldValorFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditarFunc;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLiberarFunc;
    private javax.swing.JButton jButtonNovoFunc;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvarFunc;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableCard;
    private javax.swing.JTextArea jTextAreaCard;
    private javax.swing.JTextField jTextFieldIdCard;
    private javax.swing.JTextField jTextFieldPesqCard;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
    
    final void LimpaCamposNovoCadastro(){
        jTextFieldValor.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        jTextAreaCard.setText("");
    }
    final void habilitaCampos(boolean valor){
        jTextFieldValor.setEditable(valor);
        jComboBoxTipo.setEnabled(valor);
        jTextAreaCard.setEnabled(valor);
    }
    
    final void LimpaCamposTodos(){
        jTextFieldIdCard.setText("");
       jTextAreaCard.setText("");
        jTextFieldValor.setText("");
       jComboBoxTipo.setSelectedIndex(0);
        
    }
    
    final CardapioBeans popularCardBeans(){
        //if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText())){
        CardB.setCodigo(Integer.parseInt(jTextFieldIdCard.getText()));
        CardB.setDescricao(jTextAreaCard.getText());
        CardB.setTipo(jComboBoxTipo.getSelectedItem().toString());
        CardB.setValor(Double.parseDouble(jTextFieldValor.getText()));
        
        return CardB;
       
    }
}
