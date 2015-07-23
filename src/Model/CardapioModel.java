
package Model;

import Beans.CardapioBeans;
import Utilitarios.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CardapioModel {
    
    public CardapioModel() {
    
    }
     public void cadastrarCardapio(CardapioBeans card){
        
        String SQLInsertion = "insert into cardapio (car_descricao,car_tipo,car_valor) values(?,?,?);";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1,card.getDescricao());
            pst.setString(2,card.getTipo());
            pst.setDouble(3,card.getValor());
            pst.execute();
            
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
            JOptionPane.showMessageDialog(null,"Cadastrdo com Sucesso","CADASTRO",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar ","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
     public void editarCardapio(CardapioBeans card){
         String SQLEdition = "update cardapio set car_descricao=?,car_tipo = ?,car_valor = ? where car_cod=?;";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLEdition);
            pst.setString(1,card.getDescricao());
            pst.setString(2,card.getTipo());
            pst.setDouble(3,card.getValor());
            pst.setInt(4,card.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
           
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso","EDITAR",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
     public String proximoCardapio(){
        try {
            String SQLSelection ="select * from cardapio order by car_cod desc limit 1;";// seleciona clientes por ordem decrescente por limite 1 q retorna o proximo valor sempre maior
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("car_cod"))+1)+"";//Para mostrar o ID do proximo cliente.
            }else{
                String SQLResetIncrement ="alter table cardapio auto_increment =1;";//
                PreparedStatement pstIncrement = Conexao.getConnection().prepareStatement(SQLResetIncrement);
                pstIncrement.execute();
                Conexao.getConnection().commit();
                return "1";
            }
        } catch (SQLException ex) {  
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Proximo Cardapio","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
             return "0";
        }   
    }
     public void Pesqusar(String Pesquisa,DefaultTableModel Modelo){
        try {
            String SQLSelection = "select * from cardapio where car_descricao like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 Modelo.addRow(new Object[] {rs.getString("car_cod"),rs.getString("car_descricao"),rs.getString("car_tipo"),rs.getString("car_valor")});
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Pesqusar Funcionario","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
      public CardapioBeans preencherCampos(int Codigo){
        
        CardapioBeans Card = new CardapioBeans();
        
        try {
            String SQLSelection = "select * from cardapio where car_cod = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1,Codigo);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               Card.setCodigo(rs.getInt("car_cod"));
               Card.setDescricao(rs.getString("car_descricao"));
               Card.setTipo(rs.getString("car_tipo"));
               Card.setValor(rs.getDouble("car_valor"));
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Preencher os Campos","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
        return Card;
    }
}
