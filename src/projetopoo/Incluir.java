/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;
import java.util.Scanner;

/**
 *
 * @author richard
 */
public class Incluir //Classe para implementar as inserções
{
    int i;
    private final Scanner s1;
    protected Material estoque []; //vetor que guarda os materiais em estoque
    public Busca buscar; //classe para fazer a busca
    Incluir ()
    {
        i=-1;
        estoque=new Material[25];
        s1=new Scanner(System.in);
        buscar=new Busca();
    }
    
    public void Interface () //Quando chamado na main, é redirecionado aqui para escolher a operação
    {
        int res=-1;
        while (res!=0)
        {
            System.out.println("\nInforme o que quer incluir:\n0-Voltar\n1-Incluir Material\n2-Editar Material\n3-Excluir Material");
            res=s1.nextInt();
            switch (res)
            {
                case 0:
                    return;
                case 1:
                    this.InserirMaterial();
                    break;
                case 2:
                    this.EditMaterial();
                    break;
                case 3:
                    this.DeletarMaterial();
                    break;
            }
        }
    }
    private void InserirMaterial()
    {
        i++;
        s1.nextLine();
        String nome, fornecedor;
        int quantidade;
        float preco, lucro;
        String datafabricacao;
        String descricao;
        System.out.println("\nNome do material: ");
        nome=s1.nextLine();
        System.out.println("\nQuantidade: ");
        quantidade=s1.nextInt();
        s1.nextLine();
        System.out.println("\nPreço: ");
        preco=s1.nextFloat();
        s1.nextLine();
        System.out.println("\nDescrição do material: ");      
        descricao=s1.nextLine();
        System.out.println("\nMargem de lucro: ");
        lucro=s1.nextFloat();
        s1.nextLine();
        System.out.println("\nFornecedor: ");
        fornecedor=s1.nextLine();
        System.out.println("\nData de Fabricação: ");
        datafabricacao=s1.nextLine();
        Material aux=new Material(nome, quantidade, preco, descricao, lucro, datafabricacao, fornecedor);
        estoque[i]=aux;
    }
    private void EditMaterial()
    {
        Material aux;
        aux=buscar.BuscarMaterial(estoque);
        i++;
        s1.nextLine();
        String nome, fornecedor;
        int quantidade;
        float preco, lucro;
        String datafabricacao;
        String descricao;
        System.out.println("\nNome do material: ");
        nome=s1.nextLine();
        aux.setNome(nome);
        System.out.println("\nQuantidade: ");
        quantidade=s1.nextInt();
        aux.setQuantidade(quantidade);
        s1.nextLine();
        System.out.println("\nPreço: ");
        preco=s1.nextFloat();
        aux.setPreco(preco);
        s1.nextLine();
        System.out.println("\nDescrição do material: ");      
        descricao=s1.nextLine();
        aux.setEspecificacao(descricao);
        System.out.println("\nMargem de lucro: ");
        lucro=s1.nextFloat();
        aux.setMargemLucro(lucro);
        s1.nextLine();
        System.out.println("\nFornecedor: ");
        fornecedor=s1.nextLine();
        aux.setFornecedor(fornecedor);
        System.out.println("\nData de Fabricação: ");
        datafabricacao=s1.nextLine();
        aux.setDataFabricacao(datafabricacao);
    }
    private void DeletarMaterial()
    {
        int i;
        Material aux=buscar.BuscarMaterial(estoque);
        System.out.println("Digite a posição informada: ");
        i=s1.nextInt();
        estoque[i]=null;
    }
}
