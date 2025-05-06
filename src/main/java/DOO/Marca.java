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
public class Marca {
    private int id;
    private String descricao;
    private char status;

    public Marca(int id, String descricao, char status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public Marca() {
    }

    
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
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

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
