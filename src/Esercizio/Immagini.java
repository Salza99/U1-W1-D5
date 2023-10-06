package Esercizio;

public class Immagini extends ElementiMultimediali implements Luminosita{
    private int luminosita = 2;
    public Immagini(String titolo) {
        super(titolo);
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
