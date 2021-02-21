package Entidades;

import java.util.*;
import Entidades.Aluno_Notas;

public class Aluno_Notas {

    public String Nome;
    public double nota1, nota2, nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltantes() {
        if (notaFinal() >= 21.0) {
            return 21.0 - notaFinal();

        } else {
            return 0.0;
        }

    }

}
