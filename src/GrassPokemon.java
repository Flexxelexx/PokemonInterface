import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    String name1 = "venusaur";
    String name2 = "ditto";

    String type = "grass";

    List <String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leafblade");


    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
