package Aluno;
public class Disciplina {
    // Atributos
    private String nome;
    private Professor professorResponsavel;
    
    // Construtor
    public Disciplina(String nome, Professor professorResponsavel) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
    }
    
    // Métodos Getters
    public String getNome() {
        return nome;
    }
    
    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }
}