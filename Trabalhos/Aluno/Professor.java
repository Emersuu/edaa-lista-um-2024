package Aluno;
public class Professor {
    // Atributos
    private String nome;
    private String disciplina;
    
    // Construtor
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }
    
    // Métodos Getters
    public String getNome() {
        return nome;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
}