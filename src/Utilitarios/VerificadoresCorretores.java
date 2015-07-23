
package Utilitarios;

import java.text.SimpleDateFormat;
import java.util.Date;


public class VerificadoresCorretores {
    
    public static String converterParaSQL(String Data){
        return Data.substring(6,10)+ "-" +Data.substring(3,5)+ "-" +Data.substring(0,2);//Metodo para converter a data para ingles
        
    }
    public static String converterParaJava(String Data){
        return Data.substring(8,10)+ "/" +Data.substring(5,7)+ "/" +Data.substring(0,4);//Metodo para converter a data para portuges   
    }
    public static String RetornarDataActual(){
    SimpleDateFormat FormataData = new SimpleDateFormat("dd/MM/yyyy");
    Date DataActual = new Date();
        return FormataData.format(DataActual);
        
    }  
}
