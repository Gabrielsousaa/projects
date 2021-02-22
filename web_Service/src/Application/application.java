package Application;

import Entidades.Cliente;
import Entidades.Pedido;
import Entidades.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import Entidades.enums.*;
import Entidades.pedido_Item;
public class application {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
    
        
        System.out.println("Informe os dados do cliente");
        System.out.print("Nome: ");  
        String nome = rd.nextLine();
        System.out.print("Email: ");
        String email = rd.nextLine();
        System.out.print("Data de nascimento: ");
        Date data = sdf.parse(rd.next());
        
        Cliente cliente = new Cliente(nome, email, data);
        
        System.out.println("Entre com os dados do pedido");
        System.out.print("Status: ");  
        pedido_Status status = pedido_Status.valueOf(rd.next());
        Pedido pedido = new Pedido(new Date(), status,cliente);
        
        System.out.print("Quantos items fazem parte do pedido?: ");
        int n = rd.nextInt();
        
        
       
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Entre com o "+ i +"º pedido ");
            System.out.print("Nome: ");
            rd.nextLine();
            String Nome = rd.nextLine();
            
            
            System.out.print("Preço do Produto: ");
            double preco_Produto = rd.nextDouble();
            
            System.out.print("Quantidade: ");
            int quantidade = rd.nextInt();
            
            Produto produto = new Produto(Nome,preco_Produto);
            
            pedido_Item it = new pedido_Item(quantidade, preco_Produto, produto);
            
            pedido.adicionarItem(it);
            
        }
        System.out.println("");
        System.out.println(pedido);
   
    }
    
}
