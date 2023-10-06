package Esercizio;

public class Video extends ElementiMultimediali implements Riproducibile{

    private int durata = 0;
    private int volume = 0;

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {
        System.out.println("riproduci video");
    }

    @Override
    public void alzaVolume() {
        System.out.println("volume alzato");
    }

    @Override
    public void abbassaVolume() {
        System.out.println("volume abbassato");
    }
}
