public class ContaBancaria {
    String titular;
    double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é zero
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva");

        conta1.exibirSaldo(); // Esse vai aparecer o saldo inicial

        conta1.depositar(1000.00);
        conta1.exibirSaldo();

        conta1.sacar(200.00);
        conta1.exibirSaldo();

        conta1.sacar(1500.00); // Caso o caloteiro tente sacar mais que o saldo
        conta1.exibirSaldo();

        conta1.depositar(-50); // Tentativa de depósito inválido
    }
}