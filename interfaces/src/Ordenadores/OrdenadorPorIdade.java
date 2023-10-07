package Ordenadores;

import java.util.Comparator;
import Entidades.Estudante;

// Implementa comparador de estudantes por idade.

public class OrdenadorPorIdade implements Comparator<Estudante> {
    @Override
    public int compare(Estudante A, Estudante B) {
        return A.getIdade().compareTo(B.getIdade());
    }
}
