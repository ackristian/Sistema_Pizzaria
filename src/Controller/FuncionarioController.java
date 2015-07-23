
package Controller;

import Beans.FuncionarioBeans;
import Model.FuncionarioModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FuncionarioController {
    FuncionarioModel FuncM;
    public FuncionarioController(){
        FuncM = new FuncionarioModel();
    }
    
    public String ControleID(){
        return FuncM.proximoFuncionario();
    }
     public void ControlePesqusa(String Pesquisa,DefaultTableModel Modelo){
        FuncM.Pesqusar(Pesquisa, Modelo);
     }
     public FuncionarioBeans controlePreenchimentoCampos(int Codigo){
        return FuncM.preencherCampos(Codigo);
    }
     public boolean VerificarDados(FuncionarioBeans func, int Cargo, int Permissao){
        
        if(func.getNome().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Nome não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(Cargo == 0){
            JOptionPane.showMessageDialog(null,"Obrigatorio Selecionar um Cargo!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(Permissao == 0){
            JOptionPane.showMessageDialog(null,"Obrigatorio Selecionar uma Permissão!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(func.getLogin().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Login não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(func.getSenha().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Senha não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         
        
         FuncM.cadastrarFuncionario(func);
        return true;
    }
      public boolean EditarDados(FuncionarioBeans func, int Cargo, int Permissao){
        
        if(func.getNome().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Nome não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(Cargo == 0){
            JOptionPane.showMessageDialog(null,"Obrigatorio Selecionar um Cargo!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(Permissao == 0){
            JOptionPane.showMessageDialog(null,"Obrigatorio Selecionar uma Permissão!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(func.getLogin().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Login não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(func.getSenha().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Senha não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         
        
         FuncM.editarFuncionario(func);
        return true;
    }
}
