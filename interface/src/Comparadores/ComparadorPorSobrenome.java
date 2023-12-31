package Comparadores;

import java.util.Comparator;
import Entidades.Estudante;

// Implementa comparador de estudantes por sobrenome.

public class ComparadorPorSobrenome implements Comparator<Estudante> {
    @Override
    public int compare(Estudante A, Estudante B) {
        return A.getSobrenome().compareTo(B.getSobrenome());
    }
}
