/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Projeto - POO 2020/05 
//Loja de Matériais de construção
package projetopoo;


import java.util.Scanner;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author TiagoMR
 */
public class Sistema {

       public static Cliente[] IncluirCliente(){ //Função clintes
    Cliente[] clientes = new  Cliente[0];
    Scanner in = new Scanner(System.in);
    for(int i= 0; i<2; i++){
     
 //  String qtdclientes;
    String nome;
    String endereco;
    String email;
    String cpf;
    String telefone;
//Título principal - Menu
    System.out.println("===         PROJETO               ===");
    System.out.println("  LOJA DE MATERIAIS DE CONSTRUÇÃO    "); 

    System.out.println("               "); 
//Entradas de dados para a classe Clientes - Início 
    System.out.println("===   Cadastrar Cliente:   ==="); 
        
    System.out.println("Insira o nome: ");
    nome=in.nextLine();
          
    System.out.println("Insira o endereço: ");
    endereco=in.nextLine();
          
    System.out.println("Insira o e-mail: ");
    email=in.nextLine();
        
    System.out.println("Insira a CPF: ");
    cpf=in.nextLine();
    
    System.out.println("Insira a Telefone: ");
    telefone=in.nextLine();
    
    }
    System.out.println("=== Imprimindo os dados dos clientes inseridos:  ==="); 

    return clientes;
}  //Fim da classe Clientes  

    private static Cliente[] CadastrarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  //  private Iterable<Venda> reservas;
    public static void main(String[] args) {
     //For para imprimir os clientes, com variável dentro do vetor
    Cliente[] cliente = IncluirCliente();    
    for(int b=0; b<1; b++){
    Cliente[] clientes = CadastrarCliente();
    }    
  
    }
    
    //Classe Funcionario - Início
 public static Colaborador[] CadastrarColaborador(){
 Colaborador[] func = new  Colaborador[25];
    Scanner in = new Scanner(System.in);
           Colaborador[] colab = null;
    for(int f= 0; f<2; f++){
        String qtdcolaboradores;
        String nome;
        String endereco;
        String email;
        String CPF;
        String telefone;
    System.out.println("               "); 
    System.out.println("=== Incluir Colaborador ===");      
    System.out.println("Insira seu nome: ");
    nome=in.nextLine();

    System.out.println("Insira o endereço: ");
    endereco=in.nextLine();
      
    System.out.println("Insira o e-mail: ");
    email=in.nextLine();
    
    System.out.println("Insira a CPF: ");
    CPF=in.nextLine();
    
    System.out.println("Insira a Telefone: ");
    telefone=in.nextLine();
   // colab[f] = new Colaborador(login, senha);
    }
    System.out.println("=== Imprimindo:  ==="); 

    return colab;
}        
}
