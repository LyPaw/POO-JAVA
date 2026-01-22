public class Cilindro {


    private final double pi = 3.14;
    private double r;
    private double h;


    /* CONSTRUCTOR*/
    public Cilindro(double r, double h) {
        this.r = r;
        this.h = h;

    }

    /* Get-Set*/
    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double getH(){
       return h;

    }

    public void setH(double h){
        this.h = h;
    }


    public double calculoVolumen(){
        return pi*(r*r)*h;
    }

    public double calculoSuperficie(){
        return (2*pi*(r*r) + (2*pi*r*h));
    }

    public String toString(){
        return "Cilindro{" + "r=" + r + ", h=" + h + "Volumen" + calculoVolumen() + ", Superficie=" + calculoSuperficie() + "}";
    }
}
