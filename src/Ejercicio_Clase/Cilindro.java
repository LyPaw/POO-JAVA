package Ejercicio_Clase;

public class Cilindro {
    private final double pi = 3.14;
    private double r;
    private double h;

    public Cilindro(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return this.h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double calculoVolumen() {
        return 3.14 * this.r * this.r * this.h;
    }

    public double calculoSuperficie() {
        return 6.28 * this.r * this.r + 6.28 * this.r * this.h;
    }

    public String toString() {
        double var10000 = this.r;
        return "Cilindro{r=" + var10000 + ", h=" + this.h + "Volumen" + this.calculoVolumen() + ", Superficie=" + this.calculoSuperficie() + "}";
    }
}

