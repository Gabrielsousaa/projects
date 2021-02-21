
package Entidades;

public class conta_Cliente {
    private String nome_Cliente;
    private int num_Conta;
    private double saldo; 
    
public conta_Cliente(String nome_Cliente, int num_Conta)
{

 this.nome_Cliente = nome_Cliente;
 this.num_Conta = num_Conta;

}


public conta_Cliente(String nome_Cliente, int num_Conta, double deposito_Inicial)
{

 this.nome_Cliente = nome_Cliente;
 this.num_Conta = num_Conta;
 deposito(deposito_Inicial);
 

}

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public int getNum_Conta() {
        return num_Conta;
    }

    public double getSaldo() {
        return saldo;
    }
 
    public void deposito(double depo_Conta)
    {
    this.saldo += depo_Conta;
    }
    
    public void saque(double saque_Conta)
    {
        
    this.saldo -= saque_Conta + 5.00;
    }

    
    public String toString_Deposito()
    {

    return "Nome do Tilular: "
            +nome_Cliente
            +"\n"
            +"Número da conta do titular: "
            +num_Conta
            +"\n"
            +"Depósito adicionado: R$";
            
          
            
    }
        public String toString_Saldo()
    {

    return "Nome do Tilular: "
            +nome_Cliente
            +"\n"
            +"Número da conta do titular: "
            +num_Conta
            +"\n"
            +"Saldo: R$"
            +saldo;
            
             
    }
    
    
    
    
}
