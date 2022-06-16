package orientacaobject;

public class Principal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pessoa pessoa1 = new Pessoa("Luara", "123.456.756-01", 41);
    Pessoa pessoa2 = new Pessoa("Pedro", "121.444.520-05", 33);

    System.out.println("o nome da pessoa1 é: " + pessoa1.getNome());
    System.out.println("o nome da pessoa2 é: " + pessoa2.getNome());

    pessoa1.setNome("Luara Dias");

    System.out.println("o nome da pessoa1 é: " + pessoa1.getNome());
    System.out.println("o CPF da pessoa2 é: " + pessoa2.getCpf());
  }

}
