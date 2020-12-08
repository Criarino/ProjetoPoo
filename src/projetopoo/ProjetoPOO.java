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
            System.out.println("Digite 1 para adicionar, editar ou excluir um Material\nDigite 2 para pesquisar um Material\nDigite 0 para sair\n");
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
            }
        }
        /*Calendar atual=Calendar.getInstance();
        Venda v=new Venda(01,atual.getTime(),100.0);
        System.out.println(v);*/
    }
    
}
