package Dark_Souls;


public class Jugador extends Personaje {
    private int nivel;

    public Jugador(String nombre, int vida, Arma arma, int nivel) {
        super(nombre, vida, arma); // llama al constructor del padre
        this.nivel = nivel;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca con " + arma.getNombre() + " causando " + arma.getDanio() + " de daño!");
        objetivo.recibirDanio(arma.getDanio());
    }

    public void subirNivel() {
        nivel++;
        System.out.println(nombre + " sube al nivel " + nivel);
    }

    public int getNivel() {
        return nivel;
    }
}

