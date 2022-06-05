package br.com.letscode;

public class Main {

    public static void main(String[] args) {
        /**
         * exemplo de criação de uma instancia de objeto
         */
        CalculadoraComInteiros calculadoraComInteiros = new CalculadoraComInteiros();

        System.out.println(calculadoraComInteiros.somar(1, 1));

        CalculadoraComDouble calculadoraComDouble = new CalculadoraComDouble();

        calculadoraComDouble.imprimirResultado(1.0, 1.2);
    }
}
