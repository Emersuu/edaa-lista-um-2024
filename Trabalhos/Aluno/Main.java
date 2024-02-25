package Aluno;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997 , 45.00);
        
        System.out.println("\nTítulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());
        System.out.println("Preço: R$" + livro1.getPreco());

        Pessoa pessoa1 = new Pessoa("Emerson", 23, "Bairro Funcionarios, 350");
        
        System.out.println("\nNome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Endereço: " + pessoa1.getEndereco());
       
        Professor professor = new Professor("Daniel Paiva", "Ciências da Comutação");
        Disciplina disciplina = new Disciplina("Estrutura de Dados e Análise de Algoritmos", professor);
       
        System.out.println("\nDisciplina: " + disciplina.getNome());
        System.out.println("Professor Responsável: " + disciplina.getProfessorResponsavel().getNome());
        System.out.println("Disciplina: " + disciplina.getProfessorResponsavel().getDisciplina());
        
        Aluno aluno = new Aluno("Emerson", 42125468);
        Universidade universidade = new Universidade("Centro Universitário UNA", "Avenida Maria Da Gloria Rocha, 175");
        
        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Universidade: " + universidade.getNome());
        System.out.println("Endereço: " + universidade.getEndereco());
    }

    @Override
    public String toString() {
        return "Main []";
    }
}