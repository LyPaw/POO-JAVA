package Ejercicio_Clase;

public record Triangulo(double a, double b, double h) {

// Formulas
    public double hipotenusa() {

        return (Math.sqrt(a*a + b*b));
    }

    public double are() {
        return (a*b) / 2;
    }

    public double perimetro() {
        return a + b + h;
    }



}
