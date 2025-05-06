package DOO;

public class AlocacaoVaga {
    private int id;
    private String obs;
    private char status;

    public AlocacaoVaga(int id, String obs, char status) {
        this.id = id;
        this.obs = obs;
        this.status = status;
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

    @Override
    public String toString() {
        return "AlocacaoVaga{" +
                "id=" + id +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
