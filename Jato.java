import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jato {
    


    private String modelo;
    private String marca;
    private String cor;
    private int velocidade;



    public Jato(String modelo,String marca, int velocidade,String cor) throws SQLException {
  
  
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
        this.cor = cor;
       

        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO JATO (MARCA, MODELO, VELOCIDADE, COR) VALUES (?, ?, ?, ?);"
             );
             stmt.setString(1, this.getMarca());
             stmt.setString(2, this.getModelo());
             stmt.setInt(3, this.getVelocidade());
             stmt.setString(4, this.getCor());
             stmt.execute();
             DAO.closeConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }


    }

 

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setPrefixo(String cor) {
        this.cor = cor;
    }
    

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setCapacidade(int velocidade) {
        this.velocidade = velocidade;
    }


  

    @Override
    public String toString() {
        return 
            " Marca =" + getMarca() + "\n" + 
            " Capacidade =" + getModelo() + "\n" + 
            " Cor =" + getCor() + "\n" + 
            " Velocidade =" + getVelocidade();
          
    }


}















}
