/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Veiculo {
    private int id;
    private String cor;
    private char status;
    private Modelo modelo;

    private String placa;
    public Veiculo(int id, String cor, char status, Modelo modelo, String placa) {
        this.id = id;
        this.cor = cor;
        this.status = status;
        this.modelo = modelo;
        this.placa = placa;
    }

    public Veiculo() {
    }
    
    public Modelo getModelo() {
        return modelo;
    }

    public int getId() {
        return id;
    }

    public String getCor() {
        return cor;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", modelo=" + modelo +
                ", placa='" + placa + '\'' +
                '}';
    }
}
