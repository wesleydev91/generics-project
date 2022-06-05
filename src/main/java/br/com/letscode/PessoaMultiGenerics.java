package br.com.letscode;

public class PessoaMultiGenerics <A, B, C> {

    private A a;
    private B b;
    private C c;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    /**
     * metodo -> .getClass().getName() retorna o tipo de dados da varivavel
     */
    public void imprimir() {
        System.out.printf("Variavel A é do tipo: %s!%n", a.getClass().getName());
        System.out.printf("Variavel B é do tipo: %s!%n", b.getClass().getName());
        System.out.printf("Variavel C é do tipo: %s!%n", c.getClass().getName());
    }

    public static void main(String[] args) {

        // esse exemplo passamos para genercis String, Integer e Boolean
        // o esperado é:
        // A -> String
        // B -> Integer
        // C -> Boolean
        PessoaMultiGenerics<String, Integer, Boolean> pessoa = new PessoaMultiGenerics<>();
        pessoa.a = "Wesley";
        pessoa.b = 1;
        pessoa.c =  true;

        pessoa.imprimir();
    }
}
