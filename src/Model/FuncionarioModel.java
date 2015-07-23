
package Model;

import Beans.FuncionarioBeans;
import Utilitarios.Conexao;
import Utilitarios.VerificadoresCorretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FuncionarioModel {

    public FuncionarioModel(){
        
    }
    
    public void cadastrarFuncionario(FuncionarioBeans func){
        
        String SQLInsertion = "insert into login (fun_nome,fun_senha,fun_permissao,fun_cargo,fun_datacad,fun_login) values(?,?,?,?,?,?);";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLInsertion);
            pst.setString(1,func.getNome());
            pst.setString(2,func.getSenha());
            pst.setString(3,func.getPermissao());
            pst.setString(4,func.getCargo());
            pst.setString(5,VerificadoresCorretores.converterParaSQL(func.getDataCad()));
            pst.setString(6,func.getLogin());
            pst.execute();
            
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
            JOptionPane.showMessageDialog(null,"Cadastrdo com Sucesso","CADASTRO",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar ","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
     
    
    public String proximoFuncionario(){
        try {
            String SQLSelection ="select * from login order by fun_cod desc limit 1;";// seleciona clientes por ordem decrescente por limite 1 q retorna o proximo valor sempre maior
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return (Integer.parseInt(rs.getString("fun_cod"))+1)+"";//Para mostrar o ID do proximo cliente.
            }else{
                String SQLResetIncrement ="alter table login auto_increment =1;";//
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
            String SQLSelection = "select * from login where fun_nome like '%"+Pesquisa+"%'";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
             ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 Modelo.addRow(new Object[] {rs.getString("fun_cod"),rs.getString("fun_nome"),rs.getString("fun_cargo"),rs.getString("fun_permissao")});
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Pesqusar Funcionario","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
    public FuncionarioBeans preencherCampos(int Codigo){
        
        FuncionarioBeans Func = new FuncionarioBeans();
        
        try {
            String SQLSelection = "select * from login where fun_cod = ?";
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLSelection);
            pst.setInt(1,Codigo);
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
               Func.setCodigo(rs.getInt("fun_cod"));
               Func.setNome(rs.getString("fun_nome"));
               Func.setSenha(rs.getString("fun_senha"));
               Func.setPermissao(rs.getString("fun_permissao"));
               Func.setCargo(rs.getString("fun_cargo"));
               Func.setDataCad(VerificadoresCorretores.converterParaJava(rs.getString("fun_datacad")));
               Func.setLogin(rs.getString("fun_login"));
             }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Preencher os Campos","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
        return Func;
    }
    public void editarFuncionario(FuncionarioBeans func){
         String SQLEdition = "update login set fun_nome=?,fun_senha = ?,fun_permissao = ? ,fun_cargo = ?,fun_login = ? where fun_cod=?;";
        try {
            PreparedStatement pst = Conexao.getConnection().prepareStatement(SQLEdition);
            pst.setString(1,func.getNome());
            pst.setString(2,func.getSenha());
            pst.setString(3,func.getPermissao());
            pst.setString(4,func.getCargo());
            pst.setString(5,func.getLogin());
           pst.setInt(6,func.getCodigo());
            
            pst.execute();
            Conexao.getConnection().commit();//Permite salvar efectivamente os dados acima no banco.
           
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso","EDITAR",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar Clente","ERRO DE SQL",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
        }
    }
}

