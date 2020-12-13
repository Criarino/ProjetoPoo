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
 */
public class Colaborador  extends Pessoa {
    private String login;  // private final String login;
    private String senha;

    public Colaborador( String nome, String endereco, String email, String cpf, String telefone, String login, String senha)
        {
            super (nome, endereco, email, cpf, telefone);
            this.login= login;
            this.senha = senha;   
        }//Fim do construtor
    
    //Métodos GETs E SETs
//Método get do atributo login
    //Obtém o valor do atributo login    
    public String getlogin ()
    {
        return login;
    }
    
    //O método set configura o atributo login  
    public void setlogin(String login)
    {
        this.login = login;
    } 
//Método set do atributo senha
    //Obtém o valor do atributo senha    
    public String getsenha()
    {
        return senha;
    }
//O método set configura o atributo senha    
    public void setsenha ( String senha )
    {
        this.senha = senha;
    }
    
    //Sobrescrever o método toString()

    @Override
    public String toString() {
        return "Colaborador{" + "login=" + login + 
            ", senha=" + senha + '}';
    }
    
    
} //Fim da classe Colaboradores
