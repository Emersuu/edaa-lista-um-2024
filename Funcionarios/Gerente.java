public class Gerente extends Funcionario {
    private static final double BONUS_FIXO = 1000;

    public Gerente(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.20 + BONUS_FIXO; // Bônus de 20% + R$ 1000
    }
}