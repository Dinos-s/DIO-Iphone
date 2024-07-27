public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando Songs
        iphone.selectMusica("everywhere i go, Onlap");
        iphone.play();
        iphone.pause();
        iphone.replay();

        // Testando Phone
        iphone.ligar("(99) 99999-9999");
        iphone.atender();

        // Testando Safari
        iphone.showPage("https://dio.me");
        iphone.newPage();
        iphone.refresh();
    }
}
