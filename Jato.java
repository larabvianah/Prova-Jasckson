public class Jato {

    private String cor;
    private int velocidade;
    private int id;
    private String jato;
    

    public Jato(String cor, int velocidade){
        this.cor = cor;
        this.velocidade = velocidade;
        this.jato = jato;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(){
        this.cor = cor;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(){
        this.velocidade = velocidade;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getJato(){
        return this.jato;
    }

    public void setJato(){
        this.jato = jato;
    }

    @Override
    public String toString() {
        return 
        "Cor = " + getCor() + "\n" +
        "Velocidade = " + getVelocidade();
    }


















}
