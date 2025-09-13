package Snack1;

import Veicolo.veicolo;
import java.time.Year;

public class auto extends veicolo {

    public int numeroPorte;
    
    public auto(String marca, int anno, int numeroPorte) {
        super(marca, anno);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public void stampaInfo() {
        super.stampaInfo();
        System.out.println("Numero Porte: " + numeroPorte);

    }

}
