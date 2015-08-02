
package Controller;

import Beans.ClienteBeans;
import Model.ModelCliente;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClienteController {
    ModelCliente ClienteM;

    public ClienteController() {
            ClienteM = new ModelCliente();
    }
    
    public boolean VerificarDados(ClienteBeans cliente){
        
        if(cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Nome não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Bairro não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Rua não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
     
    }
         if(cliente.getTelefone().equals("(  )    -    ")){
            JOptionPane.showMessageDialog(null,"Campo Telefone não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
         }
         ClienteM.cadastrarCliente(cliente);
        return true;
    }
    public String ControleID(){
        return ClienteM.proximoCliente();
    }
    public void ControlePesqusa(String Pesquisa,DefaultTableModel Modelo){
        ClienteM.Pesqusar(Pesquisa, Modelo);
    }
     public void ControlePesqusa(String Pesquisa,List<String> Lista){
        ClienteM.Pesqusar(Pesquisa, Lista);
    }
    public ClienteBeans controlePreenchimentoCampos(int Codigo){
        return ClienteM.preencherCampos(Codigo);
    }
    public boolean VerificarDadosAlterados(ClienteBeans cliente){
        
        if(cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Nome não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         if(cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Bairro não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
    }
         if(cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Rua não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
     
    }
         if(cliente.getTelefone().equals("(  )    -    ")){
            JOptionPane.showMessageDialog(null,"Campo Telefone não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
         }
         ClienteM.editarCliente(cliente);
        return true;
    }   
}
