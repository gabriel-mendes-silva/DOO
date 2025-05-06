package model;

public class CheckHospede {
    private int id;
    private String tipoHospede;
    private String obs;
    private char status;

    public CheckHospede(int id, String obs, char status, String tipoHospede) {
        this.id = id;
        this.obs = obs;
        this.status = status;
        this.tipoHospede = tipoHospede;
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

    public String getTipoHospede() {
        return tipoHospede;
    }

    public void setTipoHospede(String tipoHospede) {
        this.tipoHospede = tipoHospede;
    }

    @Override
    public String toString() {
        return "CheckHospede{" +
                "id=" + id +
                ", tipoHospede='" + tipoHospede + '\'' +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
