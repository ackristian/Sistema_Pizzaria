
package Model;

import Beans.ClienteBeans;
import Utilitarios.Conexao;
import Utilitarios.VerificadoresCorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModelCliente {
   
    public  ModelCliente(){
   
}
 

    public void cadastrarCliente(ClienteBeans clente){
        
        String SQLInsertion = "insert into cliente (cli_nome,cli_rua,cli_bairro,cli_telefone,cli_datacad) values(?,?,?,?,?);";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1,clente.getNome());
            pst.setString(2,clente.getRua());
            pst.setString(3,clente.getBairro());
            pst.setString(4,clente.getTelefone());
            pst.setString(5,VerificadoresCorretores.converterParaSQL(clente.getDataCad()));
            
            pst.execute();
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
           
            JOptionPane.showMessageDialog(null,"Cadastrdo com Sucesso","CADASTRO",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
        
    }
    public String proximoCliente(){
        try {
            String SQLSelection ="select * from cliente order by cli_cod desc limit 1;";// seleciona clientes por ordem decrescente por limite 1 q retorna o proximo valor sempre maior
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("cli_cod"))+1)+"";//Para mostrar o ID do proximo cliente.
            }else{
                String SQLResetIncrement ="alter table cliente auto_increment =1;";//
                PreparedStatement pstIncrement = Conexao.getConnection().prepareStatement(SQLResetIncrement);
                pstIncrement.execute();
                Conexao.getConnection().commit();
                return "1";
            }
        } catch (SQLException ex) {  
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
             return "0";
        }   
    }
    public void Pesqusar(String Pesquisa,DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from cliente where cli_nome like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 Modelo.addRow(new Object[] {rs.getString("cli_cod"),rs.getString("cli_nome"),rs.getString("cli_rua"),rs.getString("cli_bairro"),rs.getString("cli_telefone")});
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Pesqusar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
    public void Pesqusar(String Pesquisa,List<String> Lista){
        try {
            String SQLSelection = "select * from cliente where cli_nome like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 Lista.add(rs.getString("cli_cod") + " _ " + rs.getString("cli_nome"));
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Pesqusar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
    public ClienteBeans preencherCampos(int Codigo){
        
        ClienteBeans Cliente = new ClienteBeans();
        
        try {
            String SQLSelection = "select * from cliente where cli_cod = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1,Codigo);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               Cliente.setCodigo(rs.getInt("cli_cod"));
               Cliente.setNome(rs.getString("cli_nome"));
               Cliente.setRua(rs.getString("cli_rua"));
               Cliente.setBairro(rs.getString("cli_bairro"));
               Cliente.setTelefone(rs.getString("cli_telefone"));
               Cliente.setDataCad(VerificadoresCorretores.converterParaJava(rs.getString("cli_datacad")));
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Preencher os Campos","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
        return Cliente;
    }
    public void editarCliente(ClienteBeans cliente){
         String SQLEdition = "update cliente set cli_nome=?,cli_rua = ?,cli_bairro = ? ,cli_telefone = ? where cli_cod=?;";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLEdition);
            pst.setString(1,cliente.getNome());
            pst.setString(2,cliente.getRua());
            pst.setString(3,cliente.getBairro());
            pst.setString(4,cliente.getTelefone());
           pst.setInt(5,cliente.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
           
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso","EDITAR",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
}