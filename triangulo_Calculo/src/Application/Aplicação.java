package Application; 
import Entidades.Triangulo;
import java.util.*;
import javax.swing.JOptionPane;


public class Aplicação {

    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);
        
        Triangulo x,y;
        
        x = new Triangulo();
        y = new Triangulo();
        
        
        System.out.println("Insira as medidas do Triangulo X: ");
        x.a = rd.nextDouble();
        x.b = rd.nextDouble();    
        x.c = rd.nextDouble();
        System.out.println("Insira as medidas do Triangulo y: ");
        y.a = rd.nextDouble();
        y.b = rd.nextDouble();    
        y.c = rd.nextDouble();

        
        double areaX = x.calcula_area();   
        double areaY = y.calcula_area();
        
        System.out.printf("A area do Triangulo X: %.4f%n",areaX );
        System.out.printf("A area do Triangulo Y: %.4f%n",areaY );
        
        
        if(areaX>areaY)
        {
        System.out.println("Area do Triangulo X é maior que a Area do triangulo Y ");
        }
        else
        {
        System.out.println("Area do Triangulo Y é maior que a Area do triangulo X ");
        }

    }

}
