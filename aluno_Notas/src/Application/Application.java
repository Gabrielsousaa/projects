package Application;

import Entidades.Aluno_Notas;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner rd = new Scanner(System.in);

        Aluno_Notas aluno = new Aluno_Notas();
        System.out.println("Informe o nome do aluno ");
        aluno.Nome = rd.nextLine();

        System.out.println("Informe as notas do aluno: ");

        aluno.nota1 = rd.nextDouble();
        aluno.nota2 = rd.nextDouble();
        aluno.nota3 = rd.nextDouble();

        System.out.println("Nota final " + aluno.notaFinal());

        if (aluno.notaFinal() <= 7.0) {
            System.out.println("Aluno: "+ aluno.Nome);
            System.out.println("Não Passou ");
            System.out.printf("Pontos Faltantes %.2f pontos%n", aluno.pontosFaltantes());
        } else {
            System.out.println("Aluno: "+ aluno.Nome);
            System.out.println("Passou");
            
        }
    }
}
