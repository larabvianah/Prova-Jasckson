public class Hangar {

    private int id;
    private String local;
    Aviao aviao;
    int id_aviao;

    public Hangar (int id, String local, int id_aviao) {
        this.id = id;
        this.local = local;
        this.id_aviao = aviao.getId();

    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getLocal(){
        return this.local;
    }
       
    public void setLocal(){
        this.local = local;
    }


    @Override
    public String toString() {
        return 
        "Id = " + getId() + "\n" +
        "Local = " + getLocal() + "\n" +
        "Id_aviao =" + aviao.getId();
        
    }























    
}
