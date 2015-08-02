
package Visao;

import Beans.ClienteBeans;
import Beans.PedidoBeans;
import Controller.ClienteController;
import Controller.PedidoController;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class PedidoVisao extends javax.swing.JInternalFrame {
    ClienteBeans CliB;
    ClienteController CliC;
    List<String> Lista;
    PedidoBeans PediB;
    PedidoController PediC;
    List<String> ListaItens;
    MaskFormatter FormatarTelefone;
    DefaultTableModel Modelo;
    DecimalFormat formatoDecimal;
    Date DataAtual;
    SimpleDateFormat FormatoData,FormatoHora;
    int codFuncionario;
    public PedidoVisao(int codFuncionario) {
        initComponents();
        this.codFuncionario = codFuncionario;
        Modelo = (DefaultTableModel)jTablePedido.getModel(); 
        CliB = new ClienteBeans();
        CliC = new ClienteController();
        PediB= new PedidoBeans();
        PediC= new PedidoController();
        Lista = new ArrayList<>();
        ListaItens=new ArrayList<>();
        formatoDecimal = new DecimalFormat("0.00");
        FormatoData = new SimpleDateFormat("yyyy-MM-dd");
        FormatoHora = new SimpleDateFormat("HH:mm:ss");
        jTablePedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        habilitaCampos(false);
        jTextFieldIdCliente.setEditable(false);
       PanePai.setEnabledAt(1, false);
       jTextFieldValor.setEditable(false);
       jTextFieldCodItem.setEditable(false);
       jTextFieldVaTotal.setEditable(false);
       jButtonFinalizar.setEnabled(false);
       jTextFieldCliente.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        PanePai = new javax.swing.JTabbedPane();
        jPanelCliente = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jComboBoxPesquisar = new javax.swing.JComboBox();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEndercoCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBairroCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        try{
            FormatarTelefone = new MaskFormatter("(##)####-####");
        }
        catch(Exception Erro){
            JOptionPane.showMessageDialog(null,"Impossivel Formatar","ERRO DE FORMATAÇÃO",0);
        }
        jTextFieldTelefCli = new JFormattedTextField(FormatarTelefone);
        ;
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDatacadCli = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSair = new javax.swing.JButton();
        jButtonContinuar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelPedido = new javax.swing.JPanel();
        jTextFieldCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBusItem = new javax.swing.JTextField();
        jComboBoxItem = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonFinalizar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonCalacTotal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldVaTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCodItem = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pedidos");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2c_search.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jComboBoxPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Bairro:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("Data do Cadastro:");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonContinuar.setText("Continuar Pedido");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEndercoCli)
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 89, Short.MAX_VALUE))
                                    .addComponent(jTextFieldBairroCli)))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClienteLayout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTelefCli, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDatacadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClienteLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButtonContinuar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair)
                                .addGap(29, 29, 29)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndercoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDatacadCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        PanePai.addTab("Clientes", jPanelCliente);

        jTextFieldCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("Buscar Item:");

        jTextFieldBusItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusItemActionPerformed(evt);
            }
        });

        jComboBoxItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxItemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel8.setText("Selecionar Item:");

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton1.setText("Valor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel9.setText("Quantidade:");

        jTablePedido.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Item", "Descrição", "Valor UNIT", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePedido);

        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("--");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonFinalizar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jButtonFechar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonCalacTotal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButtonCalacTotal.setText("Calcular");
        jButtonCalacTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalacTotalActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel10.setText("V.Total:");

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel11.setText("ID Item:");

        javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
        jPanelPedido.setLayout(jPanelPedidoLayout);
        jPanelPedidoLayout.setHorizontalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButtonFinalizar)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonFechar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCalacTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBusItem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldQuantidade)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodItem)))))
                .addContainerGap())
        );
        jPanelPedidoLayout.setVerticalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCodItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldBusItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonRemove)
                    .addComponent(jButtonCalacTotal)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldVaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinalizar)
                    .addComponent(jButtonFechar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanePai.addTab("Pedidos", jPanelPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanePai, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanePai)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
           dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        jComboBoxPesquisar.removeAllItems();
        Lista.clear();
        String pesquisa = JOptionPane.showInputDialog(null,"Digite nome do Cliente:","PESQUISAR CLIENTE",3);
        CliC.ControlePesqusa(pesquisa,Lista);
        for(String s:Lista){
            jComboBoxPesquisar.addItem(s);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jComboBoxPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarActionPerformed
        if(!(jComboBoxPesquisar.getSelectedItem() == null)){
            String Cod = jComboBoxPesquisar.getSelectedItem().toString();
            Cod = Cod.substring(0,Cod.indexOf(" "));
            CliB = CliC.controlePreenchimentoCampos(Integer.parseInt(Cod));
           // JOptionPane.showMessageDialog(null,"Mostrar:"+ Cod);
                jTextFieldIdCliente.setText(CliB.getCodigo() + "");
                jTextFieldNomeCli.setText(CliB.getNome());
                jTextFieldEndercoCli.setText(CliB.getRua());
                jTextFieldBairroCli.setText(CliB.getBairro());
                jTextFieldTelefCli.setText(CliB.getTelefone());
                jTextFieldDatacadCli.setText(CliB.getDataCad());
        }
        
    }//GEN-LAST:event_jComboBoxPesquisarActionPerformed

    private void jTextFieldBusItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusItemActionPerformed
        jComboBoxItem.removeAllItems();
        ListaItens.clear();
        jTextFieldValor.setText("");
        jTextFieldCodItem.setText("");
        jTextFieldQuantidade.setText("");
        PediC.controleItens(jTextFieldBusItem.getText(), ListaItens);
            for(String s: ListaItens){
                jComboBoxItem.addItem(s);
            }
    }//GEN-LAST:event_jTextFieldBusItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldValor.setText(PediC.controleValorItem(jComboBoxItem.getSelectedItem().toString())+ "");
        jTextFieldCodItem.setText(PediC.controleCodigoItem(jComboBoxItem.getSelectedItem().toString())+ "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxItemActionPerformed
         jTextFieldValor.setText("");
         jTextFieldQuantidade.setText("");
         jTextFieldCodItem.setText("");
    }//GEN-LAST:event_jComboBoxItemActionPerformed

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed
       PanePai.setEnabledAt(1, true);
       PanePai.setEnabledAt(0, false);
       PanePai.setSelectedIndex(1);
       jTextFieldCliente.setText(jTextFieldNomeCli.getText());
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        if(PediC.verificaItens(jTextFieldValor.getText(),jTextFieldQuantidade.getText(),jTextFieldCodItem.getText(),jComboBoxItem.getSelectedItem().toString())){
            double Total = Double.parseDouble(jTextFieldValor.getText()) * Integer.parseInt(jTextFieldQuantidade.getText());
            Modelo.addRow(new Object[]{jTextFieldCodItem.getText(),jComboBoxItem.getSelectedItem(),jTextFieldValor.getText(),jTextFieldQuantidade.getText(),formatoDecimal.format(Total).replace(',', '.')});
            limpaItens();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        Modelo.removeRow(jTablePedido.getSelectedRow());
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonCalacTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalacTotalActionPerformed
       double TotalPedido = 0;
        for(int i = 0; i < jTablePedido.getRowCount();i++){
            TotalPedido += Double.parseDouble(Modelo.getValueAt(i, 4).toString());
        }
        jTextFieldVaTotal.setText(formatoDecimal.format(TotalPedido).replace(',','.'));
            populaBeans();
            if(TotalPedido > 0){
                jButtonFinalizar.setEnabled(true);
                jButtonAdd.setEnabled(false);
                jButtonRemove.setEnabled(false);
                jButtonCalacTotal.setEnabled(false);
            }
    }//GEN-LAST:event_jButtonCalacTotalActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        PediC.ControlePedido(jTextFieldIdCliente.getText(), codFuncionario + "",jTextFieldVaTotal.getText(),jTablePedido.getRowCount(),PediB);
        limpaFinaliza();
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanePai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCalacTotal;
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox jComboBoxItem;
    private javax.swing.JComboBox jComboBoxPesquisar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JTextField jTextFieldBairroCli;
    private javax.swing.JTextField jTextFieldBusItem;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldCodItem;
    private javax.swing.JTextField jTextFieldDatacadCli;
    private javax.swing.JTextField jTextFieldEndercoCli;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldNomeCli;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTelefCli;
    private javax.swing.JTextField jTextFieldVaTotal;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
    
    final void habilitaCampos(boolean valor){
        jTextFieldNomeCli.setEditable(valor);
        jTextFieldEndercoCli.setEditable(valor);
        jTextFieldBairroCli.setEditable(valor);
        jTextFieldTelefCli.setEditable(valor);
        jTextFieldDatacadCli.setEditable(valor);
    }
    final void limpaItens(){
        jTextFieldBusItem.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValor.setText("");
        jTextFieldCodItem.setText("");
        jComboBoxItem.removeAllItems();
    }
    final void populaBeans(){
        DataAtual = new Date();
        PediB.setCodCliente(Integer.parseInt((jTextFieldIdCliente.getText())));
        PediB.setCodFuncionario(codFuncionario);
        PediB.setData(FormatoData.format(DataAtual));
        PediB.setHora(FormatoHora.format(DataAtual));
        PediB.setStatus("Pedido Aberto");
        PediB.setValor(Double.parseDouble(jTextFieldVaTotal.getText()));
        for(int i = 0; i < jTablePedido.getRowCount();i++){
            PediB.setCodCardapio(Integer.parseInt(Modelo.getValueAt(i, 0).toString()));
            PediB.setQuantidade(Integer.parseInt(Modelo.getValueAt(i, 3).toString()));
        }   
    }
    final void limpaFinaliza(){
        jTextFieldVaTotal.setText("");
        jButtonFinalizar.setEnabled(false);
        Modelo.setNumRows(0);
        jTextFieldCliente.setText("");
    }
}

