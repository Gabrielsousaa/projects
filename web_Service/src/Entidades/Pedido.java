package Entidades;

import Entidades.enums.pedido_Status;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date data;
    private List<pedido_Item> items = new ArrayList<>();

    private Cliente cliente;
    
    pedido_Status status;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pedido() {

    }

    public Pedido(Date data, pedido_Status status, Cliente cliente) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;

    }



    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<pedido_Item> getItem() {
        return items;
    }

    public void adicionarItem(pedido_Item item) {
        items.add(item);

    }

    public void removerItem(pedido_Item item) {
        items.remove(item);

    }

    public double total() {
        double soma = 0.0;
        for (pedido_Item item : items) {
            soma += item.subTotal();
        }
        return soma;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Data do Pedido");
        sb.append(sdf.format(data)+ "\n");
        sb.append("Status do Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: " );
        sb.append(cliente.getNome() + "\n");
        sb.append("Items do pedido\n");
        for (pedido_Item item : items) {
            sb.append(item + "\n ");

        }
        sb.append("Total: $");
        sb.append(String.format("%.2f",total()));

        
        
        return sb.toString();

    }
}
