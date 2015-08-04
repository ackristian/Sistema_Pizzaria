
package Controller;

import Beans.PedidoBeans;
import Model.PedidoModel;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PedidoController {
    PedidoModel PediM;
  public  PedidoController() {
      PediM = new PedidoModel();
    }  
    public void controleItens(String Pesquisa,List<String> ListaItens){
        PediM.pesquisaItens(Pesquisa, ListaItens);
    }
    public double controleValorItem(String Pesquisa){
       return PediM.valorItem(Pesquisa); 
    }
    public int controleCodigoItem(String Pesquisa){
       return PediM.codigoItem(Pesquisa);
    }
    public void ControlePedido(String codCliente,String codFuncionario,String Total,int tamanhoTabela,PedidoBeans PediB){
        PediM.CadastrarPedido(codCliente, codFuncionario, Total,tamanhoTabela,PediB);
        //Controle do pedido
    }
    public boolean verificaItens(String Valor, String Quantidade, String Codigo, String Item){
        try{
        int x = Integer.parseInt(Quantidade);
        if(x==0){
            JOptionPane.showMessageDialog(null,"Campo Quantidade não pode ser 0!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Campo Quantidade deve conter um número Inteiro!","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
        if(Quantidade.equals("")){
            JOptionPane.showMessageDialog(null,"Campo Quantidade não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
        
        if(Valor.equals("")){
            JOptionPane.showMessageDialog(null,"Campo Valor não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
        if(Codigo.equals("")){
           JOptionPane.showMessageDialog(null,"Campo ID Item não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
           return false;
        }
        if(Item.equals("")){
            JOptionPane.showMessageDialog(null,"Campo Item selecionado não pode ser vazio","DADOS ICORRECTOS",0,new ImageIcon("Imagens/close-exit-button-11703915.jpg"));
            return false;
        }
        
        return true;
    }
}
