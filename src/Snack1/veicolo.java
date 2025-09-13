package Snack1;

public class veicolo {

    public String marca;

    public int anno;

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }


    public veicolo(String marca,int anno){
        this.marca = marca;
        this.anno = anno;
    }

    public void stampaInfo() {
        System.out.println("Marca: " + marca + ", Anno: " + anno);
    }
    
}
