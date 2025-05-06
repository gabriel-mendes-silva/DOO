package DOO;

public class VagaEstacionamento {
    private int id;
    private String descricao;
    private float metragemVaga;
    private String obs;
    private char status;

    public VagaEstacionamento(String descricao, int id, float metragemVaga, String obs, char status) {
        this.descricao = descricao;
        this.id = id;
        this.metragemVaga = metragemVaga;
        this.obs = obs;
        this.status = status;
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

    public float getMetragemVaga() {
        return metragemVaga;
    }

    public void setMetragemVaga(float metragemVaga) {
        this.metragemVaga = metragemVaga;
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
        return "VagaEstacionamento{" +
                "descricao='" + descricao + '\'' +
                ", id=" + id +
                ", metragemVaga=" + metragemVaga +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
