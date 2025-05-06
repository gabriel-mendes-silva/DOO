package DOO;

import java.sql.Timestamp;

public class Caixa {
    private int id;
    private float valorDeAbertura;
    private float valorDeFechamento;
    private Timestamp dataHoraAbertura;
    private Timestamp dataHoraFechamento;

    private String obs;
    private char status;

    public Caixa(Timestamp dataHoraAbertura, Timestamp dataHoraFechamento, int id, String obs, char status, float valorDeAbertura, float valorDeFechamento) {
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.id = id;
        this.obs = obs;
        this.status = status;
        this.valorDeAbertura = valorDeAbertura;
        this.valorDeFechamento = valorDeFechamento;
    }

    public Timestamp getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(Timestamp dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public Timestamp getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public void setDataHoraFechamento(Timestamp dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
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

    public float getValorDeAbertura() {
        return valorDeAbertura;
    }

    public void setValorDeAbertura(float valorDeAbertura) {
        this.valorDeAbertura = valorDeAbertura;
    }

    public float getValorDeFechamento() {
        return valorDeFechamento;
    }

    public void setValorDeFechamento(float valorDeFechamento) {
        this.valorDeFechamento = valorDeFechamento;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "dataHoraAbertura=" + dataHoraAbertura +
                ", id=" + id +
                ", valorDeAbertura=" + valorDeAbertura +
                ", valorDeFechamento=" + valorDeFechamento +
                ", dataHoraFechamento=" + dataHoraFechamento +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
