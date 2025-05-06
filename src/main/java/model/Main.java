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
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joana Dark");
        
        Hospede hospede = new Hospede();
        hospede.setNome("Jurandir");

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Arlete");
        
        Marca marca = new Marca();
        marca.setId(1);
        marca.setDescricao("Renault");
        marca.setStatus('a');
        
        Modelo modelo = new Modelo();
        modelo.setDescricao("Sandero");
        modelo.setMarca(marca);
        modelo.setStatus('a');
        modelo.setId(1);
        
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(modelo);
        veiculo.setId(1);
        veiculo.setStatus('a');
        veiculo.setCor("Cinza");
        fornecedor.setVeiculo(veiculo);
        System.out.println(fornecedor.getVeiculo().toString());

        
        
        
        
    }
}
