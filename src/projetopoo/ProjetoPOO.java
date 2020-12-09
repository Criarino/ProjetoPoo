package projetopoo;
import java.util.Scanner;

public class ProjetoPOO 
{
    public static void main(String[] args)
    {
        int res;
        Incluir i1=new Incluir();
        Busca b1=new Busca();
        Scanner s1=new Scanner(System.in);
        Material aux;
        while(true) //interface com usuário
        {
            System.out.println("Digite 1 para adicionar, editar ou excluir um Material\nDigite 2 para pesquisar um Material\nDigite 3 para ver extratos de vendas\nDigite 0 para sair\n");
            res=s1.nextInt();
            switch (res)
            {
                case 0:
                    return;
                case 1:
                    i1.Interface();
                    break;
                case 2:
                    aux=b1.BuscarMaterial(i1.estoque);
                    if (aux!=null) //quando o material não é encontrado ou dá erro, retorna null. Só deve imprimir quando o retorno é diferente de null
                        System.out.println(aux);
                    break;
                case 3:
                    System.out.println("Informe o código da venda: ");
                    res=s1.nextInt();
                    System.out.println(i1.vendas[res-1]);
                    i1.vendas[res-1].ImpMateriais();
                    break;
            }
        }
    }
    
}
