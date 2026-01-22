package Dark_Souls;

public class Enemigo extends Personaje {
    private String tipo;

    public Enemigo(String nombre, int vida, Arma arma, String tipo) {
        super(nombre, vida, arma); // llama al constructor del padre
        this.tipo = tipo;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " (" + tipo + ") ataca con " + arma.getNombre() + " causando " + arma.getDanio() + " de daño!");
        objetivo.recibirDanio(arma.getDanio());
    }

    public String getTipo() {
        return tipo;
    }
}

