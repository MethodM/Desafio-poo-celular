package iphone.desafio;

public class Iphone {
    private String modelo;
    private String marca;
    private String sistemaOperacional;
    private AparelhoTelefonicoImpl aparelhoTelefonico;
    private NavegadorInternetImpl navegadorInternet;
    private ReprodutorMusicalImpl reprodutorMusical;

    public Iphone(String modelo, String marca, String sistemaOperacional) {
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
        this.reprodutorMusical = new ReprodutorMusicalImpl();
    }

    public String getModelo() {
        return modelo;
    }


    public String getMarca() {
        return marca;
    }


    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public AparelhoTelefonicoImpl getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternetImpl getNavegadorInternet() {
        return navegadorInternet;
    }

    public ReprodutorMusicalImpl getReprodutorMusical() {
        return reprodutorMusical;
    }
}
