package Application;

import Entidades.Comentario;
import Entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Application {

    public static void main(String[] args) throws ParseException {
     
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comentario comen1 = new Comentario ("Tenha um ótimo dia!");
        Comentario comen2 = new Comentario("QUE DA HORA");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Australia",
                                 "Indo viajar pra esse pais maneiro", 
                                  12);
       
        p1.adicionarComentario(comen1);
        p1.adicionarComentario(comen2);
        System.out.println(p1);
        
    }
    
}
