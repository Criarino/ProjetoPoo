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
    private Material Materiais[];
    public Venda(int i, Date d, double v)//construtor
    {
        id=i;
        data=d;
        valor=v;
        fd=DateFormat.getDateInstance();
        //Materiais=m;
    }
    @Override
    public String toString()
    {
        return "\nID da venda= "+id+"\nData= "+fd.format(data)+"\nValor= "+valor;
    }
}
