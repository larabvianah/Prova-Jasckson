import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Pista {
  
   
    private String numero;
   

    
    public Pista(String numero) {
  
       
        this.numero = numero;
 
        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO PISTA (NUMERO) VALUES (?);"
             );
             stmt.setString(1, this.getNumero());
             
             stmt.execute();
             DAO.closeConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }


    public String getNumero() {
        return this.numero;
    }
    


    public void setNumero(String local) {
        this.numero = numero;
    }


    
    @Override
    public String toString() {
        return 
         
            " Numero =" + getNumero() + "\n" ;
         
    }

}



    
}
