import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    String name = "raichu";
    String type = "electric";

    List <String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");


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
