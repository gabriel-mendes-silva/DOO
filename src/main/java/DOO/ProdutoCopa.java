package DOO;

public class ProdutoCopa {
    private int id;
    private String descricao;
    private float valor;
    private String obs;
    private char status;

    public ProdutoCopa(String descricao, int id, String obs, char status, float valor) {
        this.descricao = descricao;
        this.id = id;
        this.obs = obs;
        this.status = status;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ProdutoCopa{" +
                "descricao='" + descricao + '\'' +
                ", id=" + id +
                ", valor=" + valor +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
