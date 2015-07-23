
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexao {
    private final String URL = "jdbc:mysql://localhost:3306/pizzaria";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "ac";
    private final String Senha = "261989";
    private static Connection conn;
    
    public Conexao(){
        try {
            Class.forName(Driver);
           
            conn = DriverManager.getConnection(URL,Usuario,Senha);
             conn.setAutoCommit(false);
            JOptionPane.showMessageDialog(null, "Conectou com Sucesso","CONECTOU",1);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o banco","ERRO",0);
        }
    }
   public static Connection getConnection(){
      if(conn == null){
          new Conexao();
      }
       return conn;
   } 
   public static void closeConnection(){
        try {
            if(!conn.isClosed()){
               
                    conn.close();
                }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public static void main(String args[]){
       Conexao.getConnection();
   }
}
