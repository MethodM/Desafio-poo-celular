package org.example;

public class IphoneTestDrive {
    public static void main(String[] args) {
        //Criação de um Iphone
        Iphone iphone = new Iphone("Iphone 14", "Apple", "iOS 16");
        //Exibindo informações do Iphone
        System.out.println("Modelo: " + iphone.getModelo());
        System.out.println("Marca: " + iphone.getMarca());
        System.out.println("Sistema Operacional: " + iphone.getSistemaOperacional());
        //Utilizando métodos do Iphone
        iphone.getAparelhoTelefonico().ligar("+551198765-4321");
        iphone.getAparelhoTelefonico().atender();
        iphone.getAparelhoTelefonico().iniciarCorreioVoz();

        //Exibindo informações do Navagador de Internet
        iphone.getNavegadorInternet().exibirPagina("https://www.google.com");
        iphone.getNavegadorInternet().adicionarNovaAba();
        iphone.getNavegadorInternet().atualizarPagina();

        //Exibindo informações do Reprodutor Musical
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();
        iphone.getReprodutorMusical().selecionarMusica("Ed Sheeran - Sapphire (Official Music Video");
    }
}