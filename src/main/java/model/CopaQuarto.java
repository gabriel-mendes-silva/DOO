package model;

import java.sql.Timestamp;

public class CopaQuarto {
    private int id;
    private float quantidade;
    private Timestamp dataHoraPedido;
    private String obs;
    private char status;

    public CopaQuarto(Timestamp dataHoraPedido, int id, String obs, float quantidade, char status) {
        this.dataHoraPedido = dataHoraPedido;
        this.id = id;
        this.obs = obs;
        this.quantidade = quantidade;
        this.status = status;
    }

    public Timestamp getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Timestamp dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CopaQuarto{" +
                "dataHoraPedido=" + dataHoraPedido +
                ", id=" + id +
                ", quantidade=" + quantidade +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
