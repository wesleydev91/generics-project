package br.com.letscode;

public class CalculadoraComInteiros implements ICalculadora<Integer> {

    @Override
    public Integer somar(Integer t1, Integer t2) {
        return t1 + t2;
    }
}
