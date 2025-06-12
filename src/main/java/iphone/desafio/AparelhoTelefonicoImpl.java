package iphone.desafio;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo chamada.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada, chamada em andamento.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe sua mensagem, logo retornaremos a ligação.");

    }
}
