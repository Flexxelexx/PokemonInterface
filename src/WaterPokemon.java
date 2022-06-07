import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    String blastoise = "blastoise";
    String gyarados = "gyarados";
    String type = "water";

    List <String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");


    public String getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(String blastoise) {
        this.blastoise = blastoise;
    }

    public String getGyarados() {
        return gyarados;
    }

    public void setGyarados(String gyarados) {
        this.gyarados = gyarados;
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

    void surf(Pokemon blastoise, Pokemon enemy) {

    }
}
