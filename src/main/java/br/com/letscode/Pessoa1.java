package br.com.letscode;

public class Pessoa1 {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        // cria uma instancia da classe Pessoa 1
        Pessoa1 pessoa1 = new Pessoa1();
        // usa encapsulamento para sentar o valor no atributo nome da classe pessoa
        pessoa1.setNome("wesley");
    }
}
