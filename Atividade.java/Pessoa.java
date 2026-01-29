public class Pessoa {
    String nome;
    int idade;
    String cidade;

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maria";
        pessoa1.idade = 30;
        pessoa1.cidade = "São Paulo";

        System.out.println("Dados da Pessoa:");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Cidade: " + pessoa1.cidade);
    }
}