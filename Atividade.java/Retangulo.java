public class Retangulo {
    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 5.0;
        retangulo1.altura = 10.0;

        double area = retangulo1.calcularArea();
        System.out.println("A área do retângulo é: " + area); // Saída: A área do retângulo é: 50.0
    
    
        Retangulo retangulo2 = new Retangulo();
        retangulo2.largura = 10.0;
        retangulo2.altura = 2.0;

        double area2 = retangulo2.calcularArea();
        System.out.println("A área do retângulo dois é: " + area2); // Saída: A área do retângulo é: 50.0
    }
}