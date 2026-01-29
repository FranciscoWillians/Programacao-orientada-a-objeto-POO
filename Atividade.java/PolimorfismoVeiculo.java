class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}
class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo rapidamente.");
    }
}
class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo lentamente.");
    }
}
public class PolimorfismoVeiculo {
    public static void main(String[] args) {
        Veiculo meuVeiculoGenerico = new Veiculo();
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        System.out.println("---Veículo Genérico ---");
        meuVeiculoGenerico.mover();

        System.out.println("\n---Carro ---");
        meuCarro.mover();

        System.out.println("\n---Bicicleta ---");
        minhaBicicleta.mover();

        System.out.println("\n--- Demonstração Array de Veículos ---");
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new Veiculo();
        veiculos[1] = new Carro();
        veiculos[2] = new Bicicleta();

        for (Veiculo v : veiculos) {
            v.mover();
        }
    }
}
