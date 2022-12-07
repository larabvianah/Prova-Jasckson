import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Hangar {
  
    private int id;
    private String local;
    Aviao aviao;
    private int id_aviao;

    
    public Hangar(String local, int id_aviao) {
  
       
        this.local = local;
        this.id_aviao = id_aviao;

        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO HANGAR (LOCAL, ID_AVIAO) VALUES (?, ?);"
             );
             stmt.setString(1, this.getLocal());
             stmt.setInt(2, this.getId_aviao());
             stmt.execute();
             DAO.closeConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getLocal() {
        return this.local;
    }
    


    public void setLocal(String local) {
        this.local = local;
    }

    public int getId_aviao() {
        return this.id_aviao;
    }
    


    public void setId_aviao(int local) {
        this.id_aviao = id_aviao;
    }


    
    @Override
    public String toString() {
        return 
            " Id =" + getId() + "\n" +
            " Local =" + getLocal() + "\n" + 
            " ID_Avião =" + getId_aviao();
    }

}





















    
}
