package br.com.letscode;

/**
 *
 * Generic podemos utilizar em classes, classes abstratas e intefaces
 * podemos ter diversos paramostros Genericos ex: Classe PessoaMultiGenerics
 *
 */
public class Pessoa<S> {

    S texto;

    public static void main(String[] args) {

        // Podemos criar uma classe sem passar o Tipagem no generic
        // mas temos que fazer validação de qual tipo do variavel e realizar um cast
        Pessoa p = new Pessoa();

        p.texto = "ola mundo";

        // validação em caso de nao setar o Tipo de dado no generics
        if (p.texto instanceof String) {
            String varivael = (String) p.texto;
        }

        if (p.texto instanceof Integer) {
            Integer inteiro = (Integer)  p.texto;
        }


        // aqui criamos uma instancia do objeto pessoa
        // falando que sua variavel generica é do tipo integer
        // dessa forma nao precisamo fazer um validação do tipo de dado nem cast
        Pessoa<Integer> p1 = new Pessoa<>();

        p1.texto = 1;

        System.out.printf("o texto da instancia da classe p1 é %d", p1.texto);


    }
}
