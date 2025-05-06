/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Hospede extends Pessoa {
    private String razaosocial;
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;

    public Hospede() {
    }

    public Hospede(String razaosocial, String cnpj, String inscricaoEstadual, String contato, char status, int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, Date dataCadastro, String cpf, String rp, String obs) {
        super(id, nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, dataCadastro, cpf, rp, obs, status);
        this.razaosocial = razaosocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
    }
    
    public String getRazaosocial() {
        return razaosocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

 
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    
}
