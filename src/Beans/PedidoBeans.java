
package Beans;

import java.util.ArrayList;
import java.util.List;


public class PedidoBeans {
    private int codPedido;
    private int codCliente;
    private int codFuncionario;
    private int codIntregador;
    private String Data;
    private String Hora;
    private double Valor;
    private String Status;
    private List<Integer>CodCardapio;
    private List<Integer>Quantidade;
    
    public  PedidoBeans() {
        CodCardapio = new ArrayList<>();
        Quantidade = new ArrayList<>();
    
    }

    /**
     * @return the codPedido
     */
    public int getCodPedido() {
        return codPedido;
    }

    /**
     * @param codPedido the codPedido to set
     */
    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    /**
     * @return the codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the codIntregador
     */
    public int getCodIntregador() {
        return codIntregador;
    }

    /**
     * @param codIntregador the codIntregador to set
     */
    public void setCodIntregador(int codIntregador) {
        this.codIntregador = codIntregador;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the Hora
     */
    public String getHora() {
        return Hora;
    }

    /**
     * @param Hora the Hora to set
     */
    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    /**
     * @return the Valor
     */
    public double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the CodCardapio
     */
    public int getCodCardapio(int posicao) {
        return CodCardapio.get(posicao);
    }

    /**
     * @param CodCardapio the CodCardapio to set
     */
    public void setCodCardapio(int CodCardapio) {
        this.CodCardapio.add(CodCardapio);
    }

    /**
     * @return the Quantidade
     */
    public int getQuantidade(int posicao) {
        return Quantidade.get(posicao);
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(int Quantidade) {
        this.Quantidade.add(Quantidade);
    }
    
}
