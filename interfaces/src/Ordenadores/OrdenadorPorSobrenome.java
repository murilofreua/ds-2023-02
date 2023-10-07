package Ordenadores;

import java.util.Comparator;
import Entidades.Estudante;

// Implementa comparador de estudantes por sobrenome.

public class OrdenadorPorSobrenome implements Comparator<Estudante> {
    @Override
    public int compare(Estudante A, Estudante B) {
        return A.getSobrenome().compareTo(B.getSobrenome());
    }
}
