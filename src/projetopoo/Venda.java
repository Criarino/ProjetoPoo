package projetopoo;
import java.util.Date;
import java.text.DateFormat;
//para fazer javadoc usa /** e coloca a descrição
public class Venda 
{
    private final int id;
    private final Date data;
    private final double valor;
    DateFormat fd;
    private final Material Materiais[];
    private final String cliente;
    public Venda(int i, Date d, double v, String client, Material[] m)//construtor
    {
        id=i;
        data=d;
        valor=v;
        fd=DateFormat.getDateInstance();
        cliente=client;
        Materiais=m;
    }
    public void ImpMateriais () //imprime os materiais para fazer o extrato /!/DEVE SER CHAMADO DEPOIS DO TOSTRING
    {
        int i=Materiais.length;
        System.out.println("\nMateriais vendidos: ");
        for (int ia=0;ia<=i;ia++)
            System.out.println("\n"+Materiais[ia].getNome());
    }

    @Override
    public String toString() //o tostring é usado para gerar extrato
    {
        return "\nID da venda= "+id+"\nCliente: "+cliente+"\nData= "+fd.format(data)+"\nValor= "+valor+"\n";
    }
}
