import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Companhia {
    

    private int id;
    private String nome;
    private String cnpj;
    
 
    
    public Companhia(String nome, String cnpj) throws SQLException {
  
   
        this.nome = nome;
        this.cnpj = cnpj;

        
        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO COMPANHIA (NOME, CNPJ) VALUES (?, ?);"
             );
             stmt.setString(1, this.getNome());
             stmt.setString(2, this.getCnpj());
             stmt.execute();
             DAO.closeConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public String toString() {
        return 
            " Id =" + getId() + "\n" +
            " Nome =" + getNome() + "\n" + 
            " Cnpj =" + getCnpj();
    }

}
