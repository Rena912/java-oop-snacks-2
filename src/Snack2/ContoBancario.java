package Snack2;

public class ContoBancario{
    
    private int saldo;
    
    private int numeroConto;
    
    public void deposita(int importo) {
        saldo += importo;
    }
    
    public void preleva(int importo) {
        if (saldo >= importo){
            saldo += importo;
        } else {
            System.out.println("Non è possibile prelevare per fondi insufficenti");
        }
    }
    
    public int getSaldo() {
    return saldo;
    }
    
    public int getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public ContoBancario (int numeroConto, float saldo){
        this.numeroConto = numeroConto;
        this.saldo = (int) saldo;

    }
    

    




}
