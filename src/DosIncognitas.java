public class DosIncognitas {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    //Constructor
    public DosIncognitas(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }


    //Set-Get
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public double getE() {
        return e;
    }
    public void setE(double e) {
        this.e = e;
    }
    public double getF() {
        return f;
    }
    public void setF(double f) {
        this.f = f;
    }

    public boolean resoluble(){
        return a*b - b*c != 0;
    }

    public double valorX(){
        return ((e*d - b*f)/(a*d - b*c));
    }

    public double valorY(){
        return ((a*f - e*c)/(a*d - b*c));
    }

    public String toString(){
        return "Solucion: " + "x: " + valorX() + "e Y: " + valorY();
    }
}
