package Esercizio;

public class RegistrazioneAudio extends ElementiMultimediali implements Riproducibile{

    private int durata= 0;
    private int volume= 0;

    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {
        System.out.println("riproduci traccia");
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
