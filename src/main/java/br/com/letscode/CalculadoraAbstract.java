package br.com.letscode;

public abstract class CalculadoraAbstract<T> {

    abstract T somar(T t1, T t2);

    public void imprimirResultado(T t1, T t2) {
        System.out.println(somar(t1, t2));
    }
}
