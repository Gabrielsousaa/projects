package Application;

import java.util.*;
import Entidades.conta_Cliente;

public class Application {

   

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);
        conta_Cliente conta;

                System.out.println("Informe o numero da conta: ");
                int num_Conta = rd.nextInt();
                rd.nextLine();
                
                System.out.println("Informe o nome do titular da conta: ");
                String nome_Cliente = rd.next();
                
                System.out.println("Gostaria de fazer um deposito inicial? [s]/[n]");
                char reposta = rd.next().charAt(0);
                
                if(reposta == 's')
                {
                    System.out.println("Informe o deposito inicial: ");
                    double depositoInicial = rd.nextDouble();
                    conta = new conta_Cliente(nome_Cliente, num_Conta, depositoInicial);
                }else
                {
                 conta = new conta_Cliente(nome_Cliente, num_Conta);

                }
                System.out.println("");
                System.out.println(" Informações da Conta ");
                System.out.println(conta.toString_Saldo());
               
                System.out.println("");
                System.out.print("Informe o deposito desejado: ");
                double valorDeposito = rd.nextDouble();
                conta.deposito(valorDeposito);
                
                System.out.println("Info atualizada conta: ");
                System.out.println(conta.toString_Saldo());
                
                System.out.println("");
                System.out.print("Informe o Saque desejado: ");
                double valorSaque = rd.nextDouble();
                conta.saque(valorSaque);
                
                System.out.println("Info atualizada conta: ");
                System.out.println(conta.toString_Saldo());
                
    }    
    public static void limpaTela() {

        for (int count = 0; count < 200; count++) {
            System.out.println("");
        }
    }

}
