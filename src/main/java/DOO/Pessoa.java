/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOO;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String complemento;
    private Date dataCadastro;
    private String cpf;
    private String rp;
    private String obs;
    private char status;

    public Pessoa(int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, Date dataCadastro, String cpf, String rp, String obs, char status) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.dataCadastro = dataCadastro;
        this.cpf = cpf;
        this.rp = rp;
        this.obs = obs;
        this.status = status;
    }

    public Pessoa() {
    }
    

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone1() {
        return fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public String getEmail() {
        return email;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRp() {
        return rp;
    }

    public String getObs() {
        return obs;
    }

    public char getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setStatus(char status) {
        if((status == 'A') ||(status == 'C') ||(status == 'a') || (status == 'c')){
            this.status = status;
        } 
        else{
            this.status = 'A';
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +id + ", nome=" + nome + ", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email + ", cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", complemento=" + complemento + ", dataCadastro=" + dataCadastro + ", cpf=" + cpf + ", rp=" + rp + ", obs=" + obs + ", status=" + status + '}';
    }
    
    
    
}
