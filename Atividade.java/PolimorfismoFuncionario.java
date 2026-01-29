public class PolimorfismoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionarioComum = new Funcionario("Carlos Alberto", 3000.00);
        Gerente gerenteLoja = new Gerente("Ana Paula", 7000.00);

        System.out.println("Funcionário: " + funcionarioComum.getNome());
        System.out.println("Salário: R$" + funcionarioComum.getSalario());
        System.out.println("Bônus: R$" + funcionarioComum.calcularBonus());

        System.out.println("\nGerente: " + gerenteLoja.getNome());
        System.out.println("Salário: R$" + gerenteLoja.getSalario());
        System.out.println("Bônus: R$" + gerenteLoja.calcularBonus());

        System.out.println("\n--- Teste de Polimorfismo ---");
        Funcionario f1 = funcionarioComum;
        Funcionario f2 = gerenteLoja;

        System.out.println("Bônus (f1 - Funcionário): R$" + f1.calcularBonus());
        System.out.println("Bônus (f2 - Gerente): R$" + f2.calcularBonus());
    }
}