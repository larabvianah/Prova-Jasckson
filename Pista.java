public class Pista {

    private int id;
    private String numero;
    private String pista;


    public Pista (int id, String numero){
        this.id = id;
        this.numero = numero;
        this.pista = pista;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public String getPista(){
        return this.pista;
    }

    public void setPista(){
        this.pista = pista;
    }

    @Override
    public String toString() {
        return 
        "Id = " + getId() + "\n" +
        "Número = " + getNumero();
        
    }





    
}
