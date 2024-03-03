import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaSalarial() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }
        return totalSalarios;
    }
}