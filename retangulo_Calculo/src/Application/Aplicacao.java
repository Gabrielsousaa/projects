package Application;
import Entidades.Retangulo;
import java.util.*;

public class Aplicacao {

    public static void main(String[] args) {
    
        Scanner rd = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Retangulo retangulo = new Retangulo();
        
        
        System.out.println("Entre com a Largura do Retangulo: ");
        retangulo.altura = rd.nextDouble();
        System.out.println("Entre com a Altura do Retangulo: ");
        retangulo.largura = rd.nextDouble();
        
        System.out.printf("Area = %.2f%n", retangulo.Area());
        System.out.printf("Perimitro = %.2f%n", retangulo.Perimitro());
        System.out.printf("Diagonal = %.2f%n", retangulo.Diagonal());
        rd.close();
        
        
    }
    
}
