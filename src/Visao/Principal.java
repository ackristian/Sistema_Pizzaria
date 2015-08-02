
package Visao;

import Utilitarios.FundoTela;
import java.awt.GridLayout;
import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    FundoTela Desktop;
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);// Comando para maximizar Formulario.
        setLayout(new GridLayout());//Muda o grid para poder apresentar a imagem
        
        Desktop = new FundoTela("Bibliotecas\\Imagens/BSB-barbearia-dom-cabral.jpeg");//Estanciar para chamar a imagem
        getContentPane().add(Desktop);//para adicionar a imagem de fundo 
        Desktop.setVisible(true);//Para manter visivel alguma coisa
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCli = new javax.swing.JMenuItem();
        jMenuItemFucionarios = new javax.swing.JMenuItem();
        jMenuItemEntregadores = new javax.swing.JMenuItem();
        jMenuItemCardapio = new javax.swing.JMenuItem();
        jMenuOperacoes = new javax.swing.JMenu();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Pzzaria");

        jMenuCadastros.setText("Cadastros");

        jMenuItemCli.setText("Clientes");
        jMenuItemCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCliActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCli);

        jMenuItemFucionarios.setText("Funcionários");
        jMenuItemFucionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFucionariosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFucionarios);

        jMenuItemEntregadores.setText("Entregadores");
        jMenuCadastros.add(jMenuItemEntregadores);

        jMenuItemCardapio.setText("Cardápio");
        jMenuItemCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCardapioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCardapio);

        jMenuBar1.add(jMenuCadastros);

        jMenuOperacoes.setText("Operações");

        jMenuItemPedidos.setText("Pedidos");
        jMenuItemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPedidosActionPerformed(evt);
            }
        });
        jMenuOperacoes.add(jMenuItemPedidos);

        jMenuItem1.setText("Detalhes da Venda");
        jMenuOperacoes.add(jMenuItem1);

        jMenuBar1.add(jMenuOperacoes);

        jMenu1.setText("Relatórios");

        jMenuItem2.setText("Clientes");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Vendas");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFucionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFucionariosActionPerformed
       FuncionarioVisao frm = new FuncionarioVisao();
       Desktop.add(frm);
        frm.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemFucionariosActionPerformed

    private void jMenuItemCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCliActionPerformed
    
       ClienteVisao frm = new ClienteVisao();
       Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemCliActionPerformed

    private void jMenuItemCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCardapioActionPerformed
        CardapioVisao frm = new CardapioVisao();
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemCardapioActionPerformed

    private void jMenuItemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPedidosActionPerformed
        PedidoVisao frm = new PedidoVisao(1);
        Desktop.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItemPedidosActionPerformed

    
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCardapio;
    private javax.swing.JMenuItem jMenuItemCli;
    private javax.swing.JMenuItem jMenuItemEntregadores;
    private javax.swing.JMenuItem jMenuItemFucionarios;
    private javax.swing.JMenuItem jMenuItemPedidos;
    private javax.swing.JMenu jMenuOperacoes;
    // End of variables declaration//GEN-END:variables
}
