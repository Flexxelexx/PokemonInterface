import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final static String TYPE = "grass";

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    List<String> getAttacks() {
        return attacks;
    }

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leafstorm");
    }

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solarbeam");
    }

    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leechseed");
    }

    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaveblade");
    }
}
