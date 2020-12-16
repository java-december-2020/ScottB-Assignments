import java.util.ArrayList;
public abstract class AbstractPokemon implements PokemonInterface{
    ArrayList<Pokemon> poke = new ArrayList<Pokemon>();

    public Pokemon createPokemon(String name, int health, String type){
        Pokemon pokeTwo = new Pokemon(name, health, type);
        this.poke.add(pokeTwo);
        return pokeTwo; 
    }
    
    public abstract String pokemonInfo(Pokemon pokemon);
}