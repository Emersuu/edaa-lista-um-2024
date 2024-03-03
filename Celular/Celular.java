public interface Celular {
    void ligar();
    void desligar();
    void fazerLigacao(String numero);
    void enviarMensagem(String numero, String mensagem);
}
