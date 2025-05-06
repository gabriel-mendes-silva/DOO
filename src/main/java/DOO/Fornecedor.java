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
public class Fornecedor extends Pessoa{
   private String razaoSocial;
   private String cnpj;
   private String InscricaoEstadual;
   private String contato;

    public Fornecedor() {
    }

    public Fornecedor(String razaoSocial, String cnpj, String InscricaoEstadual, String contato, int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, Date dataCadastro, String cpf, String rp, String obs, char status) {
        super(id, nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, dataCadastro, cpf, rp, obs, status);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.InscricaoEstadual = InscricaoEstadual;
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
   
}
