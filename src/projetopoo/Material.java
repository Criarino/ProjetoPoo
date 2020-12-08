
package projetopoo;
/**
 * Classe responsável por guardar os atributos dos materiais de uma loja.
 * @author Matteus
 */
public class Material {
  /*
  Abaixo há a declaração dos atributos da classe Material.
  */
  
  /**
   * Atributo que guarda o nome de um material.
   */
  private String nome; 
  /**
   * Atributo que guarda a quantidade disponível de um material.
   */
  private int quantidade;
  /**
   * Atributo que guarda o preço de um material.
   */
  private float preco;
  /**
   * Atributo que guarda a especificação de um material.
   */
  private String especificacao;
  /**
   * Atributo que guarda a margem de lucro de um material.
   */
  private float margemLucro;
  /**
   * Atributo que guarda a data de fabricação de um material.
   */
  private String dataFabricacao;
  /**
   * Atributo que guarda o nome do fornecedor de um material.
   */
  private String fornecedor;
  
  /*
  Abaixo estão os construtores dos atributos da classe Material.
  */
  /**
   * Construtores padrão para os atributos da classe Material.
   * @param nome
   * @param quantidade
   * @param preco
   * @param especificacao
   * @param margemLucro
   * @param dataFabricacao
   * @param fornecedor
   */
  public Material(String nome, int quantidade, float preco, String especificacao, float margemLucro, String dataFabricacao, String fornecedor) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
    this.especificacao = especificacao;
    this.margemLucro = margemLucro;
    this.dataFabricacao = dataFabricacao;
    this.fornecedor = fornecedor;
  }
  
  /*
  Abaixo estão os gets e sets dos atributos da classe Material.
  */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public String getEspecificacao() {
    return especificacao;
  }

  public void setEspecificacao(String especificacao) {
    this.especificacao = especificacao;
  }

  public float getMargemLucro() {
    return margemLucro;
  }

  public void setMargemLucro(float margemLucro) {
    this.margemLucro = margemLucro;
  }

  public String getDataFabricacao() {
    return dataFabricacao;
  }

  public void setDataFabricacao(String dataFabricacao) {
    this.dataFabricacao = dataFabricacao;
  }

  public String getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(String fornecedor) {
    this.fornecedor = fornecedor;
  }
  @Override
  public String toString()
  {
      return "\nNome do Material: "+nome+"\nQuantidade em estoque: "+quantidade+"\nPreço: "+preco+"\nDescrição: "+especificacao+"\nMargem de lucro: "+margemLucro+"\nData de fabricação: "+dataFabricacao+"\nFornecedor: "+fornecedor+"\n";
  }

}
