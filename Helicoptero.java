public class Helicoptero {

    private String cor;
    private int capacidade;
    private int id;
    private String helicoptero;
    

    public Helicoptero (String cor, int capacidade) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.id = id;
        this.helicoptero = helicoptero;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(){
        this.cor = cor;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public void serCapacidade(){
        this.capacidade = capacidade;
    }

    public int getId(){
        return this.id;
    }

    public void setId(){
        this.id = id;
    }

    public String getHelicoptero(){
        return this.helicoptero;
    }

    public void setHelicoptero(){
        this.helicoptero = helicoptero;
    }

    @Override
    public String toString() {
        return 
        "Cor = " + getCor() + "\n" +
        "Capacidade = " + getCapacidade();
    }
























}
