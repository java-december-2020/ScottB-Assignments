public class Pokedex extends AbstractPokemon{

    public void listPokemon(){
        for (int i = 0; i < poke.size(); i++){
            System.out.println(poke.get(i).getName());
        }
    }

    public String pokemonInfo(Pokemon pokemon){
        return "This poke is " + pokemon.getType() + " with health of " + pokemon.getHealth();
    }

}