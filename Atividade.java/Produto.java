public class Produto {
    private String nome;
    private double preco;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        if (preco >= 0) { 
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. O preço não pode ser negativo.");
        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();

        
        produto1.setNome("Notebook Gamer");
        produto1.setPreco(5500.99);

        // aqui va exibir as informações usando os getters
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$" + produto1.getPreco());

        // Tentativa de definir um preço inválido
        produto1.setPreco(-100.0);
        System.out.println("Preço após tentativa de valor inválido: R$" + produto1.getPreco());
    }
}