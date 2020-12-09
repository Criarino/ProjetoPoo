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
}
