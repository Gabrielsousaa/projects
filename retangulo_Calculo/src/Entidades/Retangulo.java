package Entidades;

public class Retangulo {
    
    public double largura;
    public double altura;
    
    
    public double Area()
    {
    return largura * altura;   
    }
    
    public double Perimitro()
    {
    return 2*(altura + largura);
    }
    
    public double Diagonal()
    {
    return Math.sqrt(altura * altura + largura * largura);
    }
    
}
