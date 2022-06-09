import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final static String TYPE = "water";

    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    List<String> getAttacks() {
        return attacks;
    }

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf");
        int temp = 0;
        switch (enemy.getType()) {
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");

        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydropump");
        int temp = 0;
        switch (enemy.getType()) {
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");

        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydrocanon");
        int temp = 0;
        switch (enemy.getType()) {
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");

        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Raindance");
        int temp = 0;
        switch (enemy.getType()) {
            case "water":
                temp = enemy.getHp() -10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 10 hp");
            case "fire":
                temp = enemy.getHp() -40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 40 hp");
            case "electric":
                temp = enemy.getHp() -30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 30 hp");
            case "grass":
                temp = enemy.getHp() -20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " loses 20 hp");

        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
}