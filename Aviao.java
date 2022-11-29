public class{

    private int id;
    private String prefixo;
    private int capacidade;
    Companhia companhia;
    int id_companhia;

    public Aviao(int id, String prefixo, int capacidade, int id_companhia) {
        this.id = id;
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.id_companhia = companhia.getId();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo() {
        this.prefixo = prefixo;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade() {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return 
        "Id = " + getId() + "\n" +
        "Prefixo = " + getPrefixo() + "\n" +
        "Capacidade = " + getCapacidade();
        "ID Companhia =" + getCompanhia();
    }





















}