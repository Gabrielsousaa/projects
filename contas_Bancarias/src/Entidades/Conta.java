package Entidades;

public class Conta {
    
    private Integer numero;
    private String correntista;
    protected double saldo;
    
    public Conta()
    
    {
    
    }

    public Conta(Integer numero, String correntista, double saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void Saque(double valor)
    {
    saldo -= valor;
    
    
    }
    
    public void Deposito(double valor)
    {
    
   saldo += valor; 
    }
    
    
    
    
}
