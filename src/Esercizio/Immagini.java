package Esercizio;

public class Immagini extends ElementiMultimediali implements Luminosita{
    //proprietà
    private int luminosita = 2;
    //Costruttori
    public Immagini(String titolo) {
        super(titolo);
    }

//Getter e Setter

    //metodi della classe
    public void show(){
        String luminositaVisualizzata= "";
        for (int i = 0; i < this.luminosita; i++) {
            luminositaVisualizzata += "*";
        }
        System.out.println(this.getTitolo() + " luminosità: " + luminositaVisualizzata);

    }

    // Override e Overload
    @Override
    public void aumentaLuminosita() {
        System.out.println("aumenta lum.");
    }

    @Override
    public void diminuisciLuminosita() {
        System.out.println("diminuisci lum");
    }
}
