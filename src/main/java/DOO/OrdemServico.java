package DOO;

import java.sql.Timestamp;

public class OrdemServico {
    private int id;
    private Timestamp dataHoraCadastro;
    private Timestamp dataHoraPrevisaoInicio;
    private Timestamp dataHoraPrevisaoTermino;
    private String obs;
    private char status;

    public Timestamp getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Timestamp getDataHoraPrevisaoInicio() {
        return dataHoraPrevisaoInicio;
    }

    public void setDataHoraPrevisaoInicio(Timestamp dataHoraPrevisaoInicio) {
        this.dataHoraPrevisaoInicio = dataHoraPrevisaoInicio;
    }

    public Timestamp getDataHoraPrevisaoTermino() {
        return dataHoraPrevisaoTermino;
    }

    public void setDataHoraPrevisaoTermino(Timestamp dataHoraPrevisaoTermino) {
        this.dataHoraPrevisaoTermino = dataHoraPrevisaoTermino;
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
        return "OrdemServico{" +
                "dataHoraCadastro=" + dataHoraCadastro +
                ", id=" + id +
                ", dataHoraPrevisaoInicio=" + dataHoraPrevisaoInicio +
                ", dataHoraPrevisaoTermino=" + dataHoraPrevisaoTermino +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
