package DOO;

import java.sql.Timestamp;
import java.util.Date;

public class Reserva {
    private int id;
    private Timestamp dataHoraReservada;
    private Date dataPrevistaEntrada;
    private Date dataPrevistaSaida;

    private String obs;
    private char status;

    public Reserva(Timestamp dataHoraReservada, Date dataPrevistaEntrada, Date dataPrevistaSaida, int id, String obs, char status) {
        this.dataHoraReservada = dataHoraReservada;
        this.dataPrevistaEntrada = dataPrevistaEntrada;
        this.dataPrevistaSaida = dataPrevistaSaida;
        this.id = id;
        this.obs = obs;
        this.status = status;
    }

    public Timestamp getDataHoraReservada() {
        return dataHoraReservada;
    }

    public void setDataHoraReservada(Timestamp dataHoraReservada) {
        this.dataHoraReservada = dataHoraReservada;
    }

    public Date getDataPrevistaEntrada() {
        return dataPrevistaEntrada;
    }

    public void setDataPrevistaEntrada(Date dataPrevistaEntrada) {
        this.dataPrevistaEntrada = dataPrevistaEntrada;
    }

    public Date getDataPrevistaSaida() {
        return dataPrevistaSaida;
    }

    public void setDataPrevistaSaida(Date dataPrevistaSaida) {
        this.dataPrevistaSaida = dataPrevistaSaida;
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
        return "Reserva{" +
                "dataHoraReservada=" + dataHoraReservada +
                ", id=" + id +
                ", dataPrevistaEntrada=" + dataPrevistaEntrada +
                ", dataPrevistaSaida=" + dataPrevistaSaida +
                ", obs='" + obs + '\'' +
                ", status=" + status +
                '}';
    }
}
