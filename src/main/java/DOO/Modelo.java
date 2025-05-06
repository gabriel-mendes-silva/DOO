/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOO;

/**
 *
 * @author aluno
 */
public class Modelo {
    private int id;
    private String descricao;
    private Marca marca;
    private char status;

    public Modelo(int id, String descricao, Marca marca, char status) {
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
        this.status = status;
    }

    public Modelo() {
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
