public class Voo {

    private int id;
    private String numero;
    private String data;
    private String hora;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    Pista pista;
    int id_pista;
    Aviao aviao;
    int id_aviao;
    Helicoptero helicoptero;
    int id_helicoptero;
    Jato jato;
    int id_jato;

    public Voo (int id, String numero, String data, String hora, String destino, String piloto, String copiloto, String observacao, int id_pista, int id_aviao, int id_helicoptero, int id_jato){
    
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.id_pista = pista.getId();
        this.id_aviao = aviao.getId();
        this.id_helicoptero = helicoptero.getId();
        this.id_jato = jato.getId();

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

    public String getData(){
        return this.data;
    } 

    public void setData(){
        this.data = data;
    }

    public String getHora(){
        return this.hora;
    } 

    public void setHora(){
        this.hora = hora;
    }

    public String getDestino(){
        return this.destino;
    } 

    public void setDestino(){
        this.destino = destino;
    }

    public String getPiloto(){
        return this.piloto;
    } 

    public void setPiloto(){
        this.piloto = piloto;
    }

    public String getCopiloto(){
        return this.copiloto;
    } 

    public void setCopiloto(){
        this.copiloto = copiloto;
    }

    public String getObservacao(){
        return this.observacao;
    } 

    public void setObservacao(){
        this.observacao = observacao;
    }

    public static ArrayList<Voo> getVoos() {
        return voos;
    }
    
    public static Voo getVoo(int id) throws Exception {
        for (Voo voo : voos) {
            if (voo.getId() == id) {
                return voo;
            }
        }

        throw new Exception("Voo n??o encontrado");
    }

    public static void excluiVoo(int id) throws Exception {
        Voo voo = getVoo(id);
        voo.exclui(voo);


    @Override                                           
    public String toString() {
        return 
        "Id = " + getId() + "\n" +
        "N??mero = " + getNumero() + "\n" +
        "Data = " + getData() + "\n" +
        "Hora =" + getHora() + "\n" +
        "Destino =" + getDestino() + "\n" +
        "Piloto =" + getPiloto() + "\n" +
        "Copiloto =" + getCopiloto() + "\n" +
        "Observa????o =" + getObservacao() + "\n" +
        "Id_pista =" + pista.getId() + "\n" +
        "Id_aviao =" + aviao.getId() + "\n" +
        "Id_helicoptero =" + helicoptero.getId() + "\n" +
        "Id_jato =" + jato.getId();
    }

























}
