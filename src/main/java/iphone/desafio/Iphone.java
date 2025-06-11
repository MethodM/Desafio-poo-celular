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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public AparelhoTelefonicoImpl getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonicoImpl aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public NavegadorInternetImpl getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternetImpl navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public NavegadorInternetImpl getAdicionarNovaAba() {
        return navegadorInternet;
    }

    public void setAdicionarNovaAba(NavegadorInternetImpl navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public NavegadorInternetImpl getAtualizarPagina() {
        return navegadorInternet;
    }

    public void setAtualizarPagina(NavegadorInternetImpl navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public ReprodutorMusicalImpl getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusicalImpl reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public ReprodutorMusicalImpl getTocar() {
        return reprodutorMusical;
    }

    public void setTocar(ReprodutorMusicalImpl reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public ReprodutorMusicalImpl getPausar() {
        return reprodutorMusical;
    }

    public void setPausar(ReprodutorMusicalImpl pausar) {
        this.reprodutorMusical = pausar;
    }

    public ReprodutorMusicalImpl getSelecionarMusica() {
        return reprodutorMusical;
    }

    public void setSelecionarMusica(ReprodutorMusicalImpl selecionarMusica) {
        this.reprodutorMusical = selecionarMusica;
    }
}
