package Entidades;

public class conta_Business extends Conta{
    
    private double limite_Emprestimo;
    
    public conta_Business()
    {
 
    }

    public conta_Business(Integer numero, String correntista, Double saldo, Double limite_Emprestimo) {
        super(numero, correntista, saldo);
        this.limite_Emprestimo = limite_Emprestimo;
    }

    public double getLimite_Emprestimo() {
        return limite_Emprestimo;
    }

    public void setLimite_Emprestimo(double limite_Emprestimo) {
        this.limite_Emprestimo = limite_Emprestimo;
    }
    
    public void loan(double valor)
    {
        if (valor <= limite_Emprestimo ) {
            saldo += valor -10;
        }
    
    }
    
    
}
