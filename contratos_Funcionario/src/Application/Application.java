package Application;

import Entidades.Departamento;
import Entidades.Funcionario;
import Entidades.enums.herarquia_Func;
import Entidades.horas_Contrato;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Application {


    public static void main(String[] args) throws ParseException {
         
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Informe o nome do departamento: ");
        String departamento_Nome = rd.nextLine();
        
        System.out.println("Entre com os dados do funcionario: ");
        System.out.print("Nome: ");
        String func_Nome = rd.nextLine();
        
        System.out.print("Nivel: ");
        String herarc = rd.nextLine();
        
        System.out.print("Salário base: ");
        double salario_Base = rd.nextDouble();
        
        Funcionario func = new Funcionario(func_Nome, herarquia_Func.valueOf(herarc), salario_Base, new Departamento(departamento_Nome));
        
        
        System.out.print("Quantos contratos tem esse funcionario?: ");
        
        int n = rd.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Entre com o "+ i +"º contrato ");
            System.out.print("data (DD/MM/AAAA): ");
            Date contractDate = sdf.parse(rd.next());
            
            System.out.print("Valor por hora: ");
            double valorPorHora = rd.nextDouble();
            
            System.out.print("Duração das horas: ");
            int horas = rd.nextInt();
            
            horas_Contrato contrato = new horas_Contrato(contractDate, valorPorHora, horas);
            
            func.recebe_Contrato(contrato);
        }
        
        System.out.println();
        System.out.println("Informe o mes e o ano do contrato ganho (MM/yyyy) ");
        String mesAno = rd.next();
        
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));
        
        System.out.println("Nome:"+ func.getNome());
        System.out.println("Departamento:"+ func.getDepartamento().getName());
        System.out.println("Ganho no ano e mes informado:"+ mesAno + String.format("%.2f", func.ganho(ano, mes)));
        
        rd.close();
        
    }
    
}
