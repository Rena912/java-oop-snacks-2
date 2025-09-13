package Snack2;

public class Main {

    public static void main(String[] args) {
        ContoRisparmio conto = new ContoRisparmio(5433452, 2000, 20);
        conto.interessi();
        conto.preleva(1000);

        System.out.println("Saldo : " + getSaldo() );
    }


    
}
