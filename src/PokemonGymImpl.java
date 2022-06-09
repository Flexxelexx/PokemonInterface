public class PokemonGymImpl implements PokemonGym{
    private String village;

    public PokemonGymImpl (String village) {
        this.village = village;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
