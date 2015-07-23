
package Controller;

import Beans.CardapioBeans;
import Beans.FuncionarioBeans;
import Model.CardapioModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CardapioController {
    CardapioModel CardM;
    
    
    public CardapioController() {
    
     CardM = new CardapioModel();
}
   
     public String ControleID(){
        return CardM.proximoCardapio();
    }
      public void ControlePesqusa(String Pesquisa,DefaultTableModel Modelo){
        CardM.Pesqusar(Pesquisa, Modelo);
     }
       public CardapioBeans controlePreenchimentoCampos(int Codigo){
        return CardM.preencherCampos(Codigo);
    }
     public boolean VerificarDados(CardapioBeans Card, String Valor){
        
        if(Card.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Descrição não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         
         if(Valor.equals("")){
            JOptionPane.showMessageDialog(null,"Campo Valor não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         CardM.cadastrarCardapio(Card);
       return true;          
    }
     public boolean EditarDados(CardapioBeans Card, String Valor){
        
        if(Card.getDescricao().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Descrição não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         
         if(Valor.equals("")){
            JOptionPane.showMessageDialog(null,"Campo Valor não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
         CardM.editarCardapio(Card);
       return true;          
    }
}
