package Application;

import Entidades.Produto;
import java.util.*;

public class Aplicacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Name:  ");
        String nome = rd.nextLine();

        System.out.print("Preço: ");
        double preco = rd.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = rd.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        

        //System.out.println(produto.nome + "," + produto.preco + ","  + produto.quantidade); 
        System.out.println();
        System.out.print(produto.toString()+ "\n");

        System.out.println();
        System.out.print("Quantos produtos serão adicionados no estoque:  ");
        quantidade = rd.nextInt();
        produto.adicionaProdutos(quantidade);

        System.out.println();
        System.out.print(produto.toString()+ "\n");

        System.out.print("Quantos produtos serão removidos no estoque:  ");
        quantidade = rd.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.print(produto.toString()+ "\n");

        rd.close();

    }

}
