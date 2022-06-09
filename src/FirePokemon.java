import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final static String TYPE = "fire";

    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroBall", "inferno");

    List<String> getAttacks() {
        return attacks;
    }

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Firelash");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flamethrower");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyroball");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno");
    }


}
