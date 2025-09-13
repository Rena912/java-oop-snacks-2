import Snack1.auto;

public class App {
    public static void main(String[] args) throws Exception {
        /*Crea una classe Veicolo con i campi privati marca e anno. 
        Crea una sottoclasse Auto con un campo aggiuntivo numeroPorte.
        Usa costruttori per inizializzare gli attributi.
        Fornisci metodi get e set per tutti i campi.
        Scrivi un metodo stampaInfo() in Veicolo, e sovrascrivilo in Auto.
        */
        auto auto = new auto("Alfa Romeo", 2014, 5);
        auto.stampaInfo();


        

    }
}
