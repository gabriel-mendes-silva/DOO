package DOO;

public class Quarto {
    private int id;
    private String descricao;
    private int capacidadeHospedes;
    private float metragem;
    private String identificacao;
    private int andar;
    private boolean flagAnimais;
    private String obs;
    private char status;

    public Quarto(int andar, int capacidadeHospedes, String descricao, boolean flagAnimais, int id, String identificacao, float metragem, String obs, char status) {
        this.andar = andar;
        this.capacidadeHospedes = capacidadeHospedes;
        this.descricao = descricao;
        this.flagAnimais = flagAnimais;
        this.id = id;
        this.identificacao = identificacao;
        this.metragem = metragem;
        this.obs = obs;
        this.status = status;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCapacidadeHospedes() {
        return capacidadeHospedes;
    }

    public void setCapacidadeHospedes(int capacidadeHospedes) {
        this.capacidadeHospedes = capacidadeHospedes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFlagAnimais() {
        return flagAnimais;
    }

    public void setFlagAnimais(boolean flagAnimais) {
        this.flagAnimais = flagAnimais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public float getMetragem() {
        return metragem;
    }

    public void setMetragem(float metragem) {
        this.metragem = metragem;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "andar=" + andar +
                ", id=" + id +
                ", descricao='" + descricao + '\'' +
                ", capacidadeHospedes=" + capacidadeHospedes +
                ", metragem=" + metragem +
                ", identificacao='" + identificacao + '\'' +
                ", flagAnimais=" + flagAnimais +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
