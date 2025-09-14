package Snack2;

public class Main {

    public static void main(String[] args) {
        ContoRisparmio conto = new ContoRisparmio(5433452, 7000, 20);
        conto.interessi();
        conto.preleva(0);
        conto.deposita(1000);
        System.out.println("Saldo : " + conto.getSaldo() );
    }
    

    
}
