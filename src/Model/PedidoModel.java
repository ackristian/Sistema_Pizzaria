package Model;

import Beans.PedidoBeans;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PedidoModel {
    
    public  PedidoModel() {
    
    }
    public void pesquisaItens(String Pesquisa,List<String> ListaItens){
        try {
            String SQLPesquisa ="select * from cardapio where car_descricao like '%"+ Pesquisa +"%';";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLPesquisa);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ListaItens.add(rs.getString("car_descricao"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public double valorItem(String Pesquisa){
        try {
            String SQLPesquisa ="select * from cardapio where car_descricao = ?;";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLPesquisa);
            pst.setString(1, Pesquisa);
            ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    return rs.getDouble("car_valor");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public int codigoItem(String Pesquisa){
        try {
            String SQLPesquisa ="select * from cardapio where car_descricao = ?;";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLPesquisa);
            pst.setString(1, Pesquisa);
            ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    return rs.getInt("car_cod");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public void CadastrarPedido(String codCliente,String codFuncionario,String Total,int tamanhoTabela,PedidoBeans PediB){
            Date Data = new Date();
            SimpleDateFormat FormatoData = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
        try {
            String SQLInsertPedido = "insert into pedido(ped_cli_cod, ped_fun_cod, ped_data, ped_hora, ped_total, ped_status) values(?,?,?,?,?,?);";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertPedido);
                pst.setString(1,codCliente);
                pst.setString(2, codFuncionario);
                pst.setString(3, FormatoData.format(Data));
                pst.setString(4, FormatoHora.format(Data));
                pst.setString(5, Total);
                pst.setString(6,"Pedido Aberto");
                pst.execute();
                    cadastrarItens(codCliente, codFuncionario,codigoPedido(),tamanhoTabela, PediB);
                //codigoPedido();
                Conexao.getConnection().commit();
                 JOptionPane.showMessageDialog(null,"Cadastrdo com Sucesso","CADASTRO",1);
        } catch (SQLException ex) {
                try {
                    Conexao.getConnection().rollback();
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar Clente \n ERRO DE SQL:"+ex);
                    //JOptionPane.showMessageDialog(null,"erro na insercao de dados\nErro:"+ex);
                } catch (SQLException ex1) {
                    Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex1);
                }
        }  
    }
    public String codigoPedido(){
        String Cod= "0";
        try {
            String SQLSelection = "select ped_cod from pedido order by ped_cod desc limit 1";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);    
            ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    Cod = rs.getString("ped_cod");
                }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //JOptionPane.showMessageDialog(null, Cod);
        return Cod;
      }
    public void cadastrarItens(String codCliente,String codFuncionario,String codigoPedido,int tamanhoTabela,PedidoBeans PediB){
        for(int i=0; i< tamanhoTabela; i++){
            try {
                String SQLInsertItens = "insert into item(item_fun_cod,item_cli_cod,item_ped_cod,item_car_cod,item_quantidade)"
                        + "values(?,?,?,?,?)";
                PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertItens);
                pst.setString(1, codFuncionario);
                pst.setString(2, codCliente);
                pst.setString(3, codigoPedido);
                pst.setInt(4, PediB.getCodCardapio(i));
                pst.setInt(5,PediB.getQuantidade(i));
                
                    pst.execute();
            } catch (SQLException ex) {
                try {
                    Conexao.getConnection().rollback();
                    JOptionPane.showMessageDialog(null,"Erro ao cadastrar Clente \n ERRO DE SQL:"+ex);
                    //JOptionPane.showMessageDialog(null,"erro na insercao de dados\nErro:"+ex);
                } catch (SQLException ex1) {
                    Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex1);
                }
                Logger.getLogger(PedidoModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
