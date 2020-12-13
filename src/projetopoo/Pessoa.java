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
//Inicio da clase Pessoa extendendo a classe sistema, que é a classe pai, sendo mais geral
public class Pessoa extends ProjetoPOO {
    String nome; //Atributo nome com encapsulamento private (privado)
    String endereco; //Atributo endereco com encapsulamento private (privado)
    String email; //Atributo email com encapsulamento private (privado)
    String cpf; //Atributo cpf com encapsulamento private (privado)
    String telefone; //Atributo telefone com encapsulamento private (privado)
    
    public Pessoa (String nome, String endereco, String email, String cpf, String telefone) //Cosntrutor da classe Pessoa
    {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    } //Fim do construtor
    
    //Métodos GETs E SETs
//Método get do atributo nome
    //Obtém o valor do atributo nome
    public String getnome() //Método get que retorna o atributo 
    {         
        return nome;
    }
//Método set do atributo nome
//Método set do atributo nome
    public void setnome ( String nome )
    {
        this.nome = nome;
    }
//Método get do atributo endereco
     //Obtém o valor do atributo endereco
    public String getendereco ()
    {
        return endereco;
    }
//Método set do atributo endereco
//O método set configura o atributo endereco
    public void setendereco( String endereco )
    {
        this.endereco = endereco;
    }
//Método get do atributo email
    //Obtém o valor do atributo email
    public String getemail ()
    {
        return email;
    }
//Método set do atributo email
   //Método set do atributo email  
   //O método set configura o atributo email
    public void setemail(String email )
    {
            this.email = email;
    }
//Método get do atributo cpf   
//Obtém o valor do atributo cpf
    public String getcpf ()
    {
        return cpf;
    }
//Método set do atributo cpf
//O método set configura o atributo cpf
public void setcpf (String cpf)
{
    this.cpf = cpf;
}
   
//Método get do atributo telefone
//Obtém o valor do atributo telefone
    public String gettelefone ()
    {
        return telefone;
    }
//Método set do atributo telefone
//O método set configura o atributo telefone
    public void settelefone ( String telefone )
    {
        this.telefone = telefone;
    }
    //Sobrescrever o método toString()

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ","
            + " endereco=" + endereco + 
            ", email=" + email +
            ", cpf=" + cpf + 
            ", telefone=" + telefone + '}';
    }
    
} //Fim da classe Pessoa que extende a classe sistema