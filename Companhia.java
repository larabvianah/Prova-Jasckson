public class Companhia {

    private int id;
    private String nome;
    private String cnpj;

    public Companhia(int id, String nome, String cnpj){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
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

    public void setNome() {
        this.nome = nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj() {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return 
        "Id = " + getId() + "\n" +
        "Nome = " + getNome() + "\n" +
        "Cnpj = " + getCnpj();
    }








    
}
