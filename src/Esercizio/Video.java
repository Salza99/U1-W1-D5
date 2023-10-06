package Esercizio;

public class Video extends ElementiMultimediali implements Riproducibile, Luminosita{
    //proprietà
    private int durata = 0;
    private int volume = 2;
    private int luminosita = 2;

    //Costruttori
    public Video(String titolo) {
        super(titolo);
    }

    public Video(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }

    //Getter e Setter

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // Override e Overload
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
        for (int i = 1; i <= this.durata; i++) {
            System.out.println("minuto: " + i + " " + this.getTitolo() + " volume: " + volumeVisualizzato + " luminosità: " + luminositaVisualizzata);
        }
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 3) {
            volume += 1;
        }else{
            System.out.println("volume massimo raggiunto");
        }
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) {
            volume -= 1;
        }else {
            System.out.println("il volume del video è gia muto");
        }
    }
    @Override
    public void aumentaLuminosita() {
        if (this.luminosita < 3) {
            luminosita += 1;
        }else {
            System.out.println("luminosità massima raggiunta");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (this.luminosita > 1) {
            luminosita -= 1;
        }else {
            System.out.println("luminosità minima raggiunta");
        }
    }
}
