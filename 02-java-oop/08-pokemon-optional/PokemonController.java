public class PokemonController{
    public static void main(String[] args){
        Pokemon bluePoke = new Pokemon("Blue", 50, "short");
        Pokemon greenPoke = new Pokemon("Green", 100, "tall"); 
        Pokedex anyPoke = new Pokedex();


        bluePoke.attackPokemon(greenPoke);
        System.out.println(greenPoke.getHealth());
        System.out.println(anyPoke.pokemonInfo(greenPoke));
        System.out.println(Pokemon.count);
    }
}