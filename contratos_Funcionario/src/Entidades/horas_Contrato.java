package Entidades;
import java.util.*;

public class horas_Contrato {
    
    private Date data;
    private double valorPorhora;
    private Integer horas;
    
    public horas_Contrato()
    {
    
    }

    public horas_Contrato(Date data, double valorPorhora, Integer horas) {
        this.data = data;
        this.valorPorhora = valorPorhora;
        this.horas = horas;
    }
    
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
    
    public double valor_Total()
    {
        return valorPorhora * horas;
    }
    
    
    
}
