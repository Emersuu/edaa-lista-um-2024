import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        int id = 1;
        while (true) {
            System.out.println("Digite o nome do funcionário (ou digite 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o salário base do funcionário:");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o cargo do funcionário (DESENVOLVEDOR, GERENTE, ou SUPORTE):");
            String cargoStr = scanner.nextLine();

            Cargo cargo;
            try {
                cargo = Cargo.valueOf(cargoStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Cargo inválido. Por favor, tente novamente.");
                continue;
            }

            Funcionario funcionario;
            switch (cargo) {
                case DESENVOLVEDOR:
                    funcionario = new Desenvolvedor(nome, id++, salarioBase);
                    break;
                case GERENTE:
                    funcionario = new Gerente(nome, id++, salarioBase);
                    break;
                case SUPORTE:
                    funcionario = new Suporte(nome, id++, salarioBase);
                    break;
                default:
                    funcionario = null;
            }

            empresa.adicionarFuncionario(funcionario);
        }

        double folhaSalarial = empresa.calcularFolhaSalarial();
        System.out.println("Folha Salarial Total: R$ " + folhaSalarial);

        scanner.close();
    }
}