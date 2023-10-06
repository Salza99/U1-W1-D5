package Esercizio;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // test
    /*RegistrazioneAudio a = new RegistrazioneAudio("Bella Ciao", 3);
    Video b = new Video("EsempioVideo", 11);
    Immagini c = new Immagini("Gioconda");
    a.play();
    b.play();
    c.show();*/
        // avvio l'applicazione
    runApplication();
    }
        // override

    @Override
    public String toString() {
        return super.toString();
    }

    public static void runApplication(){

        ElementiMultimediali[] store = new ElementiMultimediali[]{};
        Scanner input = new Scanner(System.in);
        System.out.println("Iniziamo creando la tua libreria di 5 oggetti,");
        System.out.println("potrai scegliere se aggiungere video, immagini o registrazioni audio");
        System.out.println("premi 1 per proseguire, 2 per accedere alla libreria (al momento è vuota), 0 per terminare il processo");
        String resp = input.nextLine();
        boolean open = true;
        while (open) {if (resp.equals("1")){
            System.out.println("scegli se inserire: ");
            System.out.println("un'immagine(img), un video(video), una traccia audio(mp3) oppure 2 per accedere alla tua libreria e 0 per uscire dal programma");
            resp = input.nextLine();
        } else if (resp.equals("2")) {
            boolean openMenu = true;
            while (openMenu) {
                System.out.println("Benvenuto dai un'occhiata alla tua libreria");
                System.out.println("Al momento contiene: " + store.length + " elementi");
                System.out.println("premi 1 per inserire un nuovo elemento, 2 per visualizzarli, 0 per terminare il processo");
                resp = input.nextLine();
                if (resp.equals("1")){
                    break;
                } else if (resp.equals("2")) {
                    boolean openMenuStore= true;
                    while(openMenuStore){

                    System.out.println("i tuoi contenuti sono: ");

                    for (ElementiMultimediali elemento : store) {

                        if (elemento instanceof Immagini) {
                            System.out.println("Immagine " + elemento.getTitolo());
                        } else if (elemento instanceof Video) {
                            System.out.println("Video " + elemento.getTitolo());
                        }else {
                            System.out.println("Mp3 " + elemento.getTitolo());
                        }
                    }
                    if (store.length == 0) {
                        System.out.println("mi spiace ma non hai elementi da visualizzare");
                        resp = "1";
                    } else {
                        System.out.println("seleziona tramite il titolo del file il contenuto da mostrare");
                        System.out.println("0 per tornare indietro");
                        resp = input.nextLine();
                    }
                    for (ElementiMultimediali elemento: store) {
                        if (resp.equals("0")) {
                            System.out.println("chiudo il menu selezione");
                            openMenuStore = false;
                            break;
                        } else if (resp.equals(elemento.getTitolo())) {
                            if (elemento instanceof Immagini) {
                                System.out.println("hai selezionato " + elemento.getTitolo());
                                ((Immagini) elemento).show();
                                System.out.println("digita lum+ per aumentare la luminosità (lumMax: 3), lum- per diminuirla (lumMin: 1)");
                                System.out.println("altrimenti 0 per tornare indietro");
                                resp = input.nextLine();
                                switch (resp){
                                    case "lum+":
                                        ((Immagini) elemento).aumentaLuminosita();
                                        System.out.println("ecco l'immagine con luminosità aumentata: ");
                                        ((Immagini) elemento).show();
                                        break;
                                    case "lum-":
                                        ((Immagini) elemento).diminuisciLuminosita();
                                        System.out.println("ecco l'immagine con luminosità diminuita: ");
                                        ((Immagini) elemento).show();
                                        break;
                                    default:
                                        System.out.println("comando non riconosciuto");
                                        break;
                                }
                            } else if (elemento instanceof Video) {
                                System.out.println("hai selezionato " + elemento.getTitolo());
                                ((Video) elemento).play();
                                System.out.println("digita lum+ per aumentare la luminosità (lumMax: 3), lum- per diminuirla (lumMin: 1)");
                                System.out.println("digita vol+ per aumentare il volume (volMax: 3), vol- per diminuirlo (volmin: 0)");
                                System.out.println("altrimenti 0 per tornare indietro");
                                resp = input.nextLine();
                                switch (resp){
                                    case "lum+":
                                        ((Video) elemento).aumentaLuminosita();
                                        System.out.println("ecco il video con luminosità aumentata: ");
                                        ((Video) elemento).play();
                                        break;
                                    case "lum-":
                                        ((Video) elemento).diminuisciLuminosita();
                                        System.out.println("ecco il video con luminosità diminuita: ");
                                        ((Video) elemento).play();
                                        break;
                                    case "vol+":
                                        ((Video) elemento).alzaVolume();
                                        System.out.println("ecco il video con volume aumentato");
                                        ((Video) elemento).play();
                                        break;
                                    case "vol-":
                                        ((Video) elemento).abbassaVolume();
                                        System.out.println("ecco il video con volume abbassato");
                                        ((Video) elemento).play();
                                        break;
                                    default:
                                        System.out.println("comando non riconosciuto");
                                        break;
                                }
                            } else if (elemento instanceof RegistrazioneAudio) {
                                System.out.println("hai selezionato " + elemento.getTitolo());
                                ((RegistrazioneAudio) elemento).play();
                                System.out.println("digita vol+ per aumentare il volume (volMax: 3), vol- per diminuirlo (volmin: 0)");
                                System.out.println("altrimenti 0 per tornare indietro");
                                resp = input.nextLine();
                                switch (resp){
                                    case "vol+":
                                        ((RegistrazioneAudio) elemento).alzaVolume();
                                        System.out.println("ecco il video con volume aumentato");
                                        ((RegistrazioneAudio) elemento).play();
                                        break;
                                    case "vol-":
                                        ((RegistrazioneAudio) elemento).abbassaVolume();
                                        System.out.println("ecco il video con volume abbassato");
                                        ((RegistrazioneAudio) elemento).play();
                                        break;
                                    default:
                                        System.out.println("comando non riconosciuto");
                                        break;

                                }
                            }
                        } else if (resp.equals("1")) {
                            break;
                        }


                    }
                    if (resp.equals("0")) {
                        System.out.println("programma in chiusura");
                        open = false;
                        break;
                    }}
                } else if (resp.equals("0")) {
                    System.out.println("programma in chiusura");

                    break;
                } else {

                    resp = "2";
                }
            }
        } else if (resp.equals("0")) {
            System.out.println("programma in chiusura");
            open = false;
            input.close();
        } else {
            System.out.println("comando non riconosciuto");
            System.out.println("premi 1 per proseguire, 2 per accedere alla libreria (al momento è vuota), 0 per terminare il processo");
            resp = input.nextLine();
        }


            switch(resp){

                case "0":
                    System.out.println("programma in chiusura");
                    input.close();
                    open = false;
                    break;

                        case "img":
                            ElementiMultimediali[] storeImg = new ElementiMultimediali[store.length + 1];
                            System.out.println("inserisci titolo immagine");
                            resp = input.nextLine();
                            Immagini a = new Immagini(resp);
                            for (int i = 0; i < storeImg.length; i++) {
                            if (i == storeImg.length -1) {
                                storeImg[i] = a;
                            }else {
                                storeImg[i] = store[i];
                            }
                            }
                            store = storeImg;
                            System.out.println("immagine inserita con successo");
                            System.out.println("la tua libreria contiene: " + store.length + " elementi");
                            System.out.println("(1) inserire un altro elemento, (2) accedi al menu selezione");
                            resp = input.nextLine();
                                break;
                                case "video":
                                ElementiMultimediali[] storeVideo = new ElementiMultimediali[store.length + 1];
                                System.out.println("inserisci titolo video");
                                resp = input.nextLine();
                                Video b = new Video(resp);
                                System.out.println("inserisci durata video");
                                resp = input.nextLine();
                                b.setDurata(Integer.parseInt(resp));
                                for (int i = 0; i < storeVideo.length; i++) {
                                if (i == storeVideo.length -1) {
                                storeVideo[i] = b;
                                    }else {
                                storeVideo[i] = store[i];
                                    }
                                }
                                store = storeVideo;
                                System.out.println("immagine inserita con successo");
                                System.out.println("la tua libreria contiene: " + store.length + " elementi");
                                System.out.println("(1) inserire un altro elemento, (2) accedi al menu selezione");
                                resp = input.nextLine();
                                break;
                            case "mp3":
                                ElementiMultimediali[] storeMp3 = new ElementiMultimediali[store.length + 1];
                                System.out.println("inserisci titolo mp3");
                                resp = input.nextLine();
                                RegistrazioneAudio c = new RegistrazioneAudio(resp);
                                System.out.println("inserisci durata registrazione");
                                resp = input.nextLine();
                                c.setDurata(Integer.parseInt(resp));
                                for (int i = 0; i < storeMp3.length; i++) {
                                    if (i == storeMp3.length -1) {
                                        storeMp3[i] = c;
                                    }else {
                                        storeMp3[i] = store[i];
                                        }
                                }
                                store = storeMp3;
                                System.out.println("Audio inserito con successo");
                                System.out.println("la tua libreria contiene: " + store.length + " elementi");
                                System.out.println("(1) inserire un altro elemento, (2) accedi al menu selezione");
                                resp = input.nextLine();
                                break;
            }




        }
    }
}