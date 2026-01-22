public class EcuacionesSegundoGrado {

    private double a;
    private double b;
    private double c;

    public EcuacionesSegundoGrado(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

    public double valorX1(){
        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        return x1;
    }

    public double valorX2(){
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        return x2;
    }

    public String toString(){

        return "Los valores son:" + getA() +","+ getB() +","+ getC()  +","+ "El resultado es: " + valorX1() +","+ valorX2();
    }
}
