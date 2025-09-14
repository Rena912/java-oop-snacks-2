package Snack2;

public class ContoRisparmio extends ContoBancario {
    
    private int tassoInteresse;



    public int getTassoInteresse() {
        return tassoInteresse;
    }

    public void setTassoInteresse(int tassoInteresse) {
        this.tassoInteresse = 10;
    }

    public ContoRisparmio(int numeroConto, float saldo, int tassoInteresse){
        super(numeroConto, saldo);
        this.tassoInteresse = tassoInteresse;
    }

    public void interessi() {
        deposita(getSaldo() / 100 * tassoInteresse);
    }


}
