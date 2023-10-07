package Comparadores;

import java.util.Comparator;
import Entidades.Estudante;

// Implementa comparador de estudantes por nome.

public class ComparadorPorNome implements Comparator<Estudante> {
    @Override
    public int compare(Estudante A, Estudante B) {
        return A.getNome().compareTo(B.getNome());
    }
}
