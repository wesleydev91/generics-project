package br.com.letscode;

public class CalculadoraComDouble extends CalculadoraAbstract<Double> {
    @Override
    Double somar(Double t1, Double t2) {
        return t1 + t2;
    }
}
