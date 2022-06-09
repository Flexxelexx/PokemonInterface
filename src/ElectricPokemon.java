import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final static String TYPE = "electric";

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "voltTackle");

    List<String> getAttacks() {
        return attacks;
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunderpunch");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electroball");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volttackle");
    }
}
