import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aviao {
    

    private int id;
    private String modelo;
    private String marca;
    private String prefixo;
    private int capacidade;
    Companhia companhia;
    private int id_companhia;

    public Aviao(String modelo,String marca, int capacidade,String prefixo, int id_companhia) throws SQLException {
  
  
        this.modelo = modelo;
        this.marca = marca;
        this.capacidade = capacidade;
        this.prefixo = prefixo;
        this.id_companhia = id_companhia;

        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO AVIAO (MARCA, MODELO, CAPACIDADE, PREFIXO, ID_COMPANHIA) VALUES (?, ?, ?, ?, ?);"
             );
             stmt.setString(1, this.getMarca());
             stmt.setString(2, this.getModelo());
             stmt.setInt(3, this.getCapacidade());
             stmt.setString(4, this.getPrefixo());
             stmt.setInt(5, this.getId_companhia());
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

    public String getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }
    

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getId_companhia() {
        return this.id_companhia;
    }

    public void setId_companhia(int id_companhia) {
        this.id_companhia = id_companhia;
    }

    @Override
    public String toString() {
        return 
            " Id =" + getId() + "\n" +
            " Modelo =" + getPrefixo() + "\n" + 
            " Marca =" + getPrefixo() + "\n" + 
            " Prefixo =" + getPrefixo() + "\n" + 
            " Capacidade =" + getCapacidade()+ "\n" +
            " ID Companhia =" + companhia.getId()+ "\n";
    }


}



















}