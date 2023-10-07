package Entidades;

import java.util.ArrayList;

public class Estudante {
    private Integer matricula;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private ArrayList<Double> notas;

    public Integer getMatricula() { return this.matricula; }

    public void setMatricula(Integer matricula) { this.matricula = matricula; }

    public String getNome() { return this.nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return this.sobrenome; }

    public void setSobrenome(String nome) { this.sobrenome = sobrenome; }

    public Integer getIdade() { return this.idade; }

    public void setIdade(Integer idade) { this.idade = idade; }

    public void adicionaNota(double nota) { notas.add(nota); }

    public ArrayList<Double> getNotas() { return this.notas; }

    public Double getMedia() {
        Double media = 0.0;

        for(int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }

        return media;
    }
}
