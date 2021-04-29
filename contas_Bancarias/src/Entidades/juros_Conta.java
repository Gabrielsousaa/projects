
package Entidades;


public class juros_Conta extends Conta{
    
    private double taxa;
    
    public juros_Conta()
    {
    super();
    
    }

    public juros_Conta(Double taxa, Integer numero, String correntista, Double saldo) {
        super(numero, correntista, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    
    public void atualizaSaldo()
    {
    saldo += saldo * taxa;
        
    }
    
}
