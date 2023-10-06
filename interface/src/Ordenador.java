import java.util.ArrayList;

// Ordena os estudantes pela matrícula através de diversos atributos.

public class Ordenador {
    public ArrayList<Estudante> ordenaPorNome(ArrayList<Estudante> estudantes) {
        int swap;

        for (int i = 0; i < estudantes.size(); i++) {
            for (int j = i + 1; j < estudantes.size(); j++) {
                if (estudantes.get(i).getNome().compareTo(estudantes.get(j).getNome()) > 0) {
                    // swapping
                    swap = estudantes.get(i).getMatricula();
                    estudantes.get(i).setMatricula(estudantes.get(j).getMatricula());
                    estudantes.get(j).setMatricula(swap);
                }
            }
        }

        return estudantes;
    }

    public ArrayList<Estudante> ordenaPorSobrenome(ArrayList<Estudante> estudantes) {
        int swap;

        for (int i = 0; i < estudantes.size(); i++) {
            for (int j = i + 1; j < estudantes.size(); j++) {
                if (estudantes.get(i).getSobrenome().compareTo(estudantes.get(j).getSobrenome()) > 0) {
                    // swapping
                    swap = estudantes.get(i).getMatricula();
                    estudantes.get(i).setMatricula(estudantes.get(j).getMatricula());
                    estudantes.get(j).setMatricula(swap);
                }
            }
        }

        return estudantes;
    }

    public ArrayList<Estudante> ordenaPorIdade(ArrayList<Estudante> estudantes) {
        int swap;

        for (int i = 0; i < estudantes.size(); i++) {
            for (int j = i + 1; j < estudantes.size(); j++) {
                if (estudantes.get(i).getIdade() > estudantes.get(j).getIdade()) {
                    // swapping
                    swap = estudantes.get(i).getMatricula();
                    estudantes.get(i).setMatricula(estudantes.get(j).getMatricula());
                    estudantes.get(j).setMatricula(swap);
                }
            }
        }

        return estudantes;
    }

    public ArrayList<Estudante> ordenaPorMedia(ArrayList<Estudante> estudantes) {
        int swap;

        for (int i = 0; i < estudantes.size(); i++) {
            for (int j = i + 1; j < estudantes.size(); j++) {
                if (estudantes.get(i).getMedia() > estudantes.get(j).getMedia()) {
                    // swapping
                    swap = estudantes.get(i).getMatricula();
                    estudantes.get(i).setMatricula(estudantes.get(j).getMatricula());
                    estudantes.get(j).setMatricula(swap);
                }
            }
        }

        return estudantes;
    }
}
