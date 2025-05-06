package model;

import java.sql.Timestamp;

public class Receber {
    private int id;
    private Timestamp dataHoraCadastro;
    private float valorOriginal;

    private float desconto;

    private float acrescimo;

    private float valorPago;

    private String obs;

    private char status;

    public Receber(float acrescimo, Timestamp dataHoraCadastro, float desconto, int id, String obs, char status, float valorOriginal, float valorPago) {
        this.acrescimo = acrescimo;
        this.dataHoraCadastro = dataHoraCadastro;
        this.desconto = desconto;
        this.id = id;
        this.obs = obs;
        this.status = status;
        this.valorOriginal = valorOriginal;
        this.valorPago = valorPago;
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }

    public Timestamp getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
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

    public float getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(float valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Receber{" +
                "acrescimo=" + acrescimo +
                ", id=" + id +
                ", dataHoraCadastro=" + dataHoraCadastro +
                ", valorOriginal=" + valorOriginal +
                ", desconto=" + desconto +
                ", valorPago=" + valorPago +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
