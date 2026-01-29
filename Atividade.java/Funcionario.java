class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public double calcularBonus() {
        return this.salario * 0.10; // 10%
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
}
class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20; // 20%
    }
}