package model;

import java.sql.Time;
import java.sql.Timestamp;

public class Check {
    private int id;
    private Timestamp dataHoraCadastro;

    private Timestamp dataHoraEntrada;
    private Timestamp dataHoraSaida;
    private String obs;

    private char status;

    public Check(Timestamp dataHoraCadastro, Timestamp dataHoraEntrada, Timestamp dataHoraSaida, int id, String obs, char status) {
        this.dataHoraCadastro = dataHoraCadastro;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
        this.id = id;
        this.obs = obs;
        this.status = status;
    }

    public Timestamp getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Timestamp getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(Timestamp dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Timestamp getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Timestamp dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
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
        return "Check{" +
                "dataHoraCadastro=" + dataHoraCadastro +
                ", id=" + id +
                ", dataHoraEntrada=" + dataHoraEntrada +
                ", dataHoraSaida=" + dataHoraSaida +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
