package Entidades;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }
    
       public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double valortotalEstoque() {
        return preco * quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionaProdutos(int quantidade) {
        this.quantidade += quantidade;// direto no atributo        
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;// direto no atributo        
    }

    public String toString() {

        return "Produto: "
                + nome
                + "\n"
                + "Preço Unitário: R$"
                + String.format("%.2f", preco)
                +"\n"
                +"Unidade: "
                + quantidade
                + " unidades"
                + "\n"
                + "Valor total em estoque: R$"
                + String.format("%.2f", valortotalEstoque());

    }

}
