package orientacaobject;

public class Pessoa {
  // caracteristicas
  private String nome;
  private String cpf;
  private int idade;

  // metodo construtor
  Pessoa(String nomeObjeto, String cpfObjeto, int idadeObjeto) {
    this.nome = nomeObjeto;
    this.cpf = cpfObjeto;
    this.idade = idadeObjeto;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  // açoes da classe
  public String devolverNomeObjeto() {
    return this.nome;
  }


}
