package Aluno;

public class Aluno {
    // Atributos
    private String nome;
    private int matricula;
    
    // Construtor
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // Métodos Getters
    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
}