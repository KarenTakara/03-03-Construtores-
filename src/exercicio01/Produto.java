package exercicio01;

public class Produto {          // construtor padra (não tem parametro)
    String nome;
    double valor;
    int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void aumentarValot(double porcentagem) {
    valor *= (1 + porcentagem / 100);

    }
}