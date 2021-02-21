package Entidades;

import Entidades.enums.herarquia_Func;
import java.util.*;

public class Funcionario {

    private String nome;
    private herarquia_Func herarc;
    private double salario_Base;

    private Departamento departamento;
    private List<horas_Contrato> contratos = new ArrayList<>();

    public Funcionario() {

    }

    public Funcionario(String nome, herarquia_Func herarc, double salario_Base, Departamento departamento) {
        this.nome = nome;
        this.herarc = herarc;
        this.salario_Base = salario_Base;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public herarquia_Func getHerarc() {
        return herarc;
    }

    public void setHerarc(herarquia_Func herarc) {
        this.herarc = herarc;
    }

    public double getSalario_Base() {
        return salario_Base;
    }

    public void setSalario_Base(double salario_Base) {
        this.salario_Base = salario_Base;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<horas_Contrato> getContratos() {
        return contratos;
    }

    public void recebe_Contrato(horas_Contrato contrato) {
        contratos.add(contrato);

    }

    public void remove_Contrato(horas_Contrato contrato) {
        contratos.remove(contrato);

    }

    public double ganho(int ano, int mes) {
        double soma = salario_Base;
        Calendar cal = Calendar.getInstance();

        for (horas_Contrato c : contratos) {
        cal.setTime(c.getData());
        int c_Ano = cal.get(Calendar.YEAR);
        int c_Mes = 1 + cal.get(Calendar.MONTH);
        
        if(ano == c_Ano && mes == c_Mes)
        {
            soma += c.valor_Total();
        
        }
            
        
        
        }
        return soma;

    }

}
