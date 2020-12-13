/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Projeto - POO 2020/05 
//Loja de Matériais de construção
package projetopoo;



/**
 *
 * @author TiagoMR
 * 
 */

//Classe Adm extendendo a colaboradores
public class Adm extends Colaborador{
    public Adm(String nome, String endereco, String email, String cpf, String telefone, String login, String senha)
    {
        super (nome, endereco, email, cpf, telefone, login, senha);
    }

    //Sobrescrever o método toString()
    @Override
    public String toString() {
        return "Adm{" + '}';
    }
    
} //Fim da classe Adm
