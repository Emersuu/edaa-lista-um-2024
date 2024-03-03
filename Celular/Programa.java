public class Programa {
    public static void main(String[] args) {
        System.out.println("Testando o modelo básico:");
        Celular celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.fazerLigacao("123456789");
        celularBasico.enviarMensagem("987654321", "Olá, tudo bem?");
        celularBasico.desligar();
        System.out.println();

        System.out.println("Testando o modelo avançado:");
        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.fazerLigacao("123456789");
        celularAvancado.enviarMensagem("987654321", "Estou a caminho.");
        celularAvancado.fazerLigacao("987654321");
        celularAvancado.enviarMensagem("123456789", "Chegarei logo.");
        celularAvancado.desligar();
        System.out.println();

        celularAvancado.exibirHistoricoLigacoes();
        System.out.println();
        celularAvancado.exibirHistoricoMensagens();
    }
}