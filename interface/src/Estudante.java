import java.util.ArrayList;

public class Estudante {
    private int matricula;
    private String nome;
    private String sobrenome;
    private int idade;
    private ArrayList<Double> notas;

    public int getMatricula() { return this.matricula; }

    public void setMatricula(int matricula) { this.matricula = matricula; }

    public String getNome() { return this.nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return this.sobrenome; }

    public void setSobrenome(String nome) { this.sobrenome = sobrenome; }

    public int getIdade() { return this.idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public void adicionaNota(double nota) { notas.add(nota); }

    public ArrayList<Double> getNotas() { return this.notas; }

    public double getMedia() {
        double media = 0;

        for(int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }

        return media;
    }
}
