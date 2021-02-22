package Entidades;

import java.text.SimpleDateFormat;

public class pedido_Item {

    private int quantidade;
    private double preco;

    private Produto produto;
    private Pedido pedido;

    public pedido_Item() {

    }

    public pedido_Item(int quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {

        return preco * quantidade;
    }

    public String toString() {
        return getProduto().getProduto()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantity: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
