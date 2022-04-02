package wieloboki;

public class Prostokat{
    
    public double bok1=0;
    public double bok2=0;

    public Prostokat(double b1,double b2){
        this.bok1=b1;
        this.bok2=b2;
    }

    public double przekatna(double additionalValue){
        double przekatna=0;
        przekatna=(Math.sqrt((bok1 * bok1) + (bok2 * bok2)) * additionalValue);
        return przekatna;
    }

    public double przekatna(){
        double przekatna=0;
        przekatna=(Math.sqrt((bok1 * bok1) + (bok2 * bok2)));
        return przekatna;
    }
}