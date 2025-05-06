package model;

import java.sql.Timestamp;

public class MovimentoCaixa {
    private int id;
    private Timestamp dataHoraMovimento;
    private float valor;

    private String descricao;

    private String obs;

    private char status;

    public MovimentoCaixa(Timestamp dataHoraMovimento, String descricao, int id, String obs, char status, float valor) {
        this.dataHoraMovimento = dataHoraMovimento;
        this.descricao = descricao;
        this.id = id;
        this.obs = obs;
        this.status = status;
        this.valor = valor;
    }

    public Timestamp getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(Timestamp dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
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
        return "MovimentoCaixa{" +
                "dataHoraMovimento=" + dataHoraMovimento +
                ", id=" + id +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
