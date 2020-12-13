/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Projeto - POO 2020/05 
//Loja de Matériais de construção
package projetopoo;

import java.util.Arrays;

/**
 *
 * @author TiagoMR
 */

//Inicio da clase Pessoa extendendo a classe sistema, que é a classe pai, sendo mais geral

public class Cliente extends Pessoa {
    private Venda[] regCompras = new Venda[25]; 
    private String nome;
    private String endereco; 
    private String email;
    private String cpf;
    private String telefone;
    
    public Cliente ( String nome, String endereco, String email, String cpf, String telefone )
    {
        super (nome, endereco, email, cpf, telefone);
        this.regCompras = regCompras;
    } //Fim do construtor

//Métodos GETs E SETs
//Método get do atributo regCompras
    //Obtém o valor do atributo regCompras    
    public Venda[] getregCompras()
    {
            return regCompras;
    }
//Método set do atributo regCompras
    //O método set configura o atributo regCompras
    public void setregCompras( Venda[] regCompras )
    {
        this.regCompras = regCompras;
    }
    
    //Método Inprmir Informações do Cliente
    @Override
    public String toString()
    {
        return String.format("Informações do cliente: %s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Nome: ", nome,
                "Endereço: ", endereco,
                "E-mail: ", email,
                "CPF: ", cpf,
                "Telefone: ", telefone,
                "Registro de compras: ", Arrays.toString(regCompras));
    }
} //Fim da classe Cliente
