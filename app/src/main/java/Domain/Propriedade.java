package Domain;

/**
 * Created by mateus on 12/08/17.
 */
public class Propriedade {

    private Integer id;
    private String nomepropriedade;
    private String localidade;
    private String pais;
    private String cidade;
    private String tipoPropriedade;
    private String datasimulacao;


    public void Propriedade(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomepropriedade() {
        return nomepropriedade;
    }

    public void setNomepropriedade(String nomepropriedade) {
        this.nomepropriedade = nomepropriedade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoPropriedade() {
        return tipoPropriedade;
    }

    public void setTipoPropriedade(String tipoPropriedade) {
        this.tipoPropriedade = tipoPropriedade;
    }

    public String getDatasimulacao() {
        return datasimulacao;
    }

    public void setDatasimulacao(String datasimulacao) {
        this.datasimulacao = datasimulacao;
    }
}
