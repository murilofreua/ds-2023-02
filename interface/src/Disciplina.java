import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Estudante> alunos;

    public ArrayList<Estudante> getAlunos() { return this.alunos; }

    public void adicionaAluno(Estudante estudante) {
        alunos.add(estudante);
    }
}
