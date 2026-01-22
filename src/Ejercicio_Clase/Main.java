package Ejercicio_Clase;

public class Main {
    public static void main(String[] args) {
        Cilindro cil1 = new Cilindro(5,9.2);

        System.out.println(cil1);
        System.out.println(cil1.calculoVolumen());
        System.out.println(cil1.calculoSuperficie());



        Triangulo tri = new Triangulo(3,6,2.5);

        System.out.println(tri);

        System.out.println(tri.hipotenusa());
        System.out.println(tri.are());
        System.out.println(tri.perimetro());



        EcuacionesSegundoGrado ec1 = new EcuacionesSegundoGrado(2,3,2);
        System.out.println(ec1);


        DosIncognitas dos = new DosIncognitas(1,1,1,-1,5,1);
        System.out.println(dos);
    }
}