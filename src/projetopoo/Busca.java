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
public class Busca //classe para fazer a busca nos vetores
{
    Scanner s1;
    Busca ()
    {
        s1=new Scanner(System.in);
    }
    public Material BuscarMaterial (Material estoque[]) //busca em materiais no estoque
    {   
        String bus;
        String aux;
        System.out.println("Digite o nome do material: ");
        bus=s1.nextLine();
        try
        {
        for(int i=0;i<=25;i++)
        {
            aux=estoque[i].getNome();
            if (aux.equals(bus))
            {
                System.out.println("Material encontrado na posição "+i+"\n");
                return estoque[i];
            }
        }
        
        System.out.println("Não encontrado");//caso não encontre
        return null;
        }
        catch(NullPointerException e)//quando o vetor está vazio, joga essa exceção
        {
            System.out.println("Estoque vazio\n");
            return null;
        }
    }
    
    //Cliente
    public Cliente BuscarCliente (Cliente carteiraDeClientes[]) //busca em materiais no estoque
    {   
        String bus;
        String aux;
        System.out.println("Digite o nome do Cliente: ");
        bus=s1.nextLine();
        try
        {
        for(int i=0;i<=25;i++)
        {
            aux=carteiraDeClientes[i].getnome();
            if (aux.equals(bus))
            {
                System.out.println("Cliente encontrado na posição "+i+"\n");
                return carteiraDeClientes[i];
            }
        }
        
        System.out.println("Cliente não encontrado");//caso não encontre
        return null;
        }
        catch(NullPointerException e)//quando o vetor está vazio, joga essa exceção
        {
            System.out.println("Carteira de clientes vazia\n");
            return null;
        }
    } 
    
//Colaborador
    public Colaborador BuscarColaborador (Colaborador registro[]) //busca em materiais no estoque
    {   
        String bus;
        String aux;
        System.out.println("Digite o nome do Colaborador: ");
        bus=s1.nextLine();
        try
        {
        for(int i=0;i<=25;i++)
        {
            aux=registro[i].getnome();
            if (aux.equals(bus))
            {
                System.out.println("Colaborador encontrado na posição "+i+"\n");
                return registro[i];
            }
        }
        
        System.out.println("Cliente não encontrado");//caso não encontre
        return null;
        }
        catch(NullPointerException e)//quando o vetor está vazio, joga essa exceção
        {
            System.out.println("Registro de colaboradore vazio\n");
            return null;
        }
    }   
//CAdministrador
    public Adm BuscarAdm (Adm gestores[]) //busca em materiais no estoque
    {   
        String bus;
        String aux;
        System.out.println("Digite o nome do Administradores: ");
        bus=s1.nextLine();
        try
        {
        for(int i=0;i<=25;i++)
        {
            aux=gestores[i].getnome();
            if (aux.equals(bus))
            {
                System.out.println("Administrador encontrado na posição "+i+"\n");
                return gestores[i];
            }
        }
        
        System.out.println("Administrador não encontrado");//caso não encontre
        return null;
        }
        catch(NullPointerException e)//quando o vetor está vazio, joga essa exceção
        {
            System.out.println("Registro do Administrador vazio\n");
            return null;
        }
    }         
    
}
