import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    String name = "charizard";
    String type = "fire";

    List <String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
}
