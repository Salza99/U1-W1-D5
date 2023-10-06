package Esercizio;

public class Video extends ElementiMultimediali implements Riproducibile, Luminosita{

    private int durata = 0;
    private int volume = 2;
    private int luminosita = 2;

    public Video(String titolo) {
        super(titolo);
    }

    public Video(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    @Override
    public void play() {
        String luminositaVisualizzata = "";
        String volumeVisualizzato = "";
        for (int i = 0; i < this.luminosita; i++) {
            luminositaVisualizzata += "*";
        }
        for (int i = 0; i < this.volume; i++) {
            volumeVisualizzato += "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + " volume: " + volumeVisualizzato + " luminosità: " + luminositaVisualizzata);
        }
    }

    @Override
    public void alzaVolume() {
        System.out.println("volume alzato");
    }

    @Override
    public void abbassaVolume() {
        System.out.println("volume abbassato");
    }
    @Override
    public void aumentaLuminosita() {
        System.out.println("aumenta lum.");
    }

    @Override
    public void diminuisciLuminosita() {
        System.out.println("diminuisci lum");
    }
}
