package Application;

import Entidades.enums.pedido;
import Entidades.enums.pedido_Status;
import java.util.*;
public class application {


    public static void main(String[] args) {
  
        
        pedido Pedido = new pedido(1080, new Date(), pedido_Status.pagamento_Pendente);
        
        System.out.println(Pedido);
        
        pedido_Status os1 = pedido_Status.entregue;
        pedido_Status os2 = pedido_Status.valueOf("entregue");
        
        System.out.println(os1);
        System.out.println(os2);
        
        
        
    }
    
}
