package Application;
import java.util.*;
import Entidades.Funcionario;
public class Aplicacao {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);
        
        Funcionario func = new Funcionario();
        
        System.out.print("Insira o nome do Funcionário: ");
        func.nome = rd.nextLine();
        System.out.print("Insira o salário bruto do Funcionário: ");
        func.salario_Bruto = rd.nextDouble();
        System.out.print("Insira o imposto sob o salário do Funcionário: ");
        func.imposto = rd.nextDouble();
        
        
        
        System.out.println(func);
        
        System.out.print("Quanto de aumento no salário do funcionário: ");
        double porcentagem = rd.nextDouble();
        func.aumentoSalario(porcentagem);
        
        System.out.println();
        System.out.println("Info Atualizada: \n"+ func);
        
        
    }
    
}
