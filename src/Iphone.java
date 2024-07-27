public class Iphone implements Safari, Phone, Songs {
    private String musicaAtual;
    private String urlSite;
    private String numberPhone;

    @Override
    public void play() {
        if (musicaAtual != null) {
            System.out.println("Tocar Música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma Música selecionada");
        }
    }

    @Override
    public void pause() {
        if (musicaAtual != null) {
            System.out.println("Pausar Música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma Música selecionada");
        }
    }

    @Override
    public void selectMusica(String music) {
        this.musicaAtual = music;
        System.out.println("Musica Selecionada: " + musicaAtual );
    }

    @Override
    public void replay() {
        System.out.println("Reniciar música");
    }

    @Override
    public void ligar(String num) {
        this.numberPhone = num;
        System.out.println("Ligando para: " + numberPhone);
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação");
    }

    @Override
    public void showPage(String url) {
        this.urlSite = url;
        System.out.println("Entrando na página: " + urlSite);
    }

    @Override
    public void newPage() {
        System.out.println("Nova Página");
    }

    @Override
    public void refresh() {
        System.out.println("Recaregar Página");
    }
}