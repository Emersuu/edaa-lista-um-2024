package Aluno;
public class Universidade {
    // Atributos
    private String nome;
    private String endereco;
    
    // Construtor
    public Universidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    // Métodos Getters
    public String getNome() {
        return nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
}