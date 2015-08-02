
package Beans;


public class FuncionarioBeans {
            
    private int Codigo;
    private String Nome;
    private String Cargo;
    private String Permissao;
    private String DataCad;
    private String Senha;
    private String Login;
    
    public FuncionarioBeans(){
    
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getPermissao() {
        return Permissao;
    }

    public void setPermissao(String Permissao) {
        this.Permissao = Permissao;
    }

    public String getDataCad() {
        return DataCad;
    }

    public void setDataCad(String DataCad) {
        this.DataCad = DataCad;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }
}
    
