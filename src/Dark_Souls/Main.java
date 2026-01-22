package Dark_Souls;

public class Main {
    public static void main(String[] args) {
        // Crear armas
        Arma espada = new Arma("Espada Larga", 15);
        Arma garrote = new Arma("Garrote Hollow", 10);

        // Crear personajes
        Jugador jugador = new Jugador("Solaire", 100, espada, 5);
        Enemigo enemigo = new Enemigo("Hollow", 50, garrote, "Hollow Básico");

        // Combate simulado
        System.out.println("¡Comienza el combate!\n");

        jugador.atacar(enemigo);
        enemigo.atacar(jugador);

        jugador.subirNivel();

        System.out.println("\nEstado final:");
        System.out.println("Jugador vivo: " + jugador.estaVivo() + ", Vida: " + jugador.vida + ", Nivel: " + jugador.getNivel());
        System.out.println("Enemigo vivo: " + enemigo.estaVivo() + ", Vida: " + enemigo.vida);
    }
}
