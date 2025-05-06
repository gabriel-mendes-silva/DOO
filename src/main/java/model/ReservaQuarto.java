package model;

import java.sql.Timestamp;

public class ReservaQuarto {
    private int id;
    private Timestamp dataHoraInicio;
    private Timestamp dataHoraFim;
    private String obs;
    private char status;

    public ReservaQuarto(Timestamp dataHoraFim, Timestamp dataHoraInicio, int id, String obs, char status) {
        this.dataHoraFim = dataHoraFim;
        this.dataHoraInicio = dataHoraInicio;
        this.id = id;
        this.obs = obs;
        this.status = status;
    }

    public Timestamp getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(Timestamp dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Timestamp getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(Timestamp dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
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
        return "ReservaQuarto{" +
                "dataHoraFim=" + dataHoraFim +
                ", id=" + id +
                ", dataHoraInicio=" + dataHoraInicio +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
