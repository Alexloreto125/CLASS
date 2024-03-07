package ES1;

public class Main1 {
    public static  void  main(String[] args){
        Rettangolo r1= new Rettangolo(20,5.7);
        stampaRettangolo(r1);

        Rettangolo r2= new Rettangolo(12, 40.12);
        stampaDueRettangoli(r1,r2);


    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Perimetro Rettangolo: "+ rettangolo.perimetro());
        System.out.println("Area Rettangolo: "+ rettangolo.area());
    }
    public static void  stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo1: " );
        stampaRettangolo(rettangolo1);
        System.out.println("Rettangolo2: " );
        stampaRettangolo(rettangolo2);

        double sommaAree= rettangolo1.area()+ rettangolo2.area();
        double sommaPerimetri= rettangolo1.perimetro() + rettangolo2.perimetro();


        System.out.println("Somma Perimetri: "+ sommaPerimetri);

        System.out.println("Somma aree: "+ sommaAree);


    }
}
