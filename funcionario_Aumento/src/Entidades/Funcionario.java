package Entidades;

public class Funcionario {

    public String nome;
    public double salario_Bruto, salario_Liquido;
    public double imposto;

    public double salarioTaxado() {
        return salario_Bruto - imposto;
    }

    public void aumentoSalario(double porcentagem) {
        salario_Bruto += salario_Bruto * porcentagem/100.0;
    }

    public String toString() {
        return "Nome: "
                +nome 
                +"\n"
                +"Salário Liquido: R$ "
                +String.format("%.2f", salarioTaxado())
                +"\nImposto: R$ "
                +imposto;
    }
}
