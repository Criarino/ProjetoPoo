package projetopoo;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author richard
 */
public class Incluir //Classe para implementar as inserções
{
    int i;
    int v;
    private final Scanner s1;
    Calendar atual;
    protected Venda vendas[];
    protected Material estoque []; //vetor que guarda os materiais em estoque
    public Busca buscar; //classe para fazer a busca
    protected Cliente cliente[]; //Classe cliente
    protected Cliente carteiraDeClientes[]; //vetor que guarda os clientes na Carteira de clientes da empresa
    protected Colaborador colaborador[]; //Classe colaborador
    protected Colaborador registro[]; //vetor que guarda os colaboradores da empresa
    protected Adm adm[]; //Classe colaborador
    protected Adm gestores[]; //vetor que guarda os administradores da empresa
    Incluir ()
    {
        v=-1;
        i=-1;
        estoque=new Material[25];
        vendas=new Venda[25];
        s1=new Scanner(System.in);
        buscar=new Busca();
        atual=Calendar.getInstance();
        cliente = new Cliente[25];
        carteiraDeClientes=new Cliente[25];
        colaborador = new Colaborador[25];
        registro=new Colaborador[25];
        adm = new Adm[25];
        gestores=new Adm[25];
    }
    
    public void Interface() //Quando chamado na main, é redirecionado aqui para escolher a operação
    {
        int res=-1;
        while (res!=0)
        {
            System.out.println("\nInforme o que quer fazer:\n0-Voltar\n1-Incluir Material\n"+
                    "2-Editar Material\n3-Excluir Material\n4-Fazer venda\n"+
                    "5-Incluir Cliente\n6-Editar Cliente\n7-Excluir Cliente\n"+
                    "8-Incluir Colaborador\n9-Editar Colaborador\n10-Excluir Colaborador\n" +
                   "11-Incluir Administrador\n12-Editar Administrador\n13-Excluir Administrador\n");
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
                case 4:
                    this.FazerVenda();
                    break;
                case 5:
                    this.InserirCliente();
                    break;  
                case 6:
                    this.EditCliente();
                    break; 
                case 7:
                    this.DeletarCliente();
                    break; 
                case 8:
                    this.InserirColaborador();
                    break;  
                case 9:
                    this.EditColaborador();
                    break; 
                case 10:
                    this.DeletarColaborador();
                    break;     
                
                case 11:
                    this.InserirAdm();
                    break;  
                case 12:
                    this.EditAdm();
                    break; 
                case 13:
                    this.DeletarAdm();
                    break;         
                        
            }
        }
    }
    private void InserirMaterial()
    {
        i++;
        s1.nextLine(); //limpando buffer do scanner
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
    private void FazerVenda()
    {
        v++;
        String nome, aux;
        double valor;
        int i;
        s1.nextLine();
        System.out.println("\nNome do cliente: ");
        nome=s1.nextLine();
        System.out.println("\nValor: ");
        valor=s1.nextDouble();
        System.out.println("\nQuantos materiais estão sendo vendidos?");
        i=s1.nextInt();
        Material vendido[]=new Material [i];
        while(i-->0)
        {
            vendido[i]=buscar.BuscarMaterial(estoque);
        }
        vendas[v]=new Venda (v+1, atual.getTime(), valor, nome, vendido);
    }
//========================================================================================
    //Cliente
    
    private void InserirCliente()
    {
        i++;
        s1.nextLine(); //limpando buffer do scanner
        String nome, endereco, email, cpf, telefone;
        System.out.println("\nNome do Cliente: ");
        nome=s1.nextLine();
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        s1.nextLine();
        
        Cliente aux=new Cliente(nome, endereco, email, cpf, telefone);
        cliente[i]=aux;
     
    }
//Editar Cliente
    private void EditCliente()
    {
        Cliente aux;
        aux=buscar.BuscarCliente(carteiraDeClientes);
        i++;
        s1.nextLine();
        String nome, endereco, email, cpf, telefone;
     
        System.out.println("\nNome do Cliente: ");
        nome=s1.nextLine();
        aux.setnome(nome);
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        aux.setendereco(endereco);
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        aux.setemail(email);
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        aux.setcpf(cpf);
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        aux.settelefone(telefone);
        s1.nextLine();
    }    
 //Ecluir/Deletar cliente
    private void DeletarCliente()
    {
        int i;
        Cliente aux=buscar.BuscarCliente(carteiraDeClientes);
        System.out.println("Digite a posição informada: ");
        i=s1.nextInt();
        estoque[i]=null;
    }
    
//========================================================================================
    //Colaborador
    
    private void InserirColaborador()
    {
        i++;
        s1.nextLine(); //limpando buffer do scanner
        String nome, endereco, email,cpf,telefone, login,senha;
        System.out.println("\nNome do Colaborador: ");
        nome=s1.nextLine();
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        s1.nextLine();
        System.out.println("\nLogin: ");
        login=s1.nextLine();
        s1.nextLine();
        System.out.println("\nSenha: ");
        senha=s1.nextLine();
        s1.nextLine();
        Colaborador aux=new Colaborador(nome, endereco, email, cpf, telefone, login, senha);
        colaborador[i]=aux;
     
    }

//Editar Cliente
    private void EditColaborador()
    {
        Colaborador aux;
        aux=buscar.BuscarColaborador(registro);
        i++;
        s1.nextLine();
        String nome, endereco, email, cpf, telefone, login, senha;
     
        System.out.println("\nNome do Cliente: ");
        nome=s1.nextLine();
        aux.setnome(nome);
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        aux.setendereco(endereco);
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        aux.setemail(email);
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        aux.setcpf(cpf);
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        aux.settelefone(telefone);
        System.out.println("\nLogin: ");
        login=s1.nextLine();
        aux.setlogin(login);
        s1.nextLine();
        System.out.println("\nSenha: ");
        senha=s1.nextLine();
        aux.setsenha(senha);
    }    
 //Ecluir/Deletar cliente
    private void DeletarColaborador()
    {
        int i;
        Colaborador aux=buscar.BuscarColaborador(registro);
        System.out.println("Digite a posição informada: ");
        i=s1.nextInt();
        registro[i]=null;
    }
   //========================================================================================
    //Administradores
    
    private void InserirAdm()
    {
        i++;
        s1.nextLine(); //limpando buffer do scanner
        String nome, endereco, email,cpf,telefone, login,senha;
       
        System.out.println("\nNome do Administrador: ");
        nome=s1.nextLine();
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        s1.nextLine();
        System.out.println("\nLogin: ");
        login=s1.nextLine();
        s1.nextLine();
        System.out.println("\nSenha: ");
        senha=s1.nextLine();
        s1.nextLine();
        Adm aux=new Adm(nome, endereco, email, cpf, telefone, login, senha);
        adm[i]=aux;
     
    }

//Editar Administradores
    private void EditAdm()
    {
        Adm aux;
        aux=buscar.BuscarAdm(gestores);
        i++;
        s1.nextLine();
        String nome, endereco, email, cpf, telefone, login, senha;
     
        System.out.println("\nNome do Administradores: ");
        nome=s1.nextLine();
        aux.setnome(nome);
        System.out.println("\nEndereço: ");
        endereco=s1.nextLine();
        aux.setendereco(endereco);
        s1.nextLine();
        System.out.println("\nE-mail: ");
        email=s1.nextLine();
        aux.setemail(email);
        s1.nextLine();
        System.out.println("\nCPF: ");      
        cpf=s1.nextLine();
        aux.setcpf(cpf);
        System.out.println("\nTelefone: ");
        telefone=s1.nextLine();
        aux.settelefone(telefone);
        System.out.println("\nLogin: ");
        login=s1.nextLine();
        aux.setlogin(login);
        s1.nextLine();
        System.out.println("\nSenha: ");
        senha=s1.nextLine();
        aux.setsenha(senha);
    }    
 //Ecluir/Deletar adminstradores
    private void DeletarAdm()
    {
        int i;
        Adm aux=buscar.BuscarAdm(gestores);
        System.out.println("Digite a posição informada: ");
        i=s1.nextInt();
        gestores[i]=null;
    }
  
}    


