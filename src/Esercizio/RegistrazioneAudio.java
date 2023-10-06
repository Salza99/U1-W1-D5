package Esercizio;

public class RegistrazioneAudio extends ElementiMultimediali implements Riproducibile{

    //proprietà Registrazione
    private int durata= 0;
    private int volume= 0;


    //Costruttori
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
        this.volume = 2;
    }

    //Getter e Setter


    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    // Override e Overload
    @Override
    public void play() {
        String visulizzazioneVolume = "";
        for (int i = 0; i < this.volume; i++) {
            visulizzazioneVolume += "!";
        }
        for (int i = 1; i <= this.durata; i++) {
            System.out.println("minuto: " + i + " " +  this.getTitolo() + " volume: " + visulizzazioneVolume);
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

}
