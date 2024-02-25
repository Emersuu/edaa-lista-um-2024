package Animal;
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Cachorro
        Cachorro cachorro = new Cachorro(01, "Doméstico", "Terrestre", "Mel", "Pinscher", 3);
        
        // Imprimindo os dados do cachorro
        System.out.println("Dados do cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}