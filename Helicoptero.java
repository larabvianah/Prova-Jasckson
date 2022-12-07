import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Helicotero {
    


    private String modelo;
    private String marca;
    private String cor;
    private int capacidade;



    public Helicotero(String modelo,String marca, int capacidade,String cor) throws SQLException {
  
  
        this.modelo = modelo;
        this.marca = marca;
        this.capacidade = capacidade;
        this.cor = cor;
       

        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO helicoptero (MARCA, MODELO, CAPACIDADE, COR) VALUES (?, ?, ?, ?);"
             );
             stmt.setString(1, this.getMarca());
             stmt.setString(2, this.getModelo());
             stmt.setInt(3, this.getCapacidade());
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
    

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


  

    @Override
    public String toString() {
        return 
            " Marca =" + getMarca() + "\n" + 
            " Capacidade =" + getCapacidade() + "\n" + 
            " Cor =" + getCor() + "\n" + 
            " Capacidade =" + getCapacidade();
          
    }


}























}
