package Ordenadores;

import java.util.Comparator;
import Entidades.Estudante;

// Implementa comparador de estudantes por média das notas.

public class ComparadorPorMedia implements Comparator<Estudante> {
    @Override
    public int compare(Estudante A, Estudante B) {
        return A.getMedia().compareTo(B.getMedia());
    }
}
