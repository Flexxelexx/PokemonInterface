import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;

    FirePokemon charizard = new FirePokemon("charizard", 35, 100, "meat", "charrrr");
    WaterPokemon blastoise = new WaterPokemon("blastoise", 40, 100, "meat", "blaaaast");
    WaterPokemon gyarados = new WaterPokemon("gyarados", 45, 100, "fish", "gyaradoooooss");
    GrassPokemon venusaur = new GrassPokemon("venusaur", 50, 100, "grass", "venusaaaaauuur");
    GrassPokemon ditto = new GrassPokemon("ditto", 55, 100, "grass", "ditttooooo");

    ElectricPokemon raichu = new ElectricPokemon("raichu", 60, 100, "thunderbolts", "raichuuuuuu");


    List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, gyarados, venusaur, ditto, raichu);

    public PokemonTrainer(String name) {
        this.name = name;
    }


    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
