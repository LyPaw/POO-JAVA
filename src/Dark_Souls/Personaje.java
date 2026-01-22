package Dark_Souls;

public abstract class Personaje {

    //Variables
    protected String nombre;
    protected int vida;
    protected Arma arma;

    //Constructor
    public Personaje(String nombre, int vida, Arma arma) {
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

    //Metodos
    public abstract void atacar(Personaje objetivo);

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibe " + danio + " de daño. Vida restante: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}

