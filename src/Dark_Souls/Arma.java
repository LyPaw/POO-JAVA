package Dark_Souls;

public class Arma {
    private String nombre;
    private int danio;

    public Arma(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public int getDanio() {
        return danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Arma: " + nombre + " | Daño: " + danio);
    }
}
