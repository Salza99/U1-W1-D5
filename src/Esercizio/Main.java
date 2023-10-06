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
    
    public static void runApplication(){
        boolean open = true;
        ElementiMultimediali[] store = new ElementiMultimediali[]{};
        Scanner input = new Scanner(System.in);
        System.out.println("Iniziamo creando la tua libreria di 5 oggetti,");
        System.out.println("potrai scegliere se aggiungere video, immagini o registrazioni audio");
        System.out.println("scegli se inserire: ");
        System.out.println("un'immagine(img), un video(video), una traccia audio(mp3) o uscire dal programma(0)");
        String resp = input.nextLine();
        while (open) {if (resp.equals("1")){
            System.out.println("scegli se inserire: ");
            System.out.println("un'immagine(img), un video(video), una traccia audio(mp3) oppure 2 per accedere alla tua libreria e 0 per uscire dal programma");
            resp = input.nextLine();
        } else if (resp.equals("2")) {
            boolean openMenu = true;
            while (openMenu) {
                System.out.println("Benvenuto dai un'occhiata alla tua libreria");
                System.out.println("Al momento contiene: " + store.length + " elementi");
                System.out.println("premi 1 per inserire un nuovo elemento, 2 per visualizzarli");
                resp = input.nextLine();
                if (resp.equals("1")){
                    break;
                } else if (resp.equals("2")) {
                    System.out.println("i tuoi contenuti sono: ");
                    System.out.println(store.toString());
                }
                else {

                    resp = "2";
                }
            }
        }else {resp = "1";}


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