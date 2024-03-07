package ES1;

public class Rettangolo {
    private double altezza;
    private double lunghezza;
    public Rettangolo(double alt, double lung){
        this.altezza= alt;
        this.lunghezza= lung;
    }

    public double area(){
        return altezza + lunghezza;

    }

    public double  perimetro() {
        return (altezza+ lunghezza) * 2;

    }
}
