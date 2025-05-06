package model;

import java.sql.Timestamp;

public class Servico {
    private int id;
    private String descricao;
    private String obs;
    private char status;

    public Servico(String descricao, int id, String obs, char status) {
        this.descricao = descricao;
        this.id = id;
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
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", id=" + id +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
